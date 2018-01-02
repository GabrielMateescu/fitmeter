<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="common/header.jspf"%>


<html>
<head>
    <title>Foods</title>
</head>
<body>
<div class="container">
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="<c:url value="/" />">Fitmeter</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="nav navbar-nav">
                <li class="nav-item active">
                    <a class="nav-link" href="<c:url value="/" />">Home <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="<c:url value="/calorie-calculator"/>">Calorie Calculator</a>
                </li>
            </ul>
        </div>

        <div class="navbar-nav mr-auto mt-2 mt-lg-0" >
            <li class="nav-item"><a class="nav-link" href="<c:url value="/logout"/>">Logout</a></li>
        </div>


    </nav>

</div>

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
