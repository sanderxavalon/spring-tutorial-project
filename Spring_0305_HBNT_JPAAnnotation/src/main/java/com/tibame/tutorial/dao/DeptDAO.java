package com.tibame.tutorial.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
	
	private static final String GET_ALL_STMT = "from Dept order by deptno";

    @PersistenceContext
    private EntityManager em;

	@Transactional(readOnly = true)
	public List<Dept> getAll() {
		return em.createQuery(GET_ALL_STMT, Dept.class).getResultList();
	}
	
	@Transactional(readOnly = true)
	public Dept getOne(Integer id) {
		return em.find(Dept.class, id);
	}
	
	public void insert(Dept dept) {
		em.persist(dept);
	}
	
	public void update(Dept dept) {
		em.merge(dept);
	}
	
	public void delete(Integer id) {
		Dept vo = new Dept();
		vo.setDeptno(id);
		Dept vo2 = em.merge(vo);
		em.remove(vo2);
	}

}
