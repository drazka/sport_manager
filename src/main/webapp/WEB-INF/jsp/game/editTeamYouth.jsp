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
                <h1 class="mb-3 bread">Who is going to get points for you?</h1>
                <p class="breadcrumbs">
                    <span class="mr-2"><a href="#"><i class="ion-ios-arrow-forward"></i></a></span>

                </p>
            </div>
        </div>
    </div>
</section>

<section>
    <h2 class="heading">EDIT TEAM</h2>

    <form:form method="POST" modelAttribute="gameTeamDetailsYouth" class="bg-light p-5 contact-form">
        <h3 class="heading">${gameTeamDetails.gameTeam.name}</h3>
        <h2 class="heading">Cyclist Under 25 gets extra point when win!</h2>
        <spring:bind path="cyclist">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                your Youth:
                <form:select cssClass="browser-default custom-select custom-select-lg mb-3"
                             path="cyclist" items="${cyclistsUnder25}"
                             itemLabel="name" itemValue="id"/><br>
                <form:errors path = "cyclist"/>
            </div>
        </spring:bind>

        <input type="submit" value="Add" class="btn btn-primary py-3 px-5">
        </div>
    </form:form>




</section>




<%@ include file="/WEB-INF/jsp/generals/footer.jsp" %>

</body>
</html>