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
		<p>Read Books</p>
		

		<ol>
			<c:choose>
				<c:when test="${fn:length(list) > 0}">
					<c:forEach items="${list}" var="item">
						<li>
						[name] ${item.name}, [author] ${item.author}, [isbn] ${item.isbn}, [price] ${item.price} 
						<a href="/p06001/book/mod/?isbn=${item.isbn}">수정</a> <a href="/p06001/book/del/?isbn=${item.isbn}">삭제</a>
						</li>
					</c:forEach>
				</c:when>
				<c:otherwise>
					book: 0
				</c:otherwise>
			</c:choose>
			
		<ol>
		
		</br>
		<a href="/p06001/book/reg">신규등록</a>
	</body>
	
</html>
	