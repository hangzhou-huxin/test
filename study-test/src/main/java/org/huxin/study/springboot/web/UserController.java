package org.huxin.study.springboot.web;


import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@RequestMapping(value = "/main.html", method = RequestMethod.GET)
	public ModelAndView hello(HttpServletRequest request) {
		//String path = request.getServletContext().getRealPath("/") ;
		//System.out.println("------------dddddddddd----------------------------");
		//System.out.println("path:" + path);
		ModelAndView mv = new ModelAndView("welcome") ;
		mv.addObject("time", new Date());
		mv.addObject("message", "ddd");
		return mv ;
	}

}
