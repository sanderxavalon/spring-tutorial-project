package com.tibame.tutorial.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tibame.tutorial.vo.Dept;

@Repository
public class TransactionDetailDAO {
	
	private final RowMapper<Dept> deptRowMapper = (resultSet, rowNum) -> {
		Dept dept = new Dept();
		dept.setDeptno(resultSet.getInt("DEPTNO"));
		dept.setDname(resultSet.getString("DNAME"));
		dept.setLoc(resultSet.getString("LOC"));
		return dept;
	};
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void REQUIRED(Dept dept) {
		// Insert/Update 都用update()
		jdbcTemplate.update("INSERT INTO DEPT (DEPTNO, DNAME,LOC) VALUES (?,?,?)", dept.getDeptno(), dept.getDname(), dept.getLoc());
	}
	
	@Transactional(propagation = Propagation.NEVER)
	public void NEVER(Dept dept) {
		// Insert/Update 都用update()
		jdbcTemplate.update("INSERT INTO DEPT (DEPTNO, DNAME,LOC) VALUES (?,?,?)", dept.getDeptno(), dept.getDname(), dept.getLoc());
	}
	
	public void MANDATORY(Dept dept) {
		// Insert/Update 都用update()
		jdbcTemplate.update("INSERT INTO DEPT (DEPTNO, DNAME,LOC) VALUES (?,?,?)", dept.getDeptno(), dept.getDname(), dept.getLoc());
	}
	
	

}
