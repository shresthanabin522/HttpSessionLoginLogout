<%--
  Created by IntelliJ IDEA.
  User: nabin
  Date: 4/4/19
  Time: 4:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<form action="LoginServlet" method="post">
    Name::<input type="text" name="name">
    Password::<input type="password" name="password"><br>
    <input type="submit" value="login">
</form>

</body>
</html>
