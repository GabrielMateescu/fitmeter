<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="common/header.jspf"%>
<%@include file="common/navigation.jspf"%>
<%@include file="common/footer.jspf"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<div class="container">
    <font color="red">${errorMessage}</font>
    <form class="form-signin" action="login" method="post">
        <h2 class="form-signin-heading">Please sign in</h2>
        <div class="form-group">
            <label for="username" class="sr-only">Username</label>
            <input type="text" roleId="username" class="form-control" placeholder="Username" name="username"
                   id="username"
                   required="required" autofocus="autofocus"/>
        </div>
        <div class="form-group">
            <label for="password" class="sr-only">Password</label>
            <input type="password" roleId="inputPassword" class="form-control" placeholder="Password"
                   id="password"
                   name="password" required="required"/>
        </div>
        <div class="form-group">
            <input type="checkbox" name="remember-me" id="remember-me"/> &nbsp; Remember me
        </div>
    <button type="submit" class="btn btn-primary">Submit</button>

        <p>Don't have an account? <a href="<c:url value="/newaccount" />">Register</a> </p>
</form>
</div>
