<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@ page import="control.Control" %>
	
	
	
	<form action="Control" method="post">
		<table>
			<tr>
				<td>Nombre del empleado: </td>
				<td><input type="text" name="nombre"></td>
			</tr>
			<tr>
				<td>Cantidad de hijos: </td>
				<td><input type="text" name="cantidadHijos"></td>
			</tr>
			<tr>
				<td>Salario bruto: </td>
				<td><input type="text" name="salarioBruto"></td>
			</tr>
			<tr>
				
				<td><input type="submit"></td>
			</tr>
		
		</table>	
	</form>
	


</body>
</html>