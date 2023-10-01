package com.tibame.tutorial.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.tibame.tutorial.vo.DeptVO;

@Repository
public class HibernateDAO {
	
	private static final String GET_ALL_STMT = "from DeptVO order by deptno";
	
	int deptNo = 10;

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional(readOnly = true)
	public List<DeptVO> getAll() {
		Session session = sessionFactory.getCurrentSession();
		Query<DeptVO> query = session.createQuery(GET_ALL_STMT, DeptVO.class);
		List<DeptVO> list = query.getResultList();
		return list;
	}

	@Transactional
	public void save() {
		
		Session session = sessionFactory.getCurrentSession();
		
		deptNo = deptNo + 1;

		DeptVO vo = new DeptVO();
		vo.setDeptno(deptNo );
		vo.setDname("重複ID");
		vo.setLoc("成功就糗了");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		session.save(vo);
	}
	
	@Transactional()
	public void save2() {
		
		Session session = sessionFactory.getCurrentSession();
		deptNo = deptNo + 1;
		DeptVO vo = new DeptVO();
		vo.setDeptno(deptNo);
		vo.setDname("重複ID");
		vo.setLoc("成功就糗了");
		session.save(vo);
	}
	
}
