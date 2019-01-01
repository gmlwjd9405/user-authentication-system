<%--
  Created by IntelliJ IDEA.
  User: heejeong
  Date: 29/12/2018
  Time: 10:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="springform" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="/resources/css/main.css">
</head>
<body>
<springform:form method="post" action="/createOffer" modelAttribute="offer">
    <table class="formTable">
        <tr>
            <td class="label">Name: </td>
            <td>
                <springform:input class="control" type="text" path="name"/>
                <br/>
                <springform:errors class="error" path="name"/>
            </td>
        </tr>
        <tr>
            <td class="label">Email: </td>
            <td>
                <springform:input class="control" type="text" path="email"/>
                <br/>
                <springform:errors class="error" path="email"/>
            </td>
        </tr>
        <tr>
            <td class="label">Text: </td>
            <td>
                <springform:textarea class="control" path="text" rows="10" cols="10"/>
                <br/>
                <springform:errors class="error" path="text"/>
            </td>
        </tr>
        <tr>
            <td class="label"> </td>
            <td>
                <input class="control" type="submit" value="New Offer"/>
            </td>
        </tr>
    </table>
</springform:form>
</body>
</html>
