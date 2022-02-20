<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>CHANGE PASSWORD</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>


</head>
<body>
	<div class="main-w3layouts wrapper">
		<h1>CHANGE PASSWORD</h1>
		<div class="main-agileinfo">
			<div class="agileits-top">
				<form action="changepassword.jsp" method="post">
					<input class="text" type="text" name="admin_name" placeholder="Admin_Name" required=""><br>
					<input class="text" type="password" name="password" placeholder="NEW Password" required="">
					<input class="text w3lpass" type="password" name="password" placeholder="Confirm Password" required="">
					
						
						
					<input type="submit" value="CHANGE PASSWORD">
				</form>
				
			</div>
		</div>
	
		
	</div>
	
</body>
</html>