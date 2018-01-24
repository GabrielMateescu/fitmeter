<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="common/header.jspf"%>
<%@include file="common/navigation.jspf"%>

<body>
<div class = "container">

    <h3>Your input - CalorieCalculator</h3>
    <table class="table table-bordered">
        <thead>
        <tr class="table-secondary">
            <th>Age</th>
            <th>Male</th>
            <th>Female</th>
            <th>Weight</th>
            <th>Height</th>
            <th>Light exercise</th>
            <th>Moderate exercise</th>
            <th>Heavy exercise</th>
            <th>Calories Burned</th>

        </tr>
        </thead>
        <tbody>
        <%--<c:forEach items="${calcInput}" var="calcInput">--%>
            <tr>
                <td>${age}</td>
                <td>${calcInput.male}</td>
                <td>${calcInput.female}</td>
                <td>${weight}</td>
                <td>${height}</td>
                <td>${calcInput.lightExercise}</td>
                <td>${calcInput.moderateExercise}</td>
                <td>${calcInput.heavyExercise}</td>
                <td>${sum}</td>
            </tr>
        <%--</c:forEach>--%>
        </tbody>


    </table>


    <div>
        <a class ="button" href="/calorie-calculator">Add another measurement</a>
    </div>
</div>

</body>
<%@include file="common/footer.jspf"%>

