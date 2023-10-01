package com.tibame.tutorial.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tibame.tutorial.vo.DeptVO;

@Repository
@Transactional
public class HibernateDAO {
	
	@Autowired
    private HibernateTemplate hibernateTemplate;

	@Transactional(readOnly = true)
	public List<DeptVO> getAll() {
		List<DeptVO> list = (List<DeptVO>)hibernateTemplate.loadAll(DeptVO.class);
	    return list;
	}
	
	public void save() {
		DeptVO vo = new DeptVO();
		vo.setDeptno(5);
		vo.setDname("總經理");
		vo.setLoc("新北新莊");
		hibernateTemplate.save(vo);
	}
	
	public void update() {
		DeptVO vo = new DeptVO();
		vo.setDeptno(1);
		vo.setDname("總務處");
		vo.setLoc("新北板橋");
		hibernateTemplate.update(vo);
	}
	
	public void delete() {
		DeptVO vo = new DeptVO();
		vo.setDeptno(5);
		hibernateTemplate.delete(vo);
	}
	
	public void saveFail() {
		DeptVO vo = new DeptVO();
		vo.setDeptno(1);
		vo.setDname("不會成功");
		vo.setLoc("這個成功糗了");
		hibernateTemplate.save(vo);
	}

}
