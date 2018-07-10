package com.example.servicios;

import java.util.LinkedList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.EmpleadosDAO;
import com.example.modelo.Empleado;

@Service
@Transactional

public class Servicios implements IServicios {
	
	
	@Autowired
	private EmpleadosDAO empleadosDAO;
	
	 /**

     * Constructor para la capa

     * @param ListEmpleados conseguirla para listar los distintos empleados con el linked

     */
	@Override
	public LinkedList<Empleado> getListEmpleados(){		
		return empleadosDAO.getListEmpleados();
  }

	@Override
	public void add(Object object) {
		// TODO Auto-generated method stub
		empleadosDAO.add(object);
	}

	@Override
	public void update(Object object) {
		// TODO Auto-generated method stub
		empleadosDAO.update(object);
	}

	@Override
	public Object getObject(int id) {
		// TODO Auto-generated method stub
		return empleadosDAO.getObject(id);
	}

	@Override
	public void delete(int object) {
		// TODO Auto-generated method stub
		empleadosDAO.delete(object);
	}
	
	
}//cierre de la capa de servicios
