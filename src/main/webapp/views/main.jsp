<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yarko
  Date: 11/7/2019
  Time: 01:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main Page</title>
</head>
<body>
    <c:forEach items="${humans}" var="human">
        <p>${human.getId()}</p> <p>${human.getFirstName()}</p>
    </c:forEach>

</body>
</html>
