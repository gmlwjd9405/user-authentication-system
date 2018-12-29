<%--
  Created by IntelliJ IDEA.
  User: heejeong
  Date: 29/12/2018
  Time: 7:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach var="offer" items="${offers}">
        <p>
            <c:out value="${offer}"/>
        </p>
    </c:forEach>
</body>
</html>
