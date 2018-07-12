package com.example.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the personas database table.
 * 
 */
@Entity
@Table(name="personas")
@NamedQuery(name="Persona.findAll", query="SELECT p FROM Persona p")
public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int idpersonas;

	@Column(nullable=false, length=45)
	private String apellido1;

	@Column(length=45)
	private String apellido2;

	@Column(length=20)
	private String dni;

	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;

	@Column(nullable=false, length=45)
	private String nombre;

	//bi-directional many-to-one association to Direccione
	@OneToMany(mappedBy="persona")
	private List<Direccione> direcciones;

	//bi-directional many-to-one association to Empleado
	@ManyToOne
	@JoinColumn(name="idEmpleado")
	private Empleado empleado;

	//bi-directional many-to-one association to Telefono
	@OneToMany(mappedBy="persona")
	private List<Telefono> telefonos;

	public Persona() {
	}

	public int getIdpersonas() {
		return this.idpersonas;
	}

	public void setIdpersonas(int idpersonas) {
		this.idpersonas = idpersonas;
	}

	public String getApellido1() {
		return this.apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return this.apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Direccione> getDirecciones() {
		return this.direcciones;
	}

	public void setDirecciones(List<Direccione> direcciones) {
		this.direcciones = direcciones;
	}

	public Direccione addDireccione(Direccione direccione) {
		getDirecciones().add(direccione);
		direccione.setPersona(this);

		return direccione;
	}

	public Direccione removeDireccione(Direccione direccione) {
		getDirecciones().remove(direccione);
		direccione.setPersona(null);

		return direccione;
	}

	public Empleado getEmpleado() {
		return this.empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public List<Telefono> getTelefonos() {
		return this.telefonos;
	}

	public void setTelefonos(List<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public Telefono addTelefono(Telefono telefono) {
		getTelefonos().add(telefono);
		telefono.setPersona(this);

		return telefono;
	}

	public Telefono removeTelefono(Telefono telefono) {
		getTelefonos().remove(telefono);
		telefono.setPersona(null);

		return telefono;
	}

}