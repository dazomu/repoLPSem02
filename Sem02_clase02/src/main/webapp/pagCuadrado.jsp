<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Datos del cuadrado</h1>

	<form action="Control02" method="post">
		<table>
			<tr>
				<td>Ingrese el lado: </td>
				<td><input type="number" name="lado"></td>
			</tr>
			
			<tr>
				<td> <input type="hidden" name="pagina" value="pagCuadrado"> </td>
			</tr>
			<tr>
				<td><input type="submit"></td>
			</tr>
		</table>
	</form>

</body>
</html>