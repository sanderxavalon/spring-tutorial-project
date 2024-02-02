package com.tibame.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tibame.dao.DeptDAO;
import com.tibame.vo.DeptVO;

@Service
public class DeptService {
	
	@Autowired
	DeptDAO dao;
	
	public List<DeptVO> getAll() {
		return dao.getAll();
	}

}
