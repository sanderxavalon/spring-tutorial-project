package com.tibame.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tibame.vo.Dept;

@Repository
@Transactional
public class DeptDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private final RowMapper<Dept> deptRowMapper = (resultSet, rowNum) -> {
		Dept dept = new Dept();
		dept.setDeptno(resultSet.getInt("DEPTNO"));
		dept.setDname(resultSet.getString("DNAME"));
		dept.setLoc(resultSet.getString("LOC"));
		return dept;
	};


	@Transactional(readOnly = true)
	public List<Dept> getAll() {
		return jdbcTemplate.query("SELECT * FROM DEPT", deptRowMapper);
	}
	
	@Transactional(readOnly = true)
	public Dept getOne(Integer id) {
		return jdbcTemplate.queryForObject("SELECT * FROM DEPT WHERE DEPTNO = ?", deptRowMapper, id);
	}
	
	public Integer getLatestDeptNo() {
		return jdbcTemplate.queryForObject("SELECT DEPTNO FROM DEPT ORDER BY DEPTNO DESC LIMIT 1", Integer.class);
	}
	
	public void insert(Dept dept) {
		// Insert/Update 都用update()
		jdbcTemplate.update("INSERT INTO DEPT (DEPTNO, DNAME,LOC) VALUES (?,?,?)", dept.getDeptno(), dept.getDname(), dept.getLoc());
	}
	
	public void update(Dept dept) {
		jdbcTemplate.update("UPDATE DEPT SET DNAME = ?, LOC = ? WHERE DEPTNO = ?", dept.getDname(), dept.getLoc(), dept.getDeptno());
	}
	
	public void delete(Integer id) {
		jdbcTemplate.update("DELETE FROM DEPT WHERE DEPTNO = ?", id);
	}

}
