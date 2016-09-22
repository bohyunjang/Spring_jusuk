package com.spring.study.dao;

import java.util.Map;

public interface UserDao {
	// 파라미터를 맵으로 받을 것이다. @Param 어노테이션을 사용한 결과 잔 버그들이 발생.. 그래서 사용안함
	public int getLoginResult(Map<String, String> map); 

}
