package com.portal;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList; 

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpSessionRequiredException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

//import com.sun.corba.se.pept.transport.Connection;

import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.context.request.WebRequest;
@Controller
@SessionAttributes("userid")
public class MyController {
	
	
	 @Autowired  
	    MyDAO dao;

	 
	 @RequestMapping(value="/auth",method = RequestMethod.POST)  
	    public ModelAndView auth(@ModelAttribute("loginBean") UserBean login){  
		 	ModelAndView mav = new ModelAndView();
		 	//mav.addObject("login", login);
		  	String result=dao.auth(login);
		  	String result123=dao.auth(login);
	        if(result.equals("success"))
	        {
//	        	System.out.println("Success");
	        	//List<Login> list=dao.getEmployees();
	        	//mav.addObject("list", list);
	        	mav.addObject("userid",login);
	        	mav.setViewName("home");	
	        	
	        	
	        	
	     //   return new ModelAndView("redirect:/success");//will redirect to viewemp request mapping  
	        }
	        
	        else
	        {
	        	System.out.println("Failure");
	        //	return new ModelAndView("redirect:/login");
	        	//mav.addObject("results",result);
	        	//mav.addObject("username",login);	        	
	        	mav.setViewName("invalidlogin");	
	        }
			return mav;
	        
	    }       
	 
	 
	
     }