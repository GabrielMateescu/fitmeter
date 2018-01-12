<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="common/header.jspf"%>
<%@include file="common/navigation.jspf"%>

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
        <th class=>Food</th>
        <th>Calories</th>
        <th>Carbs</th>
        <th>Protein</th>
        <th>Fat</th>
        <th>Sugar</th>
        <th>Date</th>
        <th></th>
    </tr>
    </thead>
<tbody>
<c:forEach items="${foods}" var="food">
<tr>
    <td>${food.desc}</td>
    <td>${food.calories}</td>
    <td>${food.carbs}</td>
    <td>${food.protein}</td>
    <td>${food.fat}</td>
    <td>${food.sugar}</td>
    <td>${food.targetDate}</td>
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
<%@include file="common/footer.jspf"%>
</html>
