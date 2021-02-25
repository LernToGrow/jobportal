package com.niit.servlet;

import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.istack.internal.logging.Logger;
import java.sql.*;
/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("user_name");
		String uemail=request.getParameter("user_email");
		String upass=request.getParameter("user_password");
		String ugender=request.getParameter("user_gender");
		String upnumber=request.getParameter("user_phone");
		String uaddress=request.getParameter("user_address");
		Connection con;
		PreparedStatement ps;
		try {
			RequestDispatcher rd;
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con= DriverManager.getConnection("jdbc:sqlserver://SAM;databasename=JBOPORTAL","sa","root");
			String url="INSERT INTO Uuser(uname,uemail,upassword,ugender,upnumber,uaddress,usertype)VALUES(?,?,?,?,?,?,?)";
			ps=con.prepareStatement(url);
			ps.setString(1,uname);
			ps.setString(2,uemail);
			ps.setString(3,upass);
			ps.setString(4,ugender);
			ps.setString(5,upnumber);
			ps.setString(6,uaddress);
			ps.setString(7,"normal");
			ps.executeUpdate();
			System.out.println("done");
			con.close();
			request.setAttribute("regsuccess","Successfuly Registered Login to Check");
			rd=request.getRequestDispatcher("Login.jsp");
			//esponse.sendRedirect("Login.jsp");
			rd.forward(request, response);
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
