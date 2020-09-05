package org.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormController {

	
	@RequestMapping(value = "show-form", method = RequestMethod.GET)
	public String showForm() {
		
		return "showForm";
	}
	
	@RequestMapping(value = "process-form", method = RequestMethod.POST)
	public String processForm() {
		
		return "processForm";
	}
}
