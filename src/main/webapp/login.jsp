<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="login" method="post">
username :<input type="text" name="Uname" value=${cookie['user'].value} ><br><br>
password :<input type="password" name="Pword"/><br><br>

Remember me <input type="checkbox" name="remember"  
<c:if test ="${cookie.containsKey('user')}"> checked = "true" </c:if> />
<br><br>



<input type="submit" value="login" />
 
${error}

</form>



</body>
</html>