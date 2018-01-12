<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="common/header.jspf"%>
<%@include file="common/navigation.jspf"%>

<div class="container h-100">
    <div class="row h-100 justify-content-center align-items-center">
        <h2>Calorie Calculator</h2>
    </div>
    <div class="row h-100 justify-content-center align-items-center">
        <div class="col-sm-offset-4 col-sm-4">
            <form method="put">
                <div class="form-group">
                    <div class="input-group" data-validate="number">
                        <input type="text" class="form-control" name="age" id="age" placeholder="(Age)" required>
                        </span>
                    </div>
                </div>
                <div class="form-group">
                    <div class="form-check mb-2 mr-sm-2 mb-sm-0">
                        <label class="form-check-label">
                            <input class="form-check-input" name="inlineRadioOptions" id="inlineRadio1" value="option1" type="radio">Male
                        </label>
                        <label class="form-check-label">
                            <input class="form-check-input" name="inlineRadioOptions" id="inlineRadio2" value="option2" type="radio"> Female
                        </label>
                    </div>
                </div>
                <div class="form-group">
                    <div class="input-group" data-validate="number">
                        <input type="text" class="form-control" name="weight" id="weight" placeholder="Weight(kg)" required>
                    </div>
                </div>
                <div class="form-group">

                    <div class="input-group" data-validate="number">
                        <input type="text" class="form-control" name="inches" id="inches" placeholder="Height(cm)" required>
                    </div>
                </div>

                <select class="custom-select">
                    <option selected>Select an Activity Level</option>
                    <option value="2">Little to no exercise</option>
                    <option value="3">Light exercise (1-3 days per week)</option>
                    <option value="4">Moderate exercise (3−5 days per week)</option>
                    <option value="5">Heavy exercise (6−7 days per week)</option>
                    <option value="6">Very heavy exercise (twice per day, extra heavy workouts)</option>
                </select>

                <div class="form-group">
                    <div class="form-group">
                        <div id="dc_results" class="alert alert-success" style="display: none">
                            <h4>Estimated Daily Calories:<strong><span id="calAmount"></span></strong></h4>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="modal-footer">
                            <button type="button" id="calculate" name="calculate" class="btn btn-primary" onclick="calcDailyCals();">Calculate</button>
                        </div>
                    </div>
                </div>
            </form>

        </div>

    </div>
</div>
<%@include file="common/footer.jspf"%>