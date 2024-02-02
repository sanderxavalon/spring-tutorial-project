package com.tibame.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tibame.vo.DeptVO;

@Repository
@Transactional
public class DeptDAO {
	
	private static final String GET_ALL_STMT = "from DeptVO order by deptno";

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional(readOnly = true)
	public List<DeptVO> getAll() {
		Session session = sessionFactory.getCurrentSession();
		Query<DeptVO> query = session.createQuery(GET_ALL_STMT, DeptVO.class);
		List<DeptVO> list = query.getResultList();
		return list;
	}
	
}
