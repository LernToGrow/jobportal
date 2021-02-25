package com.niit.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.niit.dao.Sqlconnection;
import com.niit.dao.UserDao;
import com.niit.entity.user;;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		try (PrintWriter out = response.getWriter())
			{
			String email=request.getParameter("email");
			String password=request.getParameter("password");
			UserDao userdao=new UserDao();
			user newuser=userdao.getuserbyemailidpassword(email, password);
			if(newuser!=null)
			{
	               request.setAttribute("massage","Invalid details !! Try With Another one");
	               response.sendRedirect("Login.jsp");
	               return;
			}else
			{
				out.println("<h1>Welcome "+newuser.getUsername()+"</h1>");
	               if(newuser.getUsertype().equals("admin"))
	               {
	                   //admin.jsp
	                   response.sendRedirect("Admin.jsp");
	               }else if(newuser.getUsertype().equals("normal"))
	               {
	                   //normal.jsp
	                   response.sendRedirect("Normaluser.jsp");
	               }else
	               {
	                   out.println("we have not identified user type");
	               }
			}
			}
		}
	
	}


