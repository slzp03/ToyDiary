<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Introduce</title>
	<meta name="description" content="" />
    <spring:url value="/resources/styles.css" var="stylesCss" />
    <link href="${stylesCss}" rel="stylesheet">
</head>
<body>

	<header>
	  <nav class="website-nav">
	    <ul>
	    	<li style="text-align:left"><a href="/">HOME</a></li>
			<li><a href="/introduce">INTRODUCE</a></li>
			<li><a href="/diary">DIARY</a></li>
	    </ul>
	  </nav>
	</header>

	<div>
		Diary
	</div>

	<footer>
	</footer>
</body>
</html>