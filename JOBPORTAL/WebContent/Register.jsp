<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New User</title>
<%@include file="components/common_css_js.jsp" %>
</head>
<body>
       <%@include file="components/Navbar.jsp"%>
        <div class="container-fluid">
            <div class="row mt-5">
                <div class="col-md-4 offset-md-4">                 
                    <div class="card">                       
                        <div class="card-body px-5">
                            <div class="container text-center">
                                <span class="fa fa-user-plus fa-3x text-center"></span>
                            </div>
                            <h1 class="text-center my-3">Sign Up here !!</h1>
                         
                           <h3>${regsuccess}</h3>
                            <form action="RegisterServlet" method="post">
                            
                                <div class="form-group">
                                    <label for="name">User Name</label>
                                    <input name="user_name" type="text" class="form-control" id="name" aria-describedby="emailHelp" placeholder="Enter User Name">
                                </div>
                                <div class="form-group">
                                    <label for="email">User Email</label>
                                    <input name="user_email" type="email" class="form-control" id="email" aria-describedby="emailHelp" placeholder="Enter User Email">
                                </div>
                                <div class="form-group">
                                    <label for="password">User Password</label>
                                    <input name="user_password" type="password" class="form-control" id="password" aria-describedby="emailHelp" placeholder="Enter User Password">
                                </div>
                                <div class="form-group">
                                 	<label for="Gender">User Gender</label><br>
                                 	<input class="form-check-label" type="radio" name="user_gender" id="flexRadioDefault1" value="Male">Male</input>
                                 	<input class="form-check-label" type="radio" name="user_gender" id="flexRadioDefault1" value="Female">Female</input>
                                </div>
                                <div class="form-group">
                                    <label for="phone">User phone</label>
                                    <input name="user_phone" type="number" class="form-control" id="phone" aria-describedby="emailHelp" placeholder="Enter User Phone">
                                </div>
                                <div class="form-group">
                                    <label for="address">User Address</label>
                                    <textarea name="user_address" style="height: 200px" class="form-control" placeholder="Enter Your Address"></textarea>
                                </div>
                                <div class="container text-center">
                                    <button class="btn btn-outline-success">Register</button>
                                    <button class="btn btn-outline-warning">Reset</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
</body>
</html>