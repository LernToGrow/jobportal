<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contact us</title>
<%@include file="components/common_css_js.jsp"%>
<link rel="stylesheet" href="css/contactus.css"/>
</head>
<body>
	<%@include file="components/Navbar.jsp"%>
	<div class="container">
    <div class="form">
        <div class="contact-info">
            <h3 class="title">Let's get in touch</h3>
            <p class="text"> Contact us with the following details. and fillup the form with the details. </p>
            <div class="info">
                <div class="social-information"> <i class="fa fa-map-marker"></i>
                    <p>Mukai nagar,hinjewadi,pune</p>
                </div>
                <div class="social-information"> <i class="fa fa-envelope-o"></i>
                    <p>sumitkamble1252@gmail.com</p>
                </div>
                <div class="social-information"> <i class="fa fa-mobile-phone"></i>
                    <p>+91 7798042167</p>
                </div>
            </div>
            <div class="social-media">
                <p>Connect with us :</p>
                <div class="social-icons"> <a href="#"> <i class="fa fa-facebook-f"></i> </a> <a href="#"> <i class="fa fa-twitter"></i> </a> <a href="#"> <i class="fa fa-instagram"></i> </a> <a href="#"> <i class="fa fa-linkedin"></i> </a> </div>
            </div>
        </div>
        <div class="contact-info-form"> <span class="circle one"></span> <span class="circle two"></span>
            <form action="#" onclick="return false;" autocomplete="off">
                <h3 class="title">Contact us</h3>
                <div class="social-input-containers"> <input type="text" name="name" class="input" placeholder="Name" /> </div>
                <div class="social-input-containers"> <input type="email" name="email" class="input" placeholder="Email" /> </div>
                <div class="social-input-containers"> <input type="tel" name="phone" class="input" placeholder="Phone" /> </div>
                <div class="social-input-containers textarea"> <textarea name="message" class="input" placeholder="Message"></textarea> </div> <input type="submit" value="Send" class="btn" />
            </form>
        </div>
    </div>
</div>
</body>
</html>