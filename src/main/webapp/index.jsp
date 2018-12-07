<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<html>
<body>
<h2>在线人数:${num}</h2><hr/>
<form action="/exit" method="post">
    清除当前session<input type="submit">
</form>
</body>
</html>
