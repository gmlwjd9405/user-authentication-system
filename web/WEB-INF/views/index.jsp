<%--
  Created by IntelliJ IDEA.
  User: heejeong
  Date: 2018. 12. 17.
  Time: 오후 5:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h3>This is a homepage for shopping</h3>
    <p>
        <a href="${pageContext.request.contextPath}/offers"> Show current Offers</a>
    </p>
    <p>
        <a href="/createOffer"> Add a new Offer</a>
    </p>

    <c:if test="${pageContext.request.userPrincipal.name != null}">
        <a href="javascript:document.getElementById('logout').submit()">Logout</a>
    </c:if>
    <!-- logout processing module of spring security 4 -->
    <form id="logout" action="<c:url value="/logout" />" method="post">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
    </form>
</body>
</html>
