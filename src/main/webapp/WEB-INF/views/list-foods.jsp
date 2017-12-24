<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@include file="common/header.jspf"%>
<%@include file="common/navigation.jspf"%>
<%@include file="common/footer.jspf"%>

<html>
<head>
    <title>Foods</title>
</head>
<body>
<div class = "container">
<h1>Today's foods</h1>
<table class="table table-bordered">
    <thead>
    <tr class="table-secondary">
        <th class=>Description</th>
        <th>Date</th>
        <th>Is it Done?</th>
    </tr>
    </thead>
<tbody>
<c:forEach items="${foods}" var="food">
<tr>
    <td>${food.desc}</td>
    <td>${food.targetDate}</td>
    <td>${food.done}</td>
    <td><a class="btn btn-warning" href="/delete-food?id=${food.id}" role="button">Delete</a></td>
</tr>
</c:forEach>
</tbody>


</table>


<div>
<a class ="button" href="/add-food">Add food</a>
</div>
</div>
</body>
</html>
