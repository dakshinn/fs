package com.portal;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.bind.annotation.ModelAttribute;
@SessionAttributes("user")

public class CheckUserInterceptor extends HandlerInterceptorAdapter {
	
	//@Resource
  //  private user user;
	

    
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
            Object handler, @ModelAttribute("user") UserBean login) throws IOException {

        if (request.getServletPath().equals("/index.jsp")) {
            return true;
        }

        String username = login.getUsername();
        System.out.println("username : "+ username);
        // If the username has not been set by the login controller    
        if (username != null) {
            return true;
        } else {
            response.sendRedirect("index.jsp");
            return false;
        }
}
}