package com.tibame.tutorial.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tibame.tutorial.vo.DeptVO;

@Repository
@Transactional
public class HibernateDAO {
	
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
	
	public void save() {
		DeptVO vo = new DeptVO();
		vo.setDeptno(5);
		vo.setDname("總經理");
		vo.setLoc("新北新莊");
		sessionFactory.getCurrentSession().save(vo);
	}
	
	public void update() {
		DeptVO vo = new DeptVO();
		vo.setDeptno(1);
		vo.setDname("總務處");
		vo.setLoc("新北板橋");
		sessionFactory.getCurrentSession().update(vo);
	}
	
	public void delete() {
		DeptVO vo = new DeptVO();
		vo.setDeptno(5);
		sessionFactory.getCurrentSession().delete(vo);
	}
	
	public void saveFail() {
		DeptVO vo = new DeptVO();
		vo.setDeptno(1);
		vo.setDname("不會成功");
		vo.setLoc("這個成功糗了");
		sessionFactory.getCurrentSession().save(vo);
	}


}
