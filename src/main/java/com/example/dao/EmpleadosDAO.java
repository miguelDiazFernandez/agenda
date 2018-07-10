package com.example.dao;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.modelo.Empleado;


public class EmpleadosDAO  implements Idao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public EmpleadosDAO (){
		
	}
	
	public EmpleadosDAO (sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	@Transactional
	public  LinkedList <Empleado> getListEmpleados(){
		Linkedlist <Empleado> listaEmpleados = (LinkedList<Empleado>) sessionFactory.getCurrentSession ()
				.createCriteria (Empleado.Class)
				.setResultTransformer (Criteria.DISTINCT_ROOT_ENTITY).list();
		return listaEmpleados;
	}
	
	@Override
	@Transactional
	public void add(Object empleado){
		sessionFactory.getCurrentSession().save(empleado);
	}
	
	@Override
	@Transactional
	public void update(Object empleado){
		sessionFactory.getCurrentSession().update(empleado);
	}
	
	@Override
	@Transactional
	public void delete(int id){
		Empleado emplBorrar = new Empleado();
		emplBorrar.setIdempleados (id);
		sessionFactory.getCurrentSession().delete(emplBorrar);
	}
	
	@Override
	@Transactional
	public Empleado getObject(int id){
		String hql = "from Empleado where id="+id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Empleado> listEmpl = (List<Empleado>) query.list();
		if (ListEmpl != null && !listEmpl.isEmpty()){
			return listEmpl.get(0);
		}
		return null;
	}

	

}
