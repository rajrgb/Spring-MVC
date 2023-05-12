package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import model.User;

@Controller
@RequestMapping("/register")
public class RegistrationController {

	@RequestMapping(method=RequestMethod.POST)
	public String register(@ModelAttribute User user) {
		System.out.println(user);
		return "success";
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String registerGet() {
		return "register";
	}
}
