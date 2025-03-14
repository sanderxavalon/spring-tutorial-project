package com.tibame.tutorial.vo;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "DEPT")
public class Dept {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer deptno;
	@Column
	private String dname;
	@Column
	private String loc;

	public Integer getDeptno() {
		return deptno;
	}
	
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	
	public String getDname() {
		return dname;
	}
	
	public void setDname(String dname) {
		this.dname = dname;
	}
	
	public String getLoc() {
		return loc;
	}
	
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	@Override
	public String toString() {
		return "DeptVO [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}

	
}
