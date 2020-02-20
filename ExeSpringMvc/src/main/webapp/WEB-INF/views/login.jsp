<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head><title>Login</title></head>
<body>
	<div align="center">
	<h1>Login</h1>

	<!-- /login?error=true -->
	<%-- <c:if test="${param.error == 'true'}">
         <div style="color:red;margin:10px 0px;">
          
                Login Failed!!!<br />
                Reason :  ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
                 
         </div>
    </c:if> --%>

	<c:if test="${loginResult == 'false'}">
		<div style="color: red; margin: 10px 0px;">
			Login Failed!!!
			<br />
		</div>
	</c:if>

	<h3>Enter user name and password:</h3>

	<form action="/ExeSpringMvc/loginResult" method='POST'>
		<table>
			<tr>
				<td>Email:</td>
				<td>
					<input type='text' name='email' value=''>
				</td>
			</tr>
			<tr>
				<td>Password:</td>
				<td>
					<input type='password' name='password' />
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input name="submit" type="submit" value="submit" />
				</td>
			</tr>
		</table>
	</form>
	</div>
</body>
</html>