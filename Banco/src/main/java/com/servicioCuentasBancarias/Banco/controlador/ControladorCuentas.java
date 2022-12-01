package com.servicioCuentasBancarias.Banco.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servicioCuentasBancarias.Banco.ServicioImplementacion.ServicioCuentasImplementacion;
import com.servicioCuentasBancarias.Banco.modelo.Cuenta;
import com.servicioCuentasBancarias.Banco.servicio.ServicioCuentasBancarias;

@RestController
@RequestMapping("/cuentasBancarias")
@CrossOrigin("*")
public class ControladorCuentas {
	
	@Autowired
	private ServicioCuentasBancarias servicioCuentas;
	
	@Autowired
	private ServicioCuentasImplementacion servicioid;

	@GetMapping(value="/cuentas")
	public List<Cuenta> CuentasUsuario(){
		return servicioCuentas.getAll();
	}
	
	@GetMapping(value="cuentas/usuario/{id}")
	public List<Cuenta> Cuentas(@PathVariable("id") Integer id){
		return servicioCuentas.cuentasUsuario(id);
	}
	
	
	@GetMapping(value="/buscar/{id}")
	public Cuenta buscar(@PathVariable String id) {
		return servicioCuentas.get(id);
	}
	
	@PostMapping(value="/inserta")
	public ResponseEntity<Cuenta> guarda(@RequestBody Cuenta cuentas){
		
		ResponseEntity<Integer> Id = servicioid.buscarId(cuentas.getCorreo());
		
		if(Id.getBody() !=null) {
			cuentas.setIdUsuario(Id.getBody());
			Cuenta obj = servicioCuentas.save(cuentas);
			return new ResponseEntity<Cuenta>(obj, HttpStatus.OK);
		}
		
		throw new RuntimeException("Este usuario no existe");
	}
	
	@DeleteMapping(value = "/eliminar/{id}")
	public ResponseEntity<Cuenta> elimina(@PathVariable String id){
		Cuenta cuenta = servicioCuentas.get(id);
		if(cuenta != null) {
			servicioCuentas.delete(id);
		} else {
			return new ResponseEntity<Cuenta>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<Cuenta>(cuenta, HttpStatus.OK);
	}
	
}
