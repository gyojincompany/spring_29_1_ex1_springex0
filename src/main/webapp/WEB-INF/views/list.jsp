<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>list.jsp</title>
</head>
<body>
	<h1>게시글 목록</h1>
	
	<table width="500" cellpadding="0" cellspacing="0" border="1">
		<tr>
			<td>번호</td>
			<td>글쓴이</td>
			<td>내용</td>
			<td>삭제</td>		
		</tr>
		<c:forEach items="${list}" var="dto">
		<tr>
			<td>${dto.mId}</td>
			<td>${dto.mWriter}</td>
			<td>${dto.mContent}</td>
			<td><a href="delete?mId=${dto.mId}">X</a></td>
		</tr>				
		</c:forEach>
		<tr>
			<td colspan="4"><a href="writeForm">글쓰기</a></td>
		</tr>
	</table>
	
</body>
</html>