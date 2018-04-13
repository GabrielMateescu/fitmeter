<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="common/header.jspf"%>
<%@include file="common/navigation.jspf"%>

<div class="container">
    <br>

    <div id="demo" class="carousel slide" data-ride="carousel">

        <!-- Indicators -->
        <ul class="carousel-indicators">
            <li data-target="#demo" data-slide-to="0" class="active"></li>
            <li data-target="#demo" data-slide-to="1"></li>
            <li data-target="#demo" data-slide-to="2"></li>
        </ul>

        <!-- The slideshow -->
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img src="static/images/workout2.jpg" alt="Timisoara" width="1100" height="500">
                <div class="carousel-caption">
                    <h3>Timisoara</h3>
                    <p>We love the Big Apple!</p>
                </div>
            </div>
            <div class="carousel-item">
                <img src="static/images/workout1.jpg" alt="Chicago" width="1100" height="500">
                <div class="carousel-caption">
                    <h3>Chicago</h3>
                    <p>We love the Big Apple!</p>
                </div>
            </div>
            <div class="carousel-item">
                <img src="static/images/workout3.jpg" alt="New York" width="1100" height="500">
                <div class="carousel-caption">
                    <h3>New York</h3>
                    <p>We love the Big Apple!</p>
                </div>
            </div>
        </div>

        <!-- Left and right controls -->
        <a class="carousel-control-prev" href="#demo" data-slide="prev">
            <span class="carousel-control-prev-icon"></span>
        </a>
        <a class="carousel-control-next" href="#demo" data-slide="next">
            <span class="carousel-control-next-icon"></span>
        </a>
    </div>

    <!-- Tab panes -->
    <div class="tab-content">
        <div id="Fitmenter" class="container tab-pane active"><br>
            <h4>Look no further. You have the best calorie counter app right here.</h4>
            <p>Tracking your food and calorie intake from time to time is important.</p>
        </div>
        <div id="Calorie Calculator" class="container tab-pane fade"><br>
            <h3>Menu 1</h3>
            <p>Largest database available in a diet tracker, and it includes many restaurant foods.</p>
        </div>
        <div id="Log In" class="container tab-pane fade"><br>
            <h3>Menu 2</h3>
            <p>Sdownload recipes from the internet and calculate the calorie content of each serving.</p>
        </div>
    </div>
</div>

<div class="container">
    <div class="row">
        <div class="col-sm-4">
            <h4>Track</h4>
            <p>You can quick add calories if you don't have the time to add details about a certain meal.</p>
            <p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris...</p>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>
            <p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris...</p>
        </div>
        <div class="col-sm-4">
            <h4>Learn</h4>
            <p>Largest database available in a diet tracker, and it includes many restaurant foods.</p>
            <p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris...</p>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>
            <p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris...</p>
        </div>
        <div class="col-sm-4">
            <h4>Use existing data</h4>
            <p>Download recipes from the internet and calculate the calorie content of each serving.</p>
            <p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris...</p>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>
            <p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris...</p>
        </div>
    </div>
</div>
<%@include file="common/footer.jspf"%>

