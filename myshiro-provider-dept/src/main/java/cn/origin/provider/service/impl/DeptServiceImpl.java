package cn.origin.provider.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;

import cn.origin.provider.dao.IDeptDAO;
import cn.origin.service.IDeptService;
import cn.origin.vo.Dept;
@Service
public class DeptServiceImpl implements IDeptService {
	@Autowired
	private IDeptDAO deptDAO ;
	@Override
	public Dept get(long id) {
		return this.deptDAO.findById(id);
	}

	@Override
	public List<Dept> list() {
		return this.deptDAO.findAll();
	}

}
