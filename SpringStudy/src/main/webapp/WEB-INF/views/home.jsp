<%--  
	web.xml에 필터를 적용하여 모든 파라미터 값과 jsp에 강제 인코딩을 하거나..
	.jsp 생성시 
	<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
	태그를 선언하여 선언된 jsp페이지를 인코딩하여 한글을 출력하자.	 
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world! ${message}  
	<!-- controller에서 model.addAttribute에 message로 선언된 값을 출력해준다.-->
</h1>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
