package com.servicioCuentasBancarias.Banco.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import com.servicioCuentasBancarias.Banco.modelo.Cuenta;

public interface RepositorioCuentas extends MongoRepository<Cuenta, String> {

	//@Query("{'Cuentas':{idUsuario:?id}}")
	
	//@Query("{find(idUsuario:id)}")
	//public List<Cuenta> consultaCuentas(@Param("id") Integer id);
	
	public List<Cuenta> findByIdUsuario(Integer id);
	
}	
