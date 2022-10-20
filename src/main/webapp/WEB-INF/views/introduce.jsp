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
		<li>
			<ul>名前：金明焄</ul>
			<ul>生年月日：1995年 11月 23日</ul>
			<ul>住所：東京都豊島区南大塚大塚1-42-4</ul>
			<ul>学歴：2020年 大韓民国 忠北大学校 コンピューター工学卒業</ul>
			<ul>職場：コマースニジュウイチ（在）</ul>
			<ul>特異事項：日本住まい二年目の人間で、色々学びながら住んでます。よろしくお願いいたします。</ul>
		</li>
	</div>

	<footer>
	</footer>
</body>
</html>