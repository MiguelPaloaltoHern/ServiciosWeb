package com.usuarios.banco.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.usuarios.banco.model.CuentasUsuario;
import com.usuarios.banco.model.Usuario;
import com.usuarios.banco.repository.UsuarioRepository;
import com.usuarios.banco.service.ServiceFeignClient;
import com.usuarios.banco.service.UsuarioService;

@Service
public class UsuarioServiceImp implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private ServiceFeignClient feignClient;
	
	@Override
	public List<Usuario> listarUsuarios() {
		
		return usuarioRepository.findAll();
	}

	@Override
	public Usuario crearUsuario(Usuario usuario) {
		
		return usuarioRepository.save(usuario);
	}

	@Override
	public void eliminarUsuario(Integer id) {
		
		Usuario user = usuarioRepository.findById(id).orElse(null);
		
		if(user != null) {
			usuarioRepository.deleteById(id);
		}

	}

	@Override
	public Usuario buscarUsuario(Integer id) {
		// TODO Auto-generated method stub
		return usuarioRepository.findById(id).orElse(null);
	}

	@Override
	public Usuario actualizarUsuario(Integer id, Usuario usuario) {
		// TODO Auto-generated method stub
		Usuario user = usuarioRepository.findById(id).orElse(null);
		Usuario usuarioNuevo = new Usuario();
		if(user != null) {
			usuarioNuevo.setId(id);
			usuarioNuevo.setNombre(usuario.getNombre());
			usuarioNuevo.setApellidopaterno(usuario.getApellidopaterno());
			usuarioNuevo.setApellidoMaterno(usuario.getApellidoMaterno());
			usuarioNuevo.setCorreoElectronico(usuario.getCorreoElectronico());
			usuarioNuevo.setTelefono(usuario.getTelefono());
			usuarioNuevo.setEdad(usuario.getEdad());
			usuarioNuevo.setDireccion(usuario.getDireccion());
			return usuarioRepository.save(usuarioNuevo);
		}
		return null;
	}

	@Override
	public Usuario buscarElementoUsuario(String elemento) {
		
		return usuarioRepository.buscarElemento(elemento);
	}
	
	public ResponseEntity<List<CuentasUsuario>> cuentaUsuario(String id){
		
		return feignClient.cuentasUsuario(id);
		
	}

	@Override
	public Integer consultarid(String correo) {
		
		return usuarioRepository.consultaIdCliente(correo);
	}

	
}
