<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Welcome to File Services</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
  body{
    background: white;
    }
    html {
   height: 100%;
  }
 
 .row {
     margin-right: -15px;
    margin-left: 25px;
    padding-top: 120px; }
    
    a {
    color: #fff;
}
        
</style>
</head>
<body>

  <form:form commandName="loginBean" method="POST" action="auth">
  
  
<div class="container">
<div class="row">
  <h2 class="h1 text-primary col-xs-12 col-sm-12 col-sm-offset-4">Welcome to FS</h2>
  
  <div class ="col-sm-12 col-sm-offset-4 col-xs-12">
    <label  style="color:red;"><b>Invalid UserName or Password</b></label>
    </div>
  
	<div class ="col-sm-12 col-sm-offset-4 col-xs-12">
    <label class="text-primary"><b>Username</b></label>
    </div>
    
    <div class ="col-sm-12 col-sm-offset-4 col-xs-12">
    <form:input path="username" class="btn btn-default" id="username" name="username" />
    </div>
    <br></br>
<div class ="col-sm-12 col-sm-offset-4 col-xs-12">


    <label class="text-primary"><b>Password</b></label>
        </div>
    <div class ="col-sm-12 col-sm-offset-4 col-xs-12">
    <form:input type="password" class="btn btn-default" path="password" name="password" id="password" />
    <br></br>
    </div>
    
<div class ="col-sm-12 col-sm-offset-4 col-xs-12">  
    <button type="submit" class="btn btn-default btn-success">Login</button>
    <button type="reset" class="btn btn-default btn-success" onclick="javascript:document.form[0].reset();">Clear</button>
    </div>
    
<div class ="col-sm-12 col-sm-offset-4 col-xs-12">
<label style="color:maroon;" >New Team Member? </label><label><a style="color:blue;" href="newuser"> Click Here</a></label>

</div>    
    
  </form:form>
</body>
</html>


 