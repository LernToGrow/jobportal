			package com.niit.dao;
			import java.sql.Connection;
			import java.sql.DriverManager;
			import java.sql.PreparedStatement;
			import java.sql.ResultSet;
			
			import com.niit.entity.*;
			public class UserDao {
				public user getuserbyemailidpassword(String email,String password)
				{
					Connection con=null;
					PreparedStatement ps;
					user User=null;
					try {
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						con= DriverManager.getConnection("jdbc:sqlserver://SAM;databasename=JBOPORTAL","sa","root");
						String url="select * from Uuser where uemail=? and upassword=?";
						ps=con.prepareStatement(url);
						ps.setString(1,email);
						ps.setString(2,password);
						ResultSet rs=ps.executeQuery();
						while(rs.next())
						{
							User.setEmail(rs.getString(1));
							User.setPassword(rs.getString(2));
						}
						con.close();	
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					return User;
					
				}
			}
