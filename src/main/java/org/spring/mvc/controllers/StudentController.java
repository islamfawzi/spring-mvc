package org.spring.mvc.controllers;

import org.apache.log4j.Logger;
import org.spring.mvc.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/student")
public class StudentController {

	final private Logger logger = Logger.getLogger(this.getClass());
	
	@RequestMapping(value = "/show-form", method = RequestMethod.GET)
	public String showStudentForm(Model model) {
	
		logger.info("showStudentForm()");
		
		model.addAttribute("student", new Student());
		
		return "studentForm";
	}
	
	@RequestMapping(value = "/confirm", method = RequestMethod.POST)
	public String confirm(@ModelAttribute("student") Student student) {
		
		logger.info("confirm() -> " + student);
		
		return "studentConfirm";
	}
}
