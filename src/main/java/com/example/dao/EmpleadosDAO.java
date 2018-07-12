package com.example.dao;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.example.modelo.Categoria;
import com.example.modelo.Empleado;

@Repository
public class EmpleadosDAO implements Idao {

	@PersistenceContext
	private EntityManager entityManager;

	public EmpleadosDAO() {

	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Categoria> getListEmpleados() {
		System.out.println("--- Inside getListEmpleados");
		/*
		return (LinkedList<Categoria>)(entityManager.createQuery("select b FROM Categoria b", Categoria.class).getResultList());
		*/
		
		//String hql = "from Categoria";
		//System.out.println("---: " +(ArrayList<Categoria>) entityManager.createQuery(hql).getResultList());
		System.out.println("--next query");
		Query query = this.entityManager.getEntityManagerFactory().createEntityManager().createQuery("select nombre from Categoria");
		System.out.println("--- return lista categoria");
		
		return (List<Categoria>) query.getResultList();
		
		
	}
	
	
	
	

	
	
	
	

	@Override
	@Transactional
	public void add(Object empleado) {

	}

	@Override
	@Transactional
	public void update(Object empleado) {

	}

	@Override
	@Transactional
	public void delete(int id) {

	}

	@Override
	@Transactional
	public Empleado getObject(
			int id) {/*
						 * String hql = "from Empleado where id="+id; Query
						 * query =
						 * sessionFactory.getCurrentSession().createQuery(hql);
						 * List<Empleado> listEmpl = (List<Empleado>)
						 * query.list(); if (ListEmpl != null &&
						 * !listEmpl.isEmpty()){ return listEmpl.get(0); }
						 */
		return null;
	}

}
