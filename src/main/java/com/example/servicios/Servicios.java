package com.example.servicios;

import java.util.LinkedList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.dao.EmpleadosDAO;
import com.example.dao.Idao;
import com.example.modelo.Categoria;
import com.example.modelo.Empleado;

@Service
@Transactional
public class Servicios implements IServicios {
	
	
	@Autowired
	private Idao empleadosDAO;
	
	 /**

     * Constructor para la capa

     * @param ListEmpleados conseguirla para listar los distintos empleados con el linked

     */
	public Servicios (@ModelAttribute EmpleadosDAO empleados){
		this.empleadosDAO=empleados;
	}
	
	@Override
	public List<Categoria> getListEmpleados(){		
		System.out.println("--- Inside getListaEmpleados");
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
