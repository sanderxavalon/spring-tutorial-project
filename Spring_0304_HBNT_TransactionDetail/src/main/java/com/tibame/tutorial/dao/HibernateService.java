package com.tibame.tutorial.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tibame.tutorial.vo.DeptVO;

@Service
public class HibernateService {


	@Autowired
	HibernateDAO hibernateDAO;
	
	@Transactional
	public void saveAll() {
		
		DeptVO vo = new DeptVO();
		vo.setDeptno(10);
		vo.setDname("行政部");
		vo.setLoc("桃園中壢");
		
		DeptVO vo2 = new DeptVO();
		vo2.setDeptno(11);
		vo2.setDname("庶務部");
		vo2.setLoc("新竹竹北");
		
		DeptVO vo3 = new DeptVO();
		vo3.setDeptno(1);
		vo3.setDname("隨便啦");
		vo3.setLoc("高雄楠梓");
		
		hibernateDAO.saveA(vo);
		hibernateDAO.saveB(vo2);
		hibernateDAO.saveB(vo3);
	}

}
