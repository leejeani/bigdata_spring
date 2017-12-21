<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<style>
div{
	width:300px;
	border:2px solid red;
}
</style>
<script>
$(document).ready(function(){
	function display(data){
		var output = '';
		$(data).each(function(index,item){
			output += '<h3>';
			output += item.id+' '
			+item.price+' '
			+item.name+' '
			+item.regdate+' ';
			output += '</h3>';
		});
		$('div').html(output);
	};
	function requestAJAX(){
		alert('requestAJAX');
		$.ajax({
			url:'getdata.hw',
			success:function(data){
				display(data);
			}
		});
	};
	
	$('button').click(function(){

		requestAJAX();	
	});
});
</script>
</head>
<body>
<h1>Main Page</h1>
<h5><a href="main.hw?lang=en">en</a></h5>
<h5><a href="main.hw?lang=ko">ko</a></h5>
<c:choose>
	<c:when test="${loginuser == null }">
		<a href="login.hw">LOGIN</a>
	</c:when>
	<c:otherwise>
		${loginuser.id }님
		<a href="logout.hw">LOGOUT</a>
	</c:otherwise>
</c:choose>

<spring:message code="welcome.txt"
arguments="hi ,Seoul"/>

<h3><a href="userlist.hw">User List</a></h3>
<h3><a href="useradd.hw">User ADD</a></h3>
<h3><a href="productlist.hw">Product List</a></h3>
<h3><a href="productadd.hw">Product ADD</a></h3>
<button>GET DATA</button>
<div></div>

</body>
</html>




