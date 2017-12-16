<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML>


<html>

<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="static/css/bootstrap.min.css">
    <script src="static/js/jquery-3.2.1.min.js"></script>
    <script src="static/js/popper.min.js"></script>
    <style>
        /* Make the image fully responsive */
        .carousel-inner img {
            width: 100%;
            height: 100%;
        }
    </style>
</head>

<body>
<br>

<div class="container">
    <br>
    <!-- Nav pills -->
    <ul class="nav nav-pills" role="tablist">
        <li class="nav-item">
            <a class="nav-link active" data-toggle="pill" href="#home">FitMeter</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" data-toggle="pill" href="#menu1">Calorie Calculator</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" data-toggle="pill" href="<c:url value="/login"/>">Log In</a>
        </li>
    </ul>

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
                <img src="static/images/la.jpg" alt="Timisoara" width="1100" height="500">
                <div class="carousel-caption">
                    <h3>Timisoara</h3>
                    <p>We love the Big Apple!</p>
                </div>
            </div>
            <div class="carousel-item">
                <img src="static/images/chicago.jpg" alt="Chicago" width="1100" height="500">
                <div class="carousel-caption">
                    <h3>Chicago</h3>
                    <p>We love the Big Apple!</p>
                </div>
            </div>
            <div class="carousel-item">
                <img src="static/images/ny.jpg" alt="New York" width="1100" height="500">
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
            <h3>HOME</h3>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
        </div>
        <div id="Calorie Calculator" class="container tab-pane fade"><br>
            <h3>Menu 1</h3>
            <p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
        </div>
        <div id="Log In" class="container tab-pane fade"><br>
            <h3>Menu 2</h3>
            <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam.</p>
        </div>
    </div>
</div>

<div class="container">
    <div class="row">
        <div class="col-sm-4">
            <h4>Column 1</h4>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>
            <p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris...</p>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>
            <p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris...</p>
        </div>
        <div class="col-sm-4">
            <h4>Column 2</h4>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>
            <p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris...</p>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>
            <p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris...</p>
        </div>
        <div class="col-sm-4">
            <h4>Column 3</h4>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>
            <p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris...</p>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>
            <p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris...</p>
        </div>
    </div>
</div>



<script src="static/js/bootstrap.min.js"></script>
</body>

</html>