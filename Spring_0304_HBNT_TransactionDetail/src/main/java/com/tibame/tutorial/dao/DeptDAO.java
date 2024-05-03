package com.tibame.tutorial.dao;

import java.io.IOException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tibame.tutorial.vo.Dept;

@Repository
@Transactional
public class DeptDAO {
	
	private static final String GET_ALL_STMT = "from Dept order by deptno";

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional(readOnly = true)
	public List<Dept> getAll() {
		Session session = sessionFactory.getCurrentSession();
		Query<Dept> query = session.createQuery(GET_ALL_STMT, Dept.class);
		List<Dept> list = query.getResultList();
		return list;
	}
	
	@Transactional(readOnly = false)
	public List<Dept> getAllNoReadOnly() {
		Session session = sessionFactory.getCurrentSession();
		Query<Dept> query = session.createQuery(GET_ALL_STMT, Dept.class);
		List<Dept> list = query.getResultList();
		return list;
	}
	
	@Transactional
	public void saveTimeOut() {
		Dept vo = new Dept();
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
		Dept vo = new Dept();
		vo.setDname("人資部");
		vo.setLoc("新北板橋");
		sessionFactory.getCurrentSession().save(vo);
		throw new RuntimeException("Hi Hi");
	}
	
	@Transactional(noRollbackFor = RuntimeException.class)
	public void saveNoRollBack() {
		Dept vo = new Dept();
		vo.setDname("行政部");
		vo.setLoc("新北永和");
		sessionFactory.getCurrentSession().save(vo);
		throw new RuntimeException("Hi Hi again");
	}
	
	@Transactional // 預設情況下是不會為了Checked Exception Rollback
	public void exceptionNoRollBack() throws IOException {
		Dept vo = new Dept();
		vo.setDname("會計部");
		vo.setLoc("新北中和");
		sessionFactory.getCurrentSession().save(vo);
		throw new IOException();	
	}
	
	@Transactional(rollbackFor = Exception.class)
	public void saveRollBackFor() throws IOException {
		Dept vo = new Dept();
		vo.setDname("會計部");
		vo.setLoc("新北中和");
		sessionFactory.getCurrentSession().save(vo);
		throw new IOException();	
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void saveA(Dept vo) {
		sessionFactory.getCurrentSession().save(vo);
	}

	@Transactional
	public void saveB(Dept vo) {
        sessionFactory.getCurrentSession().save(vo);
	}
	
	
}
