package com.tibame.tutorial.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tibame.tutorial.dao.DeptDAO;
import com.tibame.tutorial.vo.Dept;

@Service
public class DeptService {
	
	@Autowired
	DeptDAO deptDAO;
	
	
	public List<Dept> getAll() {
		return deptDAO.getAll();
	}
	
	public List<Dept> getAllNoReadOnly() {
		return deptDAO.getAllNoReadOnly();
	}
	
	@Transactional(timeout = 1)
	public void saveTimeOut() {
		deptDAO.saveTimeOut();
	}
	
	public void saveWithRuntimeException() {
		deptDAO.saveWithRuntimeException();
	}
	
	public void saveNoRollBack() {
		deptDAO.saveNoRollBack();
	}
	
	public void saveRollBackFor() throws IOException {
		deptDAO.saveRollBackFor();
	}
	
	public void exceptionNoRollBack() throws IOException {
		deptDAO.exceptionNoRollBack();
	}
	
	@Transactional
	public void saveAll() {
		
		Dept vo = new Dept();
		vo.setDname("行政部");
		vo.setLoc("桃園中壢");
		
		Dept vo2 = new Dept();
		vo2.setDname("庶務部");
		vo2.setLoc("新竹竹北");
		
		Dept vo3 = new Dept();
		vo3.setDname("我不小心把自己設的太長了啦怎麼辦啦要爆炸了啦唉唷威壓我不小心把自己設的太長了啦怎麼辦啦要爆炸了啦唉唷威壓我不小心把自己設的太長了啦怎麼辦啦要爆炸了啦唉唷威壓我不小心把自己設的太長了啦怎麼辦啦要爆炸了啦唉唷威壓我不小心把自己設的太長了啦怎麼辦啦要爆炸了啦唉唷威壓我不小心把自己設的太長了啦怎麼辦啦要爆炸了啦唉唷威壓我不小心把自己設的太長了啦怎麼辦啦要爆炸了啦唉唷威壓我不小心把自己設的太長了啦怎麼辦啦要爆炸了啦唉唷威壓我不小心把自己設的太長了啦怎麼辦啦要爆炸了啦唉唷威壓我不小心把自己設的太長了啦怎麼辦啦要爆炸了啦唉唷威壓我不小心把自己設的太長了啦怎麼辦啦要爆炸了啦唉唷威壓我不小心把自己設的太長了啦怎麼辦啦要爆炸了啦唉唷威壓我不小心把自己設的太長了啦怎麼辦啦要爆炸了啦唉唷威壓我不小心把自己設的太長了啦怎麼辦啦要爆炸了啦唉唷威壓我不小心把自己設的太長了啦怎麼辦啦要爆炸了啦唉唷威壓我不小心把自己設的太長了啦怎麼辦啦要爆炸了啦唉唷威壓我不小心把自己設的太長了啦怎麼辦啦要爆炸了啦唉唷威壓我不小心把自己設的太長了啦怎麼辦啦要爆炸了啦唉唷威壓我不小心把自己設的太長了啦怎麼辦啦要爆炸了啦唉唷威壓我不小心把自己設的太長了啦怎麼辦啦要爆炸了啦唉唷威壓我不小心把自己設的太長了啦怎麼辦啦要爆炸了啦唉唷威壓我不小心把自己設的太長了啦怎麼辦啦要爆炸了啦唉唷威壓我不小心把自己設的太長了啦怎麼辦啦要爆炸了啦唉唷威壓我不小心把自己設的太長了啦怎麼辦啦要爆炸了啦唉唷威壓我不小心把自己設的太長了啦怎麼辦啦要爆炸了啦唉唷威壓我不小心把自己設的太長了啦怎麼辦啦要爆炸了啦唉唷威壓我不小心把自己設的太長了啦怎麼辦啦要爆炸了啦唉唷威壓");
		vo3.setLoc("高雄楠梓");
		
		deptDAO.saveA(vo);
		deptDAO.saveB(vo2);
		deptDAO.saveB(vo3);
		
		
	}

}
