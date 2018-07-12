package com.example.dao;

import java.util.LinkedList;
import java.util.List;

public interface Idao <T>{
	public  List <T> getListEmpleados();
	public void add(T empleado);
	public void update(T empleado);
	public void delete(int id);
	public T getObject(int id);

}
