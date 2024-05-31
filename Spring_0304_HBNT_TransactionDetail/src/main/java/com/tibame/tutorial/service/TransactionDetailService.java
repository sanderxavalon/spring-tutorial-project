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

	// 拋出不會存
	@Transactional
	public void REQUIRED() {
		
		Dept vo = new Dept();
		vo.setDeptno(100);
		vo.setDname("REQUIRED_交易A測試");
		vo.setLoc("REQUIRED_交易A測試");
		transactionDetailDAO.REQUIRED(vo);
		
		
		vo.setDeptno(101);
		vo.setDname("REQUIRED_交易B測試");
		vo.setLoc("REQUIRED_交易B測試");
		transactionDetailDAO.REQUIRED(vo);
		throw new RuntimeException();
	}

	// 加上之後就沒問題
//	@Transactional
	public void MANDATORY() {
		Dept vo = new Dept();
		vo.setDeptno(110);
		vo.setDname("MANDATORY_交易A測試");
		vo.setLoc("MANDATORY_交易A測試");
		transactionDetailDAO.MANDATORY(vo);
	}

	@Transactional
	public void REQUIRESNEW() {
		Dept vo = new Dept();
		vo.setDeptno(120);
		vo.setDname("REQUIRESNEW_交易A測試");
		vo.setLoc("REQUIRESNEW_交易A測試");
		transactionDetailDAO.REQUIRED(vo);
		
		vo.setDeptno(121);
		vo.setDname("REQUIRESNEW_交易B測試");
		vo.setLoc("REQUIRESNEW_交易B測試");
		transactionDetailDAO.REQUIRESNEW(vo);
		throw new RuntimeException();
	}

//	看看加上之後會怎樣
	@Transactional
	public void SUPPORT() {
		Dept vo = new Dept();
		vo.setDeptno(130);
		vo.setDname("SUPPORT_交易A測試");
		vo.setLoc("SUPPORT_交易A測試");
		transactionDetailDAO.SUPPORT(vo);
	}

	// 加上之後會爆炸
//	@Transactional
	public void NEVER() {
		Dept vo = new Dept();
		vo.setDeptno(140);
		vo.setDname("NEVER_交易A測試");
		vo.setLoc("NEVER_交易A測試");
		transactionDetailDAO.NEVER(vo);
	}

	@Transactional
	public void NOTSUPPORTED() {

		Dept vo = new Dept();

		vo.setDeptno(151);
		vo.setDname("NOTSUPPORTED_交易A測試");
		vo.setLoc("NOTSUPPORTED_交易A測試");
		transactionDetailDAO.REQUIRED(vo);

		vo.setDeptno(152);
		vo.setDname("NOTSUPPORTED_交易B測試");
		vo.setLoc("NOTSUPPORTED_交易B測試");
		transactionDetailDAO.NOTSUPPORTED(vo);

		throw new RuntimeException();
	}

	@Transactional
	public void NEST() {

		Dept vo = new Dept();

		vo.setDeptno(301);
		vo.setDname("NEST_交易A測試");
		vo.setLoc("NEST_交易A測試");
		transactionDetailDAO.REQUIRED(vo);

		vo.setDeptno(302);
		vo.setDname("NEST_交易B測試");
		vo.setLoc("NEST_交易B測試");
		transactionDetailDAO.NESTED(vo);

		throw new RuntimeException();
	}

	@Transactional
	public void NORMALREQUIRESNEWSAVE() {

		Dept vo = new Dept();
		vo.setDeptno(311);
		vo.setDname("NORMALREQUIRESNEWSAVE_交易A測試");
		vo.setLoc("NORMALREQUIRESNEWSAVE_交易A測試");
		transactionDetailDAO.REQUIRED(vo);
		
		vo.setDeptno(312);
		vo.setDname("NORMALREQUIRESNEWSAVE_交易B測試");
		vo.setLoc("NORMALREQUIRESNEWSAVE_交易B測試");
		transactionDetailDAO.REQUIRESNEW(vo);

	}

	// Nest的情況下，可以使用try-catch，只攔截子Transaction
	@Transactional
	public void NESTWITHTRYCATCH() {

		Dept vo = new Dept();

		vo.setDeptno(321);
		vo.setDname("NESTWITHTRYCATCH_交易A測試");
		vo.setLoc("NESTWITHTRYCATCH_交易A測試");
		transactionDetailDAO.REQUIRED(vo);
		
		try {
			vo.setDeptno(1);
			vo.setDname("NESTWITHTRYCATCH_交易B測試");
			vo.setLoc("NESTWITHTRYCATCH_交易B測試");
			transactionDetailDAO.NESTED(vo);			
		} catch (Exception e) {
			
		}
			
	}

}
