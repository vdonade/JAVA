<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
</head>
<body>
 <form action="SaveProduct" method="post">
Product Name: <input type="text" name="name"><br><br>
Product Price:<input type="text" name="price"><br> <br>
Product Size:<input type="text" name="size"><br> <br>
<input type="submit" value="Add Product"/>

</form>
</body>
</html>