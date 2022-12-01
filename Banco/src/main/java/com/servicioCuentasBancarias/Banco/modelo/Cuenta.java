package com.servicioCuentasBancarias.Banco.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Cuentas")
public class Cuenta {

	@Id
	private String id;
	private String nombreDeLaCuenta;
	private String banco;
	private String tipo;
	private double monto;
	private Integer idUsuario;
	@Transient
	private String correo;
	
	public Cuenta() {
		super();
	}
	
	public Cuenta(String id, String nombreDeLaCuenta, String banco, String tipo, double monto, Integer idUsuario) {
		super();
		this.id = id;
		this.nombreDeLaCuenta = nombreDeLaCuenta;
		this.banco = banco;
		this.tipo = tipo;
		this.monto = monto;
		this.idUsuario = idUsuario;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombreDeLaCuenta() {
		return nombreDeLaCuenta;
	}
	public void setNombreDeLaCuenta(String nombreDeLaCuenta) {
		this.nombreDeLaCuenta = nombreDeLaCuenta;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
}
