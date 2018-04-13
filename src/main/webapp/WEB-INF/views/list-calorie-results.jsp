<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="common/header.jspf"%>
<%@include file="common/navigation.jspf"%>

<body>
<div class = "container">
<br>

    <h3>Results based on your current measurements:</h3>
    <br>
    <h5>
        You need
        <small class="text-muted">${sum}</small>
        calories to maintain your weight.
    </h5>

    <br>
<%--<table class="table table-bordered">--%>
        <%--<thead>--%>
        <%--<tr class="table-secondary">--%>
            <%--<th>Age</th>--%>
            <%--<th>Male</th>--%>
            <%--<th>Female</th>--%>
            <%--<th>Weight</th>--%>
            <%--<th>Height</th>--%>
            <%--<th>Light exercise</th>--%>
            <%--<th>Moderate exercise</th>--%>
            <%--<th>Heavy exercise</th>--%>
            <%--<th>Calories Burned</th>--%>

        <%--</tr>--%>
        <%--</thead>--%>
        <%--<tbody>--%>
        <%--&lt;%&ndash;<c:forEach items="${calcInput}" var="calcInput">&ndash;%&gt;--%>
            <%--<tr>--%>
                <%--<td>${age}</td>--%>
                <%--<td>${calcInput.male}</td>--%>
                <%--<td>${calcInput.female}</td>--%>
                <%--<td>${weight}</td>--%>
                <%--<td>${height}</td>--%>
                <%--<td>${calcInput.lightExercise}</td>--%>
                <%--<td>${calcInput.moderateExercise}</td>--%>
                <%--<td>${calcInput.heavyExercise}</td>--%>
                <%--<td>${sum}</td>--%>
            <%--</tr>--%>
        <%--&lt;%&ndash;</c:forEach>&ndash;%&gt;--%>
        <%--</tbody>--%>


    <%--</table>--%>


    <div>
        <%--<a class ="button" href="/calorie-calculator">Add another measurement</a>--%>
        <a class="btn btn-primary" href="/calorie-calculator" role="button">Add another measurement</a>
    </div>
</div>

<br>
<div class="container">
<div>

    <p class="font-weight-bold">
    <h4>Reference</h4>
    </p>

    <p class="font-weight-bold">For men:</p> <p class="font-weight-normal"> BMR = 10 x weight(kg) + 6.25 x height(cm) - 5 x age(y) + 5</p>
    <p class="font-weight-bold">For women:</p><p class="font-weight-normal"> BMR = 10 x weight(kg) + 6.25 x height(cm) - 5 x age(y) - 161</p>


    </p>
</div>
</div>
</body>
<%@include file="common/footer.jspf"%>

