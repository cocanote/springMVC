<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="ko">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Title</title>
		
	</head>

	<body>
		<p>Register Book</p>
		
		<form action="/p06001/book/regCon" method="get">
			name : <input type="text" name="name"></br>
			author : <input type="text" name="author"></br>
			isbn : <input type="text" name="isbn"></br>
			price : <input type="text" name="price"></br>
			<input type="submit" value="Register">
		</form>
	</body>
	
</html>
	