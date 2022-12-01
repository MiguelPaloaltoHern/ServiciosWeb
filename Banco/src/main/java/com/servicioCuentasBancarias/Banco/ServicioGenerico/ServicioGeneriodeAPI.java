package com.servicioCuentasBancarias.Banco.ServicioGenerico;

import java.io.Serializable;
import java.util.List;

import com.servicioCuentasBancarias.Banco.modelo.Cuenta;

public interface ServicioGeneriodeAPI<T, ID extends Serializable> {
	
	T save(T entity);
	
	void delete(ID id);
	
	T get(ID id);
	
	List<T> getAll();
	
	List<Cuenta> cuentasUsuario(Integer id);

}
