<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Product Management Application</title>
</head>
<body>

    <div>

        <c:if test="${product == null}">
			<form action="insert" method="post">
        </c:if>
        <table>
            <caption>
            	<h2>
            		<c:if test="${product == null}">
            			Add New Product
            		</c:if>
            	</h2>
            </caption>
        		<c:if test="${product != null}">
        			<input type="hidden" name="id" value="<c:out value='${product.id}' />" />
        		</c:if>            
            <tr>
                <th>	product Name: </th>
                <td>
                	<input type="text" name="name"
                			value="<c:out value='${product.name}' />"
                		/>
                </td>
            </tr>
            <tr>
                <th>Product Price: </th>
                <td>
                	<input type="text" name="price" 
                			value="<c:out value='${product.price}' />"
                	/>
                </td>
            </tr>
            <tr>
                <th>Size: </th>
                <td>
                	<input type="text" name="size" 
                			value="<c:out value='${product.size}' />"
                	/>
                </td>
            </tr>
            <tr>
            	<td >
            		<input type="submit" value="Save" />
            	</td>
            </tr>
        </table>
        </form>
    </div>	
</body>
</html>