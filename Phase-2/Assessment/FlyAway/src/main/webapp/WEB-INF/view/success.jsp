<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>CHANGE PASSWORD</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Custom Theme files -->
<link href="css/style1.css" rel="stylesheet" type="text/css" media="all" />
<!-- //Custom Theme files -->
<!-- web font -->
<link href="//fonts.googleapis.com/css?family=Roboto:300,300i,400,400i,700,700i" rel="stylesheet">
<!-- //web font -->
</head>
<body>
	<!-- main -->
	
		<h1>CHANGE PASSWORD</h1>
			<div>
				<form action="changepassword.jsp" method="post">
					<input class="text" type="text" name="name" placeholder="name" required=""><br>
					<input class="text" type="password" name="pass" placeholder="NEW Password" required="">
					<input class="text w3lpass" type="password" name="pass1" placeholder="Confirm Password" required="">
					
						
						
					<input type="submit" value="CHANGE PASSWORD">
				</form>
				
			</div>
		
		<!-- copyright -->
		
		<!-- //copyright -->
		
	</div>
	<!-- //main -->
</body>
</html>