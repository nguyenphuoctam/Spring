<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Books Store Application</title>
</head>
<body>
	<center>
		<h1>Books Management</h1>
		<h2>
			<a href="/ExeSpringMvc/home">Home</a>
			&nbsp;&nbsp;&nbsp;
			<!-- <a href="/ExeSpringMvc/list">List All Books</a> -->

		</h2>
	</center>
	<div align="center">
		<table border="1" cellpadding="5">
			<caption>
				<h2>Description Book</h2>
			</caption>
			<tr>
				<th>ID</th>
				<th>Title</th>
				<th>Author</th>
				<th>Description</th>
				<th>CreatedAt</th>
				<th>UpdatedAt</th>
			</tr>
				<tr>
					<td>
						<c:out value="${book.id}" />
					</td>
					<td>
						<c:out value="${book.title}" />
					</td>
					<td>
						<c:out value="${book.author}" />
					</td>
					<td>
						<c:out value="${book.description}" />
					</td>
					<td>
						<c:out value="${createdAt}" />
					</td>
					<td>
						<c:out value="${UpdatedAt}" />
					</td>
				</tr>
		</table>
	</div>
</body>
</html>