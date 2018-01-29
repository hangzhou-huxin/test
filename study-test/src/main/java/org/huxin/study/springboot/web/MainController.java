package org.huxin.study.springboot.web;


import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping(value = "/main.html", method = RequestMethod.GET)
	public ModelAndView hello(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("main") ;
		
		return mv ;
	}

}
