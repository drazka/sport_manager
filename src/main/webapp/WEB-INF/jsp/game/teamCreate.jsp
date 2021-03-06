<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

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
                <h1 class="mb-3 bread">CREATE YOUR TEAM</h1>
                <p class="breadcrumbs">
                    <span class="mr-2"><a href="#"><i class="ion-ios-arrow-forward"></i></a></span>

                </p>
            </div>
        </div>
    </div>
</section>

<section>
    <h3 class="heading">CREATE YOUR TEAM</h3>

    <form:form method="post" modelAttribute="gameTeam" class="bg-light p-5 contact-form">
        name: <form:input path="name" class="form-control" autofocus="true"/><br>
        <form:errors path = "name"/>
        <form:hidden path="id"/>
        <input type="submit" value="Go and choose your Cyclists" class="btn btn-primary py-3 px-5">
    </form:form>

</section>




<%@ include file="/WEB-INF/jsp/generals/footer.jsp" %>

</body>
</html>