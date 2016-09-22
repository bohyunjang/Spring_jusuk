package com.spring.study.dao;

import java.util.Map;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao{

	@Override
	public int getLoginResult(Map<String, String> map) {
		// TODO Auto-generated method stub
		
		System.out.println("userDaoImpl... getLoginResult...");
		
		return (Integer) getSqlSession().selectOne("userDao.getLoginResult",map);
	}

}
