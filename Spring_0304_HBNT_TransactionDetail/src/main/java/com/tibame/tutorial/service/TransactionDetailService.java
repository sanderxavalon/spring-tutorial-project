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

	// 不會存
	@Transactional
	public void REQUIRED() {
		Dept vo = new Dept();
		vo.setDeptno(99);
		vo.setDname("REQUIRED測試");
		vo.setLoc("REQUIRED測試");
		transactionDetailDAO.REQUIRED(vo);
		throw new RuntimeException();
	}

	// 加上之後就沒問題
//	@Transactional
	public void MANDATORY() {
		Dept vo = new Dept();
		vo.setDeptno(110);
		vo.setDname("MANDATORY測試");
		vo.setLoc("MANDATORY測試");
		transactionDetailDAO.MANDATORY(vo);
	}

	@Transactional
	public void REQUIRESNEW() {
		Dept vo = new Dept();
		vo.setDeptno(120);
		vo.setDname("REQUIRESNEW測試");
		vo.setLoc("REQUIRESNEW測試");
		transactionDetailDAO.REQUIRESNEW(vo);

		vo.setDeptno(199);
		vo.setDname("這個不會存");
		vo.setLoc("這個不會存");
		transactionDetailDAO.REQUIRED(vo);

		throw new RuntimeException();
	}

//	看看加上之後會怎樣
//	@Transactional
	public void SUPPORT() {
		Dept vo = new Dept();
		vo.setDeptno(130);
		vo.setDname("SUPPORT測試");
		vo.setLoc("SUPPORT測試");
		transactionDetailDAO.SUPPORT(vo);
	}

	// 加上之後會爆炸
//	@Transactional
	public void NEVER() {
		Dept vo = new Dept();
		vo.setDeptno(140);
		vo.setDname("NEVER測試");
		vo.setLoc("NEVER測試");
		transactionDetailDAO.NEVER(vo);
	}

	@Transactional
	public void NOTSUPPORTED() {

		Dept vo = new Dept();

		vo.setDeptno(199);
		vo.setDname("這個不會存");
		vo.setLoc("這個不會存");
		transactionDetailDAO.REQUIRED(vo);

		vo.setDeptno(150);
		vo.setDname("NOTSUPPORTED測試");
		vo.setLoc("NOTSUPPORTED測試");
		transactionDetailDAO.NOTSUPPORTED(vo);

		throw new RuntimeException();
	}

	// 像是REQUIRES_NEW
	// 父事務Rollback時，但子事務也會Rollback
	@Transactional
	public void NEST1() {

		Dept vo = new Dept();

		vo.setDeptno(99);
		vo.setDname("REQUIRED測試");
		vo.setLoc("REQUIRED測試");
		transactionDetailDAO.REQUIRED(vo);

		vo.setDeptno(160);
		vo.setDname("NESTED測試");
		vo.setLoc("NESTED測試");
		transactionDetailDAO.NESTED(vo);

		throw new RuntimeException();
	}

	// 像是REQUIRES
	// 子事務Rollback時，但父事務不會Rollback
	@Transactional
	public void REQUIRED2() {

		Dept vo = new Dept();
		vo.setDeptno(99);
		vo.setDname("REQUIRED測試");
		vo.setLoc("REQUIRED測試");
		transactionDetailDAO.REQUIRED(vo);

		try {
			vo.setDeptno(1);
			vo.setDname("爆錯測試");
			vo.setLoc("爆錯測試");
			transactionDetailDAO.REQUIRED(vo);
		} catch (Exception exception) {
			System.err.println("RollBack!");
			throw exception;
		}

	}

	@Transactional
	public void NEST2() {

		Dept vo = new Dept();

		vo.setDeptno(200);
		vo.setDname("父NEST測試");
		vo.setLoc("父NEST測試");
		transactionDetailDAO.REQUIRED(vo);

		try {
			vo.setDeptno(1);
			vo.setDname("爆錯測試");
			vo.setLoc("爆錯測試");
			transactionDetailDAO.NESTED(vo);			
		} catch (Exception e) {
			
		}

	}

}