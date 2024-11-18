<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@ page import="modelo.Empleado"%>
	<% Empleado e = (Empleado) request.getAttribute("datosEmpleado");	%>
	
		<table>
		
			<tr>
				<td>Bonificacion: </td>
				<td><%=e.bonificacion() %></td>
			</tr>
			<tr>
				<td>Salario Neto: </td>
				<td><%=e.salarioNeto() %></td>
			</tr>
		
			
		
		</table>	
	



</body>
</html>