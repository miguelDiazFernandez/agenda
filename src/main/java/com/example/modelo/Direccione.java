package com.example.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the direcciones database table.
 * 
 */
@Entity
@Table(name="direcciones")
@NamedQuery(name="Direccione.findAll", query="SELECT d FROM Direccione d")
public class Direccione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int iddirecciones;

	@Column(nullable=false, length=45)
	private String codPostal;

	@Column(nullable=false, length=45)
	private String direccion;

	@Column(nullable=false, length=45)
	private String localidad;

	@Column(nullable=false, length=45)
	private String provincia;

	//bi-directional many-to-one association to Persona
	@ManyToOne
	@JoinColumn(name="idPersona")
	private Persona persona;

	public Direccione() {
	}

	public int getIddirecciones() {
		return this.iddirecciones;
	}

	public void setIddirecciones(int iddirecciones) {
		this.iddirecciones = iddirecciones;
	}

	public String getCodPostal() {
		return this.codPostal;
	}

	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getLocalidad() {
		return this.localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return this.provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

}