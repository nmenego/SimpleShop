<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Simple Shop</title>
    <style type="text/css">
        .tg {
            border-collapse: collapse;
            border-spacing: 0;
            border-color: #ccc;
        }
        .tg td {
            font-family: Arial, sans-serif;
            font-size: 14px;
            padding: 10px 5px;
            border-style: solid;
            border-width: 1px;
            overflow: hidden;
            word-break: normal;
            border-color: #ccc;
            color: #333;
            background-color: #fff;
        }
        .tg th {
            font-family: Arial, sans-serif;
            font-size: 14px;
            font-weight: normal;
            padding: 10px 5px;
            border-style: solid;
            border-width: 1px;
            overflow: hidden;
            word-break: normal;
            border-color: #ccc;
            color: #333;
            background-color: #f0f0f0;
        }
        .tg .tg-4eph {
            background-color: #f9f9f9
        }
        .error {
            color: #ff0000;
        }
    </style>
</head>
<body>

<h1>Welcome to Simple Shop!</h1>

<h2>Currently Available on our Shop</h2>
<c:if test="${!empty error}">
    <p class="error">${error}</p>
</c:if>
<c:if test="${!empty inventory}">
    <table class="tg">
        <tr>
            <th width="80">Item ID</th>
            <th width="120">Item Name</th>
            <th width="120">Item Count</th>
        </tr>
        <c:forEach items="${inventory}" var="item">
            <tr>
                <td>${item.itemId}</td>
                <td>${item.itemName}</td>
                <td>${item.count}</td>
            </tr>
        </c:forEach>
    </table>
</c:if>

<h2>Your shopping:</h2>
<form:form action="/buy" commandName="orderForm">
    <table>
        <tr>
            <td>Item A</td>
            <td><form:input path="itemACount" /></td>
        </tr>
        <tr>
            <td>Item B</td>
            <td><form:input path="itemBCount" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="<spring:message text="Buy"/>" />
            </td>
        </tr>
    </table>
</form:form>

<a href="<spring:url value="/reset"/>">Reset</a>

</body>
</html>
