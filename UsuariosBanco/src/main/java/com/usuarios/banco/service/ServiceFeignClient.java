package com.usuarios.banco.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.usuarios.banco.model.CuentasUsuario;

@FeignClient(name="cuentas", url="http://localhost:8090/cuentasBancarias")
public interface ServiceFeignClient {

	
	@GetMapping(value="cuentas/usuario/{id}")
	public ResponseEntity<List<CuentasUsuario>> cuentasUsuario(@RequestParam("id") String id);
	
}
