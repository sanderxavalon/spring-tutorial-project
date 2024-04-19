package com.tibame.lab.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.tibame.tutorial.vo.Dept;

public class EmpDAO {
	
	@Transactional(readOnly = true)
	public List<Dept> getAll() {
		return new ArrayList<>();
	}
	
	public void save() {
		
	}
	
	public void update() {
		
	}
	
	public void delete() {
		
	}

}
