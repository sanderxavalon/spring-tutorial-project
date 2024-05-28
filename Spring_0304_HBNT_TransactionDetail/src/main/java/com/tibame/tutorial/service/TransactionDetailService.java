package com.tibame.tutorial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tibame.tutorial.dao.TransactionDetailDAO;
import com.tibame.tutorial.vo.Dept;

@Service
public class TransactionDetailService {
	
	@Autowired
	TransactionDetailDAO transactionDetailDAO;
	
	@Transactional
	public void REQUIRED() {
		Dept vo = new Dept();
		vo.setDeptno(99);
		vo.setDname("REQUIRED測試");
		vo.setLoc("REQUIRED測試");
		transactionDetailDAO.REQUIRED(vo);
	}
		
	public void NEVER() {
		Dept vo = new Dept();
		vo.setDeptno(100);
		vo.setDname("NEVER測試");
		vo.setLoc("NEVER測試");
		transactionDetailDAO.NEVER(vo);
	}
	
	@Transactional(propagation = Propagation.MANDATORY)
	public void MANDATORY() {
		Dept vo = new Dept();
		vo.setDeptno(101);
		vo.setDname("MANDATORY測試");
		vo.setLoc("MANDATORY測試");
		transactionDetailDAO.NEVER(vo);
	}
	

}
