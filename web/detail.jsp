<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>

</head>
<body>
<h1>Detail Page</h1>
ID: ${duser.id }<br>
PWD: ${duser.pwd }<br>
NAME: ${duser.name }<br>
<a href="add.mc?cmd=delete&id=${duser.id }">DELETE</a>
</body>
</html>







