package com.servicioCuentasBancarias.Banco.ServicioImplementacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.servicioCuentasBancarias.Banco.ServicioGenerico.ServicioGenericoImplementacion;
import com.servicioCuentasBancarias.Banco.dao.RepositorioCuentas;
import com.servicioCuentasBancarias.Banco.modelo.Cuenta;
import com.servicioCuentasBancarias.Banco.servicio.ServicioCuentasBancarias;
import com.servicioCuentasBancarias.Banco.servicio.ServicioFeignClient;

@Service
public class ServicioCuentasImplementacion extends ServicioGenericoImplementacion<Cuenta, String> implements ServicioCuentasBancarias {

	@Autowired
	private RepositorioCuentas cuentasRepositorio;
	
	@Autowired
	private ServicioFeignClient servicioCliente;
	
	@Override
	public CrudRepository<Cuenta, String> getDao() {
		
		return cuentasRepositorio;
	}
	
	public ResponseEntity<Integer> buscarId(String correo) {
		
		return servicioCliente.consultaId(correo);
		
	}
	

}
