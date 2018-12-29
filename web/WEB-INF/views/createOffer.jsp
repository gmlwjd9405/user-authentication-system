<%--
  Created by IntelliJ IDEA.
  User: heejeong
  Date: 29/12/2018
  Time: 10:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="/resources/css/main.css">
</head>
<body>
<form method="post" action="/createOffer">
    <table class="formTable">
        <tr>
            <td class="label">Name:</td>
            <td>
                <input class="control" type="text" name="name"/>
            </td>
        </tr>
        <tr>
            <td class="label">Email:</td>
            <td>
                <input class="control" type="text" name="email"/>
            </td>
        </tr>
        <tr>
            <td class="label">Text:</td>
            <td>
                <textarea class="control" name="text" rows="10" cols="10"></textarea>
            </td>
        </tr>
        <tr>
            <td class="label"></td>
            <td>
                <input class="control" type="submit" value="new Offer"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
