<%--
  Created by IntelliJ IDEA.
  User: heejeong
  Date: 03/01/2019
  Time: 8:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Custom Login with Username and Password</h3>
<form name='f' action="<c:url value="/login"/>" method="post">
    <!-- For failed user authentication  -->
    <c:if test="${not empty errorMsg}">
        <div style="color: #ff0000;">
            <h3> ${errorMsg} </h3>
        </div>
    </c:if>

    <table>
        <tr>
            <td>User:</td>
            <td><input type='text' name='username' value=''></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type='password' name='password'/></td>
        </tr>
        <tr>
            <td colspan='2'>
                <input name="submit" type="submit" value="Login"/>
            </td>
        </tr>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    </table>
</form>
</body>
</html>
