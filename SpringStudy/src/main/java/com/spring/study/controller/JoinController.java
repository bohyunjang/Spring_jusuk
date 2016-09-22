package com.spring.study.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.study.dao.UserDaoImpl;

@Controller
public class JoinController {
	
	@Resource(name="userDaoImpl")
	private UserDaoImpl userDaoImpl;
	
	
	//콘솔창에서 로그인 테스트
	@RequestMapping("/")
	public ModelAndView main(){
		
		ModelAndView mav = new ModelAndView("main");
		mav.setViewName("user/joinForm");
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", "test");
		map.put("password", "test");
		
		if(userDaoImpl.getLoginResult(map)==1){
			System.out.println("로그인성공");
		}else{
			System.out.println("로그인실패");
		}
		
		return mav;
	}

}
