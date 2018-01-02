

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common/header.jspf"%>

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

<div class="container">

<form method="post">

    <div class="row">
        <div class="col-md-6 mb-3">
            <label for="validationServer03">Food</label>
            <input name="desc" type="text" class="form-control is-invalid" id="validationServer01" placeholder="Description" required>
            <div class="invalid-feedback">
                Please provide a valid food description.
            </div>
        </div>
        <div class="col-md-3 mb-3">
            <label for="validationServer04">Calories</label>
            <input name="calories" type="text" class="form-control is-invalid" id="validationServer02" placeholder="Calories" required>
        </div>
        <div class="col-md-3 mb-3">
            <label for="validationServer05">Carbs</label>
            <input name = "carbs" type="text" class="form-control is-invalid" id="validationServer03" placeholder="Carbs" required>
        </div>
    </div>
    <div class="row">
        <div class="col-md-6 mb-3">
            <label for="validationServer03">Protein</label>
            <input name="protein" type="text" class="form-control is-invalid" id="validationServer04" placeholder="Protein" required>
        </div>
        <div class="col-md-3 mb-3">
            <label for="validationServer04">Fat</label>
            <input name="fat" type="text" class="form-control is-invalid" id="validationServer05" placeholder="Fat" required>
        </div>
        <div class="col-md-3 mb-3">
            <label for="validationServer05">Sugar</label>
            <input name="sugar" type="text" class="form-control is-invalid" id="validationServer06" placeholder="Sugar" required>
        </div>
    </div>
    <button type="submit" class="btn btn-success">Add</button>
</form>
</div>
</body>
<%@include file="common/footer.jspf"%>