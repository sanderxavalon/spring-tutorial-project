package com.tibame.lab.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.tibame.lab.vo.Emp;

public class EmpDAO {
	
	@Transactional(readOnly = true)
	public List<Emp> getAll() {
		return new ArrayList<>();
	}
	
	public void save() {
		
	}
	
	public void update() {
		
	}
	
	public void delete() {
		
	}

}
