package com.usuarios.banco.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@Table(name = "Users")
public class Usuario {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		
		private String nombre;
		@JsonProperty(value="apellidoPaterno")
		@Column(name="apellido_paterno")
		private String apellidoPaterno;
		@Column(name="apellido_materno")
		private String apellidoMaterno;
		@Column(name="correo_electronico")
		private String correoElectronico;
		private String telefono;
		private int   edad;
		private String direccion;
		
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellidopaterno() {
			return apellidoPaterno;
		}
		public void setApellidopaterno(String apellidopaterno) {
			this.apellidoPaterno = apellidopaterno;
		}
		public String getApellidoMaterno() {
			return apellidoMaterno;
		}
		public void setApellidoMaterno(String apellidoMaterno) {
			this.apellidoMaterno = apellidoMaterno;
		}
		public String getCorreoElectronico() {
			return correoElectronico;
		}
		public void setCorreoElectronico(String correoElectronico) {
			this.correoElectronico = correoElectronico;
		}
		public String getTelefono() {
			return telefono;
		}
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		
		@Override
		public String toString() {
			return "Usuario [id=" + id + ", nombre=" + nombre + ", apellidopaterno=" + apellidoPaterno
					+ ", apellidoMaterno=" + apellidoMaterno + ", correoElectronico=" + correoElectronico + ", telefono="
					+ telefono + ", edad=" + edad + ", direccion=" + direccion + "]";
		}
		
	
}
