<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="gen" class="generate.Generator" scope="session"/>
<jsp:setProperty name="gen" property="*"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mathe Aufgaben Generator</title>
</head>
<body>
	<h2>Hallo meine Lieben!</h2>
	<p>Hier könnte Ihr eine beliebige Anzahl von Matheaufgaben ausgeben
		lassen.</p>
	<form action="result.jsp" method="POST">
		<b>Anzahl der Aufgaben:</b> <input type="text" name="anzahl">
		<br> <b>Untere Schranke:</b> <input type="text" name="rangeMin">
		<br> <b>Obere Schranke:</b> <input type="text" name="rangeMax">
		<p>&nbsp; <input type="submit" value="Generieren" /></p>
	</form>
</body>
</html>

