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
        <input type="email" class="form-control" id="exampleInputEmail1" name="email" aria-describedby="emailHelp" placeholder="Enter email">
        <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
    </div>
    <div class="form-group">
        <input type="password" class="form-control" id="exampleInputPassword1" name = "pass" placeholder="Password">
    </div>
    <div class="form-check">
        <label class="form-check-label">
            <input type="checkbox" class="form-check-input">
            Remember  me
        </label>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>

        <p>Don't have an account? <a href="<c:url value="/newaccount" />">Register</a> </p>
</form>
</div>
