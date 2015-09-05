package bence.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bence.springweb.responseobjects.ExampleResponse;

@Controller
public class AngularController {
	
	@RequestMapping(value="/hello")
	public String greeting(Model model){
		ExampleResponse er = new ExampleResponse(2,"Bence");		
		return "faszom";
	}
	
	@RequestMapping(value="/hellohtml")
	//@RequestMapping({"/","/hellohtml"})
	public String hellohtml(){
		return "index";
	}
	//plusz komment
	
	/*
	@RequestMapping("/index.html")
    protected String gotoIndex(Model model) throws Exception {      
        return "index";
    }
	*/

}
