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
		return null;
	}
	
	public Emp getOne(Integer id) {
		return null;
	}
	
	public void insert(Emp emp) {
		
	}
	
	public void update(Emp emp) {
		
	}
	
	public void delete(Integer id) {
		
	}

}
