package com.tibame.tutorial.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tibame.tutorial.vo.DeptVO;

@Repository
@Transactional
public class HibernateDAO {
	
	private static final String GET_ALL_STMT = "from DeptVO order by deptno";

    @PersistenceContext
    private EntityManager em;

	public List<DeptVO> getAll() {
		return em.createQuery(GET_ALL_STMT, DeptVO.class).getResultList();
	}
	
	public void save() {
		DeptVO vo = new DeptVO();
		vo.setDeptno(5);
		vo.setDname("總經理");
		vo.setLoc("新北新莊");
		em.persist(vo);
	}
	
	public void update() {
		DeptVO vo = new DeptVO();
		vo.setDeptno(1);
		vo.setDname("總務處");
		vo.setLoc("新北板橋");
		em.merge(vo);
	}
	
	public void delete() {
		DeptVO vo = new DeptVO();
		vo.setDeptno(5);
		em.remove(vo);
	}

}
