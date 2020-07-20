<%--
  Created by IntelliJ IDEA.
  User: super
  Date: 2020/7/20
  Time: 21:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/e/t1" method="post">
    <label>
        <input type="text" name="name">
    </label>
    <input type="submit" value="提交">
</form>

</body>
</html>
