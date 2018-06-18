package cn.origin.service;

import java.util.List;

import cn.origin.vo.Dept;

public interface IDeptService {
	public Dept get(long id) ;
	public List<Dept> list() ;
}
