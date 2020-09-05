package org.spring.mvc.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormController {

	
	@RequestMapping(value = "show-form", method = RequestMethod.GET)
	public String showForm() {
		
		return "showForm";
	}
	
	@RequestMapping(value = "process-form", method = RequestMethod.POST)
	public String processForm(HttpServletRequest request, Model model) {
		
		// read form request params
		String name = request.getParameter("name");
		
		model.addAttribute("nameCaps", name.toUpperCase());
		
		return "processForm";
	}
}
