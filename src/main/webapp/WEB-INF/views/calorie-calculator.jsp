<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="common/header.jspf"%>
<%@include file="common/navigation.jspf"%>
<%@include file="common/footer.jspf"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<div class="container h-100">
    <div class="row h-100 justify-content-center align-items-center">
        <h2>Calorie Calculator</h2>
    </div>

    <div class="row h-100 justify-content-center align-items-center">
        <div class="col-sm-offset-4 col-sm-4">
            <form method="put">
                <div class="form-group">
                    <label for="age">Age</label>
                    <div class="input-group" data-validate="number">
                        <input type="text" class="form-control" name="age" id="age" placeholder="(Age)" required>
                        <span class="input-group-addon danger">
                            <span class="glyphicon glyphicon-remove">
                            </span>
                        </span>
                    </div>
                </div>
                <div class="form-group">
                    <label for="sex">Sex</label>
                    <div class="form-check mb-2 mr-sm-2 mb-sm-0">
                        <label class="form-check-label">
                            <input class="form-check-input" type="checkbox">Male
                        </label>
                        <label class="form-check-label">
                            <input class="form-check-input" type="checkbox"> Female
                        </label>
                    </div>
                </div>
                <div class="form-group">
                    <label>Weight(kg)</label>
                    <div class="input-group" data-validate="number">
                        <input type="text" class="form-control" name="weight" id="weight" placeholder="(kg)" required>
                        <span class="input-group-addon danger"><span class="glyphicon glyphicon-remove"></span></span>
                    </div>
                </div>
                <div class="form-group">
                    <label>Height(cm)</label>
                    <div class="input-group" data-validate="number">
                        <input type="text" class="form-control" name="inches" id="inches" placeholder="(cm)" required>
                        <span class="input-group-addon danger"><span class="glyphicon glyphicon-remove"></span></span>
                    </div>
                </div>
                <div class="form-group">
                    <label>Activity Level</label>
                    <div class="input-group">
                        <select class="form-control" name="activity_level" id="activity_level" required>
                            <option value="">Select an Acitivity Level</option>
                            <option value="no">Little to no exercise</option>
                            <option value="light">Light exercise (1−3 days per week)</option>
                            <option value="moderate">Moderate exercise (3−5 days per week)</option>
                            <option value="heavy">Heavy exercise (6−7 days per week)</option>
                            <option value="extreme">Very heavy exercise (twice per day, extra heavy workouts)</option>
                        </select>
                        <span class="input-group-addon danger"><span class="glyphicon glyphicon-remove"></span></span>
                    </div>
                </div>
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
            </form>
            </form>
        </div>

    </div>
</div>