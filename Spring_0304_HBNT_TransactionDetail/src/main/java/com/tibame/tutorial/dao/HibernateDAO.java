package com.tibame.tutorial.dao;

import java.io.IOException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

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
	
	@Transactional(readOnly = false)
	public List<DeptVO> getAllNoReadOnly() {
		Session session = sessionFactory.getCurrentSession();
		Query<DeptVO> query = session.createQuery(GET_ALL_STMT, DeptVO.class);
		List<DeptVO> list = query.getResultList();
		return list;
	}
	
	@Transactional(timeout = 1)
	public void saveTimeOut() {
		DeptVO vo = new DeptVO();
		vo.setDeptno(6);
		vo.setDname("總務部");
		vo.setLoc("新北三重");
		sessionFactory.getCurrentSession().save(vo);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Transactional
	public void saveWithRuntimeException() {
		DeptVO vo = new DeptVO();
		vo.setDeptno(7);
		vo.setDname("人資部");
		vo.setLoc("新北板橋");
		sessionFactory.getCurrentSession().save(vo);
		throw new RuntimeException();
	}
	
	@Transactional(noRollbackFor = RuntimeException.class)
	public void saveNoRollBack() {
		DeptVO vo = new DeptVO();
		vo.setDeptno(8);
		vo.setDname("行政部");
		vo.setLoc("新北永和");
		sessionFactory.getCurrentSession().save(vo);
		throw new RuntimeException();
	}
	
//	@Transactional(rollbackFor = Exception.class)
	@Transactional // 預設情況下是不會為了Checked Exception Rollback
	public void saveRollBackFor() throws IOException {
		DeptVO vo = new DeptVO();
		vo.setDeptno(9);
		vo.setDname("會計部");
		vo.setLoc("新北中和");
		sessionFactory.getCurrentSession().save(vo);
		throw new IOException();	
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void saveA(DeptVO vo) {
		sessionFactory.getCurrentSession().save(vo);
	}

	@Transactional
	public void saveB(DeptVO vo) {
        sessionFactory.getCurrentSession().save(vo);
	}

}
