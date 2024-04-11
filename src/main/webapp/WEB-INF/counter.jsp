<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Current visit count</title>
	</head>
	
	<body>
		<h3> You have visited <a href=# > http://your_server</a> <c:out value="${count}"/> times </h3>
		<a href="/" > Test another visit? </a>
		
		<div>
				<a href="/double" > Or want to add two to your count? </a>
		</div>
		
		<div>
			<form action="/reset" method="GET"> 
				<button> Reset </button>
			</form>
		</div>
		
		
	</body>
</html>