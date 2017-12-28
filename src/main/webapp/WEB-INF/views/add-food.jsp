

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common/header.jspf"%>
<%@include file="common/navigation.jspf"%>
<%@include file="common/footer.jspf"%>


<body>
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
