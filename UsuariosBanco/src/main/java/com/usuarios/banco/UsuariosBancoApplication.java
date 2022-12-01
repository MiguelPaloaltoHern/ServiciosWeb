package com.usuarios.banco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableDiscoveryClient
@ComponentScan({"com.usuarios.banco.service" , "com.usuarios.banco.controller", "com.usuarios.banco.serviceImp"})
@EnableJpaRepositories("com.usuarios.banco.repository")
@EnableFeignClients
@SpringBootApplication(scanBasePackages= {"com.usuarios.banco"})
public class UsuariosBancoApplication  {

	public static void main(String[] args) {
		SpringApplication.run(UsuariosBancoApplication.class, args);
	}

}
