package com.servicioCuentasBancarias.Banco.servicio;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="usuarios", url="http://localhost:8089/api")
public interface ServicioFeignClient {

	@GetMapping
	public ResponseEntity<Integer> consultaId(@RequestParam("correo") String correo);
	
}
