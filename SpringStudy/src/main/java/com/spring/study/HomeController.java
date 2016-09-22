package com.spring.study;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller //컨트롤러 어노테이션
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET) // 어노테이션 설정 (/main으로 url요청이 들어오면 이 컨트롤러로 매핑하겠다.)
	public String home(Locale locale, Model model) { // 컨트롤러는 직접 또는 간접적으로 ModelAndView 객체를 생성하게 된다. 페이지와 매핑된다.
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate ); // jsp 페이지로 넘길 attribute를 설정
		model.addAttribute("message","한글이 되나?????");
		
		return "home"; // 위에서 설정한 페이지 루트의 페이지명 main.jsp와 매핑이 된다. 만약 jsp밑에 login이란 디렉토리를 만들고 그 안에 
					   // main.jsp가 있다면 login/main 이라고 설정하면 된다.
		
	}
	
}
