package com.tibame.lab.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tibame.tutorial.vo.DeptVO;

public class LabHibernateDAO {
	
	private static final String GET_ALL_STMT = "from DeptVO order by deptno";

	private SessionFactory sessionFactory;

	@Transactional(readOnly = true)
	public List<DeptVO> getAll() {
//		可以使用這段直接把東西抓出來
//		但還是要記得把SessionFatory放進來喔
//		Query<DeptVO> query = session.createQuery(GET_ALL_STMT, DeptVO.class);
		return new ArrayList<>();
	}
	
	public void save() {
		
	}
	
	public void update() {
		
	}
	
	public void delete() {
		
	}

}
