package bence.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import bence.springweb.model.Exercise;

@Controller
public class MinutesController {
	
	@RequestMapping(value="/addminutes")
	public String addMinutes(@ModelAttribute ("exercise") Exercise exercise) {
		
		System.out.println("exercise: " + exercise.getMinutes());
		return "addMinutes";
	}

}
