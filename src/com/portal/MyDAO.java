package com.portal;

import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.List;  




import org.springframework.jdbc.core.BeanPropertyRowMapper;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.RowMapper;  
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.portal.UserBean;

import java.util.*;
	
	
	  
	public class MyDAO {  
	JdbcTemplate template;  
	  
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  
	

	
	public String auth(UserBean p)
	{
		String result="success";
		
		UserBean ld = new UserBean();
		List<Map<String, Object>> l = template.queryForList("select * from users where USERID='"+p.getUsername()+"'");
		System.out.println(p.getUsername());
		System.out.println("List Size "+l.size());
		if(l.size()>0)
		{
		
		 for(Map<String, Object> row : l){
	          String id = row.get("USERID").toString();
	          String name = row.get("PASSWORD").toString();
	          System.out.println(id +" / "+ name);
	          ld.setUsername(id);
	          ld.setPassword(name);
	         // System.out.println(ld.getUsername() +" / "+ ld.getPassword());
	         
	          
	          
	          if(ld.getPassword().equals(p.getPassword()))
	          {
	        	   result="success";
	          }
	          else
	          {
	        	  result= "invalid password";
	          }
		 
		 }
		}
		else
		{
			result= "invalid user name";
		}
		 
		return result;
		 
		 /*		Iterator it = l.iterator();
		while(it.hasNext())
		{
			Object o = it.next();
			System.out.println(o.ge);
		}
		*/
	}
	
	}
	    
	