package com.tibame.lab.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tibame.lab.vo.Emp;
import com.tibame.tutorial.vo.Dept;

@Repository
@Transactional
public class EmpDAO {
	
	@Autowired
    private HibernateTemplate hibernateTemplate;

	public List<Emp> getAll() {
		List<Emp> list = (List<Emp>)hibernateTemplate.loadAll(Emp.class);
		return list;
	}
	
	public Emp getOne(Integer id) {
		return hibernateTemplate.get(Emp.class, id);
	}
	
	public void insert(Emp emp) {
		hibernateTemplate.save(emp);
	}
	
	public void update(Emp emp) {
		hibernateTemplate.update(emp);
	}
	
	public void delete(Integer id) {
		Emp emp = new Emp();
		emp.setEmpno(id);
		hibernateTemplate.delete(emp);
		
	}

}
