
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Welcome to ***</title>
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

  <form method="POST" action="auth" style="backgroud:#234432;">
  
  
<div class="container">
<div class="row">
  <h2 class="h1 text-primary col-xs-12 col-sm-12 col-sm-offset-4">Welcome to ***</h2>
<div class ="col-sm-12 col-sm-offset-4 col-xs-12">



    <label class="text-primary"><b>Username</b></label>
    </div>
    
    <div class ="col-sm-12 col-sm-offset-4 col-xs-12">
    <input type="text" class="btn btn-default" placeholder="Enter Username" name="username" required>
    </div>
    <br></br>
<div class ="col-sm-12 col-sm-offset-4 col-xs-12">


    <label class="text-primary"><b>Password</b></label>
        </div>
    <div class ="col-sm-12 col-sm-offset-4 col-xs-12">
    <input type="password" class="btn btn-default" placeholder="Enter Password" name="password" required>
    <br></br>
    </div>
    
<div class ="col-sm-12 col-sm-offset-4 col-xs-12">  
    <button type="submit" class="btn btn-default btn-success">Login</button>
    <button type="reset" class="btn btn-default btn-success">Clear</button>
    </div>
    
<div class ="col-sm-12 col-sm-offset-4 col-xs-12">
<label style="color:maroon;" >New Team Member? </label><label><a style="color:blue;" href="newuser"> Click Here</a></label>

</div>    
  </form>
</div>
</div>
</div>
</body>
</html>