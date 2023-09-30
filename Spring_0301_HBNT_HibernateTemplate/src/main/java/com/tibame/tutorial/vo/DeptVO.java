package com.tibame.tutorial.vo;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "dept2")
public class DeptVO {
	
	@Id
	private Integer deptno;
	@Column
	private String dname;
	@Column
	private String loc;
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "deptno")
	private Set<EmpVO> emps = new HashSet<EmpVO>();
	
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
	public Set<EmpVO> getEmps() {
		return emps;
	}
	public void setEmps(Set<EmpVO> emps) {
		this.emps = emps;
	}
	
	public String toStringWithEmp() {
		return "DeptVO [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + ", emps=\n" + emps + "]\n";
	}
	
	@Override
	public String toString() {
		return "DeptVO [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]\n";
	}
}
