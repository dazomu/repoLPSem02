<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h2>Rectangulo</h2>
	
	<form action="Control02" method="post">
		<table>
			<tr>
				<td>Ingrese el base: </td>
				<td><input type="number" name="base"></td>
			</tr>
			<tr>
				<td>Ingrese la altura: </td>
				<td><input type="number" name="altura"></td>
			</tr>
			
			<tr>
				<td> <input type="hidden" name="pagina" value="pagRectangulo"> </td>
			</tr>
			
			<tr>
				<td><input type="submit"></td>
			</tr>
		</table>
	</form>
	
</body>
</html>