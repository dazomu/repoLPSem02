<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="Control02" method="post">
		<table>
			<tr>
				<td>Ingrese el lado A: </td>
				<td><input type="number" name="ladoA"></td>
			</tr>
			
			<tr>
				<td>Ingrese el lado B: </td>
				<td><input type="number" name="ladoB"></td>
			</tr>
			
			<tr>
				<td>Ingrese el lado C: </td>
				<td><input type="number" name="ladoC"></td>
			</tr>
			
			
			<tr>
				<td> <input type="hidden" name="pagina" value="pagTriangulo"> </td>
			</tr>
			
			<tr>
				<td><input type="submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>