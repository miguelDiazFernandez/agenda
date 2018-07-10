package com.example.servicios;

import java.util.LinkedList;


public interface IServicios<T> {

	public void add(T object);

	
	public void update (T object);
	
	public T getObject(int id);
	
	public void delete (T object);
	
	
	
	 public LinkedList<Empleados> getListEmpleados ();
}
