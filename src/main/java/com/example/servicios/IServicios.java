package com.example.servicios;

import java.util.LinkedList;
import java.util.List;

import com.example.modelo.Empleado;




public interface IServicios<T> {

	public void add(T object);

	
	public void update (T object);
	
	public T getObject(int id);
	
	public void delete (int object);
	
	
	
	 public List<Empleado> getListEmpleados ();
}
