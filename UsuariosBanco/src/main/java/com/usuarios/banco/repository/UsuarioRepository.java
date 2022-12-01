package com.usuarios.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.usuarios.banco.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

	@Query(value="select * from Users where nombre = :elemento", nativeQuery=true)
	public Usuario buscarElemento(@Param("elemento") String elemento);
	
	@Query(value="select id from Users where correo_electronico = :correo", nativeQuery = true)
	public Integer consultaIdCliente(@Param("correo") String correo);
}
