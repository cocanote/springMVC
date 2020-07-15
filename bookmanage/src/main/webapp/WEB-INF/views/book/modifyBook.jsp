<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page session="false" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="ko">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Title</title>
		
	</head>

	<body>
		<p>Modify Book</p>
		
		<form action="/p06001/book/modCon" method="get">
			name : <input type="text" name="name" value=${b.name}></br>
			author : <input type="text" name="author" value=${b.author}></br>
			isbn : ${b.isbn}</br>
			<input type="hidden" name="isbn" value=${b.isbn}></br>
			price : <input type="text" name="price" value=${b.price}></br>
			<input type="submit" value="Modify">
		</form>

	</body>
	
</html>