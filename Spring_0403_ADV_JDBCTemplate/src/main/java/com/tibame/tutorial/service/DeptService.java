package com.tibame.tutorial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tibame.tutorial.dao.DeptDAO;
import com.tibame.tutorial.vo.Dept;

@Service
public class DeptService {
	
	
	@Autowired
	DeptDAO deptDAO;
	
	
	public List<Dept> getAll() {
		return deptDAO.getAll();
	}
	
	public Dept getOne(Integer id) {
		return deptDAO.getOne(id);
	}
	
	public void delete(Integer id) {
		deptDAO.delete(id);
	}
	
	public void insert(Dept dept) {
		dept.setDeptno(deptDAO.getLatestDeptNo() + 1);
		deptDAO.insert(dept);
	}
	
	public void update(Dept dept){
		deptDAO.update(dept);
	}
	

}
