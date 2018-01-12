<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="common/header.jspf"%>
<%@include file="common/navigation.jspf"%>

<body>
<div class = "container">

    <h3>Your input</h3>
    <table class="table table-bordered">
        <thead>
        <tr class="table-secondary">
            <th class=>CalorieCalculator</th>
            <th>Age</th>
            <th>Male</th>
            <th>Female</th>
            <th>Weight</th>
            <th>Height</th>
            <th>No exercise</th>
            <th>Light exercise</th>
            <th>Moderate exercise</th>
            <th>Intensive exercise</th>
            <th>Heavy exercise</th>
            <th>Sum</th>

        </tr>
        </thead>
        <tbody>
        <c:forEach items="${calorieinput}" var="calorieinput">
            <tr>
                <td>${calorieinput.age}</td>
                <%--<td>${calorieinput.male}</td>--%>
                <%--<td>${calorieinput.female}</td>--%>
                <%--<td>${calorieinput.weight}</td>--%>
                <%--<td>${calorieinput.height}</td>--%>
                <%--<td>${calorieinput.noExercise}</td>--%>
                <%--<td>${calorieinput.lightExercise}</td>--%>
                <%--<td>${calorieinput.moderateExercise}</td>--%>
                <%--<td>${calorieinput.intensiveExercise}</td>--%>
                <%--<td>${calorieinput.heavyExercise}</td>--%>
                <%--<td>${calorieinput.sum}</td>--%>
            </tr>
        </c:forEach>
        </tbody>


    </table>


    <div>
        <a class ="button" href="/calorie-calculator">Add another measurement</a>
    </div>
</div>

</body>
<%@include file="common/footer.jspf"%>

