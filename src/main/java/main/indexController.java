package main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {
	@RequestMapping("/index.do")
	public String index() {
		return "indexdir";
	}

	@RequestMapping("/emp/login.do")
	public String login() {
		return "logindir";
	}
}
