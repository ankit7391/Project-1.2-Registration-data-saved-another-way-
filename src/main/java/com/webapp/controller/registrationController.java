package com.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.webapp.Service.RegistrationService;
import com.webapp.entity.Registration;

@Controller
public class registrationController {
	
	@Autowired
	private RegistrationService registrationService;

	//http://localhost:8080/view-registration-page
	
	
	//Handler Method
	
	@RequestMapping("/view-registration-page")
	public String viewsRegistrationPage() {
		return "new_registration";
		
	}
	
	
	
//      @RequestMapping("/saveReg")
//	 public String saveRegistration(@ModelAttribute Registration registration) {
//		
//		registrationService.saveRegistration(registration);
//		return"new_registration";
//	}
	
	
	

    @RequestMapping("/saveReg")
	 public String saveRegistration(
			 
			@RequestParam("firstName") String fName, //fName is a method Argument
			@RequestParam("lastName") String LName,  // LName is a Method Argument
			@RequestParam("email") String email,     // email is a method Argument
			@RequestParam ("mobile") long mobile     // mobile is a method Argument
			 
			 
			 ) {
		
    	Registration registration = new Registration();
    	registration.setFirstName(fName);
    	registration.setLastName(LName);
    	registration.setEmail(email);
    	registration.setMobile(mobile);
    	
    	
    	
    	
		registrationService.saveRegistration(registration);
		return"new_registration";
	}
	
	
	
	
}
