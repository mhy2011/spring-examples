<%--
  Created by IntelliJ IDEA.
  User: mahaiyuan
  Date: 16/9/1
  Time: 下午11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
</head>
<body>
<h2>用户注册</h2>
<form method="post" action="/user/doRegister">
    邮箱:<input type="text" name="username"><br/>
    密码:<input type="password" name="password"><br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
