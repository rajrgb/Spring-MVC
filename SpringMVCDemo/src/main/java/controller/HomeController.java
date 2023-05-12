package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.*;
@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model m) {
		m.addAttribute("name", "Raj Kr. Tiwari");
		System.out.println("This is home url.");
		return "index";
	}
	@RequestMapping("/about")
	public ModelAndView about() {
		ModelAndView m=new ModelAndView();
		
		m.addObject("youtube","youtube.com/raj tiwari");
		m.addObject("mail","raj1234@gmail.com"); 
		m.setViewName("about");
		System.out.println("About controller is hit.");
		return m;
	}
	@RequestMapping("/exp")
	public ModelAndView expressionLanguage() {
		ModelAndView m=new ModelAndView();
		
		List<Integer> li=new ArrayList<Integer>();
		li.add(11);
		li.add(22);
		li.add(33);
		li.add(44);
		
		m.addObject("table",li);
		m.setViewName("exp");
		
		return m;
	}
	@RequestMapping("/jstlPage")
	public ModelAndView jstlPage() {
		ModelAndView m=new ModelAndView();
		List<Integer> li=new ArrayList<Integer>();
		li.add(11);
		li.add(22);
		li.add(33);
		li.add(44);
		m.addObject("nums",li);
		
		LocalDateTime t=LocalDateTime.now();
		m.addObject("currDT",t);
		
		m.setViewName("jstlPage");
		return m;
	}
}
