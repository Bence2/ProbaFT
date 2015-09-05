package bence.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViszlatController {
	
	@RequestMapping(value = "/viszlat")
	public String koszonjEl(Model model) {
		
		model.addAttribute("elkoszones", "Szevaasztooook!!");
		return "viszlat";
	}

}
