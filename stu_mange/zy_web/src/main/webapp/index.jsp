<%--
  Created by IntelliJ IDEA.
  User: set_free
  Date: 2019/12/28
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="service.PSayHello" %>
<%@page import="test.C_Test" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="color:red">hello word.</div>
<% PSayHello phello = new PSayHello();phello.test();C_Test ct = new C_Test();ct.test(); %>

</body>
</html>
