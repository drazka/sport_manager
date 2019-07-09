<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<html lang="en">
<head>
    <%@ include file="/WEB-INF/jsp/generals/style.jsp" %>
</head>
<body>
<%@ include file="/WEB-INF/jsp/generals/header.jsp" %>

<section class="hero-wrap hero-wrap-2" style="background-image: url('/resources/images/bg_2.jpg');" data-stellar-background-ratio="0.5">
    <div class="overlay"></div>
    <div class="container">
        <div class="row no-gutters slider-text align-items-end justify-content-center">
            <div class="col-md-9 ftco-animate pb-5 text-center">
                <h1 class="mb-3 bread">Play The Game</h1>
                <p class="breadcrumbs">
                    <span class="mr-2"><a href="/TourDeFranceGame/login">LOGIN <i class="ion-ios-arrow-forward"></i></a></span>

                </p>
            </div>
        </div>
    </div>
</section>


<section class="ftco-section contact-section">
    <div class="container">
        <div class="row block-9">
            <div class="col-md-6 order-md-last d-flex">
                <form:form method="POST" modelAttribute="userForm" class="bg-light p-5 contact-form">
                    <h3 class="heading">REGISTER</h3>
                    <spring:bind path="firstName">
                        <div class="form-group ${status.error ? 'has-error' : ''}">
                            <form:input type="text" path="firstName" class="form-control" placeholder="First Name"
                                        autofocus="true"></form:input>
                            <form:errors path="firstName"></form:errors>
                        </div>
                    </spring:bind>
                    <spring:bind path="lastName">
                        <div class="form-group ${status.error ? 'has-error' : ''}">
                            <form:input type="text" path="lastName" class="form-control" placeholder="Last Name"
                                        autofocus="true"></form:input>
                            <form:errors path="lastName"></form:errors>
                        </div>
                    </spring:bind>
                    <spring:bind path="username">
                        <div class="form-group ${status.error ? 'has-error' : ''}">
                            <form:input type="text" path="username" class="form-control" placeholder="Username"
                                        autofocus="true"></form:input>
                            <form:errors path="username"></form:errors>
                        </div>
                    </spring:bind>
                    <spring:bind path="password">
                        <div class="form-group ${status.error ? 'has-error' : ''}">
                            <form:input type="text" path="password" class="form-control" placeholder="Password"
                                        autofocus="true"></form:input>
                            <form:errors path="password"></form:errors>
                        </div>
                    </spring:bind>
                    <spring:bind path="passwordConfirm">
                        <div class="form-group ${status.error ? 'has-error' : ''}">
                            <form:input type="text" path="passwordConfirm" class="form-control" placeholder="Confirm your password"
                                        autofocus="true"></form:input>
                            <form:errors path="passwordConfirm"></form:errors>
                        </div>
                    </spring:bind>
                    <spring:bind path="email">
                        <div class="form-group ${status.error ? 'has-error' : ''}">
                            <form:input type="text" path="email" class="form-control" placeholder="email"
                                        autofocus="true"></form:input>
                            <form:errors path="email"></form:errors>
                        </div>
                    </spring:bind>
                        <input type="submit" value="Play!" class="btn btn-primary py-3 px-5">
                    </div>
                </form:form>

            </div>

        </div>
    </div>
</section>



<%@ include file="/WEB-INF/jsp/generals/footer.jsp" %>

</body>
</html>