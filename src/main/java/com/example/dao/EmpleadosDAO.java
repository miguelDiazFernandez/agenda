package dao;

import java.util.LinkedList;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


public class EmpleadosDAO  implements Idao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public EmpleadosDAO (){
		
	}
	
	public EmpleadosDAO (sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	@Transactional
	public  LinkedList <Empleados> getListEmpleados(){
		Linkedlist <Empleados> listaEmpleados = (LinkedList<Empleados>) sessionFactory.getCurrentSession ()
				.createCriteria (Empleados.Class)
				.setResultTransformer (Criteria.DISTINCT_ROOT_ENTITY).list();
		return listaEmpleados;
	}
	
	@Override
	@Transactional
	public void add(Empleado empleado){
		sessionFactory.getCurrentSession().save(empleado);
	}
	
	@Override
	@Transactional
	public void update(Empleado empleado){
		sessionFactory.getCurrentSession().update(empleado);
	}
	
	@Override
	@Transactional
	public void delete(int id){
		Empleado emplBorrar = new Empleado();
		emplBorrar.setId (id);
		sessionFactory.getCurrentSession().delete(emplBorrar);
	}
	
	@Override
	@Transactional
	public Empleados getObject(int id){
		String hql = "from Empleado where id="+id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Empleado> listEmpl = (List<Empleado>) query.list();
		if (ListEmpl != null && !listEmpl.isEmpty()){
			return listEmpl.get(0);
		}
		return null;
	}

}
