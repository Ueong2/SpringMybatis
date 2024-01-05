package com.springtest.erp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	@RequestMapping("/test")
	public String test() {
		return "include/mainContent";
	}
	
	// 스프링mvc는 기본이 forward
	// ModelAndView => Model(뷰에서 출력할 데이터 - 컨트롤러에서 비즈니스 로직을 처리한 결과)
	// View의 정보를 담고 있는 객체
	@RequestMapping("/test/data")
	public ModelAndView main() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "스프링 컨트롤러에서 전달하는 메시지");
		mav.setViewName("test/index10");
		return mav;
	}
	
	// insert할 정보를 입력할 페이지를 response할 수 있도록 실행해주는 메소드
	@RequestMapping(value = "/emp/insert.do", method = RequestMethod.GET)
	public String insertPage() {
		return "/emp/register";
	}
	
	// db에 insert하는 기능을 수행할 메소드
	@RequestMapping(value = "/emp/insert.do", method = RequestMethod.POST)
	public String insert() {
		System.out.println("DB에 데이터 insert");
		return "test/index10";
	}
}
