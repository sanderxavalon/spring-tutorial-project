package com.tibame.tutorial.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tibame.tutorial.vo.Dept;

@Repository
@Transactional
public class DeptDAO {
	
	@Autowired
    private HibernateTemplate hibernateTemplate;

	@Transactional(readOnly = true)
	public List<Dept> getAll() {
		List<Dept> list = (List<Dept>)hibernateTemplate.loadAll(Dept.class);
	    return list;
	}
	
	@Transactional(readOnly = true)
	public Dept getOne(Integer id) {
		return hibernateTemplate.get(Dept.class, id);
	}
	
	public void insert(Dept dept) {
		hibernateTemplate.save(dept);
	}
	
	public void update(Dept dept) {
		hibernateTemplate.update(dept);
	}
	
	public void delete(Integer id) {
		Dept vo = new Dept();
		vo.setDeptno(id);
		hibernateTemplate.delete(vo);
	}
	
}
