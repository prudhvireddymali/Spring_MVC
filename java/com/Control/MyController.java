package com.Control;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping("/CHICK")//href
	public ModelAndView myMethodthree(){
	ModelAndView mv=new ModelAndView("INPUT");// Page name
	return mv;
	
	}
	@RequestMapping("/Addition")//href
	public ModelAndView myMethodfour(HttpServletRequest request){
	ModelAndView mv=new ModelAndView("RESULT");// Page name
	int i=Integer.parseInt(request.getParameter("num1"));
	int j=Integer.parseInt(request.getParameter("num2"));
	int sum=0;
	{
		sum=i+j;
	}
	
	mv.addObject("sumofnum",sum);
	mv.addObject("numone",i);
	mv.addObject("numtwo", j);
	
	return mv;
	
	}

}
