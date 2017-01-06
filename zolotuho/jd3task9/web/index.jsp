<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<%
    String name = request.getParameter("name");
    String phone = request.getParameter("phone");
    String email = request.getParameter("email");
%>
<div style="background-color: azure">
<hr/>
<h2> name:     <%= name %> </h2> <br/>
<h2>phone:     <%= phone %></h2> <br/>
<h2>email:     <%= email %></h2>
<hr/>
</div>
</body>
</html>
