package bence.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping(value = "/index")
	public String indexHandler(Model model) {
		return "index";
	}
	@RequestMapping(value = ".*jsp")
	public String indexHandler2(Model model) {
		return "index";
	}
	
}
