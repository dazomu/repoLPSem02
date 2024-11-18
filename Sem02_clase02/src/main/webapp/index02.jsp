<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ page import="control.Control02" %>
		
	<form action="Control02" method="post">
		
		<label>Elija la figura</label>
		
		<select name="figura">
			<option>Triangulo</option>
			<option>Cuadrado</option>
			<option>Rectangulo</option>
		</select>
		
		<input type="hidden" name="pagina" value="index">
		
		<input type="submit" value="Enviar" name="Enviar">
		<input type="Reset" value="Borrar" name="Borrar">
	
	</form>

	

</body>
</html>