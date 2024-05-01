package com.tibame.lab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tibame.lab.dao.EmpDAO;
import com.tibame.lab.vo.Emp;

@Service
public class EmpService {
	
	
	@Autowired(required = false)
	EmpDAO empDAO;
	
	
	public List<Emp> getAll() {
		return empDAO.getAll();
	}
	
	public Emp getOne(Integer id) {
		return empDAO.getOne(id);
	}
	
	public void delete(Integer id) {
		empDAO.delete(id);
	}
	
	public void insert(Emp emp) {
		empDAO.insert(emp);
	}
	
	public void update(Emp emp){
		empDAO.update(emp);
	}
	

}
