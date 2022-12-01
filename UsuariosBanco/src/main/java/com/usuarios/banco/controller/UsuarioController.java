package com.usuarios.banco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.usuarios.banco.model.CuentasUsuario;
import com.usuarios.banco.model.Usuario;
import com.usuarios.banco.service.UsuarioService;
import com.usuarios.banco.serviceImp.UsuarioServiceImp;

@RestController
@RequestMapping(value = "/api")
public class UsuarioController {

	@Autowired(required=true)
	private UsuarioService usuarioService;
	
	@Autowired
	private UsuarioServiceImp serviceImp;

	@PostMapping(value="usuario")
	public ResponseEntity<Usuario> creaUsuario(@RequestBody Usuario usuario) {

		Usuario user = usuarioService.crearUsuario(usuario);
		return new ResponseEntity<Usuario>(user, HttpStatus.CREATED);
	}
	
	@GetMapping(value="usuario/lista")
	public ResponseEntity<List<Usuario>> listarUsuarios(){
		
		List<Usuario> lstUsuario = usuarioService.listarUsuarios();
		
		return new ResponseEntity<List<Usuario>>(lstUsuario, HttpStatus.OK);
	}
	
	@PutMapping(value="usuario/actualiza/{id}")
	public ResponseEntity<Usuario> actualizarUsuario(@PathVariable("id") Integer id, @RequestBody Usuario usuario){
		Usuario user = usuarioService.actualizarUsuario(id, usuario);
		
		return new ResponseEntity<Usuario>(user,HttpStatus.OK);
	}
	
	@DeleteMapping(value="usuario/elimina/{id}")
	public void eliminarUsuario(@PathVariable("id") Integer id){
		
		usuarioService.eliminarUsuario(id); 
	}
	
	@GetMapping(value="usuario/nombre/{elemento}")
	public ResponseEntity<Usuario> buscarElementoUsuario(@PathVariable("elemento") String elemento){
		
		Usuario user = usuarioService.buscarElementoUsuario(elemento);
		
		return new ResponseEntity<Usuario>(user, HttpStatus.OK);
		
	}
	
	@GetMapping(value="usuario/cuentas/{id}")
	public ResponseEntity<List<CuentasUsuario>> cuentaDeUsuarios(@PathVariable("id") String id){
		ResponseEntity<List<CuentasUsuario>> cuentas = serviceImp.cuentaUsuario(id);
		
		if(cuentas.getBody()!=null) {
			return cuentas;
		}
		throw new RuntimeException("Este usuario no tiene cuentas");
	}
	
	@GetMapping
	public ResponseEntity<Integer> consultaId(@RequestParam("correo") String correo){
		
		Integer id = usuarioService.consultarid(correo);
		
		return new ResponseEntity<Integer>(id,HttpStatus.OK);
		
	}
	

}
