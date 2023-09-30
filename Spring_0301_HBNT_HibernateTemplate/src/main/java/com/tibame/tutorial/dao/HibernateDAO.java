package com.tibame.tutorial.dao;

import java.time.LocalDate;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tibame.tutorial.vo.DeptVO;
import com.tibame.tutorial.vo.EmpVO;

@Repository
public class HibernateDAO {
	
	@Autowired
    private HibernateTemplate hibernateTemplate;

	@Transactional(readOnly = true)
	public List<DeptVO> getAll() {
		List<DeptVO> list = (List<DeptVO>)hibernateTemplate.loadAll(DeptVO.class);
	    return list;
	}
	
	@Transactional(rollbackFor = Exception.class)
	public void saveDept() {
		DeptVO vo = new DeptVO();
		vo.setDeptno(9);
		vo.setDname("總經理室");
		vo.setLoc("天龍國");
		hibernateTemplate.save(vo);
	}
	
	@Transactional
	public void save() {
		DeptVO vo2 = new DeptVO();
		vo2.setDeptno(1);
		EmpVO empvo = new EmpVO();
		empvo.setEname("Sander");
		empvo.setJob("Boss");
		empvo.setHiredate(Date.valueOf(LocalDate.now()));
		empvo.setSal(new BigDecimal(10000.00));
		empvo.setComm(new BigDecimal(10000.00));
		empvo.setDeptVO(vo2);
		hibernateTemplate.save(empvo);
		save2();
	}
	@Transactional
	public void save2() {
		DeptVO vo = new DeptVO();
		vo.setDeptno(3);
		vo.setDname("重複ID");
		vo.setLoc("成功就糗了");
		hibernateTemplate.save(vo);
	}

}
