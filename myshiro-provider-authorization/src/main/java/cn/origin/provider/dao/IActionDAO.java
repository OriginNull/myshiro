package cn.origin.provider.dao;

import java.util.Set;

public interface IActionDAO {
	public Set<String> findAllByMember(String mid) ;
}
