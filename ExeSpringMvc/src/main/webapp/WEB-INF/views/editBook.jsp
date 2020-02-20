<%-- <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="POST" action="/ExeSpringMvc/editSave">
		<input id="id" name="id" type="hidden" value="${id}" />
		Title :
		<input type="text" name="title">
		<br />
		Author :
		<input type="text" name="author" />
		<br />
		Description :
		<input type="text" name="description" />
		<br />
		<input type="submit" value="Edit Save" />
	</form>
</body>
</html> --%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="POST" action="/ExeSpringMvc/editSave">
		<input id="id" name="id" type="hidden" value="${id}" />
		<table>
			<tbody>
				<tr>
					<td>Title :</td>
					<td>
						<input type="text" name="title">
					</td>
				</tr>
				<tr>
					<td>Author :</td>
					<td><input type="text" name="author" /></td>
				</tr>
				<tr>
					<td>Description :</td>
					<td><input type="text" name="description" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Edit Save" /></td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>