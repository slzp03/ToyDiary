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
			<li><a href="/edit">EDIT</a></li>
	    </ul>
	  </nav>
	</header>

	<div>
		<h2>회원가입</h2>

	<form action="join_ok.jsp" method="post">
		아이디:<input type="text" name="id"><br/>
		비밀번호:<input type="password" name="pw"><br/>
		이름:<input type="text" name="name"><br/>
		전화번호:
		<select name="phon1">
			<option>010</option>
			<option>02</option>
			<option>031</option>
			<option>051</option>
		</select>
		- <input type="text" name="phone2" size="5">
		- <input type="text" name="phone3" size="5">

		<br/>
		<input type="radio" name="gender" value="m" checked>남자
		<input type="radio" name="gender" value="f">여자

		<input type="submit" value="가입">

	</form>
	</div>

	<footer>
	</footer>
</body>
</html>