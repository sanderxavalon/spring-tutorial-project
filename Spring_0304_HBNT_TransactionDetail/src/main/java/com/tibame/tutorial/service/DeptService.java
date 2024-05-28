package com.tibame.tutorial.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tibame.tutorial.dao.DeptDAO;
import com.tibame.tutorial.vo.Dept;

@Service
public class DeptService {
	
	@Autowired
	DeptDAO deptDAO;
	
	
	public List<Dept> getAll() {
		return deptDAO.getAll();
	}
	
	public List<Dept> getAllNoReadOnly() {
		return deptDAO.getAllNoReadOnly();
	}
	
	@Transactional(timeout = 1)
	public void saveTimeOut() {
		deptDAO.saveTimeOut();
	}
	
	public void saveWithRuntimeException() {
		deptDAO.saveWithRuntimeException();
	}
	
	public void saveNoRollBack() {
		deptDAO.saveNoRollBack();
	}
	
	public void saveRollBackFor() throws IOException {
		deptDAO.saveRollBackFor();
	}
	
	public void exceptionNoRollBack() throws IOException {
		deptDAO.exceptionNoRollBack();
	}

}
