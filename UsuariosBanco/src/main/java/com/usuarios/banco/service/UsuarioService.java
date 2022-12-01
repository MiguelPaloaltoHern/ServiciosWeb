package com.usuarios.banco.service;

import java.util.List;

import com.usuarios.banco.model.Usuario;

public interface UsuarioService {
	
	public List<Usuario> listarUsuarios();

	public Usuario crearUsuario(Usuario usuario);
	
	public void eliminarUsuario(Integer id);
	
	public Usuario buscarUsuario(Integer id);
	
	public Usuario actualizarUsuario(Integer id, Usuario usuario);
	
	public Usuario buscarElementoUsuario(String elemento);
	
	public Integer consultarid(String correo);
	
	
}
