package com.servicioCuentasBancarias.Banco.ServicioGenerico;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.servicioCuentasBancarias.Banco.dao.RepositorioCuentas;
import com.servicioCuentasBancarias.Banco.modelo.Cuenta;

@Service
public abstract class ServicioGenericoImplementacion<T, ID extends Serializable> implements ServicioGeneriodeAPI<T, ID> {
	
	@Autowired
	private RepositorioCuentas repositorioCuentas;

	@Override
	public T save(T entity) {
		return getDao().save(entity);
	}

	@Override
	public void delete(ID id) {
		getDao().deleteById(id);
		
	}

	@Override
	public T get(ID id) {
		Optional<T> obj = getDao().findById(id);
		if (obj.isPresent()) {
			return obj.get();
		}
		return null;
	}

	@Override
	public List<T> getAll() {
		List<T>  lista = new ArrayList<>();
		getDao().findAll().forEach(obj -> lista.add(obj));
		return lista;
	}
	
	@Override
	public List<Cuenta> cuentasUsuario(Integer id){
		
		List<Cuenta> listaCuentas = repositorioCuentas.findByIdUsuario(id);
		return listaCuentas;
	}
	
	public abstract CrudRepository<T, ID> getDao();
	

}
