<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
String admin_name=request.getParameter("admin_name");
String password=request.getParameter("password");
try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/FlyAway","root","password");
	PreparedStatement ps=con.prepareStatement("update admin set password=? where admin_name=?");
	ps.setString(1,admin_name);
	ps.setString(2,password);
	int i=ps.executeUpdate();
	if(i>0)
	{
		response.sendRedirect("adminlogin.jsp");
	}
	else{
		response.sendRedirect("index.jsp");
	}
}
catch(Exception e)
{
	e.printStackTrace();
}
	%>
</body>
</html>