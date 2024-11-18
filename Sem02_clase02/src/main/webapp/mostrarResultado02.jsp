<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@ page import="modelo.Resultado" %>

	<%  Resultado r = (Resultado) request.getAttribute("objeto"); %>

	<h2><%= r.getTipo() %></h2>
	<table>
		 	
			<tr>
				<td>Area: </td>
				<td> <%=r.getArea() %></td>
			</tr>
			<tr>
				<td>Perimetro </td>
				<td><%=r.getPerimetro() %></td>
			</tr>
				
			

	</table>
</body>
</html>