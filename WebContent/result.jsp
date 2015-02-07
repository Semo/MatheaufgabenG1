<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.ArrayList"%>
<jsp:useBean id="gen" class="generate.Generator" scope="session" />
<jsp:setProperty name="gen" property="*" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mathe Aufgaben Generator - Ergebnisse</title>
</head>
<body>
	<h1>Hier sind die Mathe-Aufgaben</h1>
	<c:forEach items="${List}" var="stringList">
		<c:out value='${List}' />
	</c:forEach>
</body>
</html>