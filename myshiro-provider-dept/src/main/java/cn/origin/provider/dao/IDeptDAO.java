package cn.origin.provider.dao;

import java.util.List;

import cn.origin.vo.Dept;

public interface IDeptDAO {
	public Dept findById(Long id) ;
	public List<Dept> findAll() ;
}
