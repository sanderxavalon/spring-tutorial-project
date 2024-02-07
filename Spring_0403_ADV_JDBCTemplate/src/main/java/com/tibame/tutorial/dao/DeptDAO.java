package com.tibame.tutorial.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tibame.tutorial.vo.DeptVO;

@Repository
public class DeptDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public Integer findOne() {
		return this.jdbcTemplate.queryForObject("select count(*) from dept2", Integer.class);
	}

}
