package com.bankapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@GetMapping(path = "hellourl")
	public ModelAndView hello(ModelAndView mv) {
		mv.setViewName("hellopage");
		mv.addObject("data", "we love java");//data put into req scope
		return mv;
	}

}
