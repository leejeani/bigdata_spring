<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style>
table{
	width:400px;
	border:2px solid black;
	text-align:center;
}
</style>
</head>
<body>
<h1>Product Detail Page</h1>
IMGNAME:${dproduct.imgname }<br>
ID:${dproduct.id }<br>
NAME:${dproduct.name }<br>
PRICE:${dproduct.price }<br>
REGDATE:${dproduct.regdate }<br>
<a href="userdelete.hw?id=${uu.id }">DELETE</a>
<a href="userupdate.hw?id=${uu.id }">UPDATE</a>
</body>
</html>







