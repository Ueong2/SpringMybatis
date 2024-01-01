package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmpController {
	@RequestMapping("/test/index")
	public String index() {
		return "test/index";
	}
	
	@RequestMapping(value = "/test/paramtest", method = RequestMethod.GET)
	public String test() {
		return "emptest/register";
	}
	
	@RequestMapping(value = "/test/paramtest", method = RequestMethod.POST)
	public String testParam(@RequestParam String deptno, String name) {
		// 실제 DB에 저장할 때 호출되는 컨트롤러의 메소드
		System.out.println("클라이언트가 입력한 파라미터 추출하기 : " + deptno);
		System.out.println("클라이언트가 입력한 파라미터 추출하기 : " + name);
		return "test/index";
	}
}
