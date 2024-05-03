package com.tibame.tutorial.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tibame.tutorial.vo.Dept;

@Repository
@Transactional
public class DeptDAO {
	
	private static final String GET_ALL_STMT = "SELECT * FROM DEPT ORDER BY DEPTNO";

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional(readOnly = true)
	public List<Dept> getAll() {
		Session session = sessionFactory.getCurrentSession();
		return session.createNativeQuery(GET_ALL_STMT, Dept.class).getResultList();
	}
	
	@Transactional(readOnly = true)
	public Dept getOne(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Dept.class, id);
	}
	
	public void insert(Dept dept) {
		sessionFactory.getCurrentSession().save(dept);
	}
	
	public void update(Dept dept) {
		sessionFactory.getCurrentSession().update(dept);
	}
	
	public void delete(Integer id) {
		Dept vo = new Dept();
		vo.setDeptno(id);
		Session session = sessionFactory.getCurrentSession();
		session.delete(vo);
	}

}
