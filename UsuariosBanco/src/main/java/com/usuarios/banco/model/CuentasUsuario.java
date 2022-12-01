package com.usuarios.banco.model;

public class CuentasUsuario {
	
	private String id;
	private String nombreDeLaCuenta;
	private String banco;
	private String tipo;
	private double monto;
	private Integer idUsuario;
	
	
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

	
	
	
}
