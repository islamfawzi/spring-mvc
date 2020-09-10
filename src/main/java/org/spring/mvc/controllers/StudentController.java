package org.spring.mvc.controllers;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.spring.mvc.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
	
	/** the BindingResult parameter must appear immediately after the model attribute **/
	@RequestMapping(value = "/confirm", method = RequestMethod.POST)
	public String confirm(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult) {
		
		logger.info("confirm() -> " + student);
		
		if(bindingResult.hasErrors())
			return "studentForm";
		else
			return "studentConfirm";
	}
}
