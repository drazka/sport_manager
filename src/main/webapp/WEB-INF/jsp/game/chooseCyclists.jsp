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
    <h3 class="heading">CHOOSE YOUR TEAM TO WORK WITH</h3>

    <form:form method="post" modelAttribute="user" cssClass="form">
        your teams: <form:select cssClass="browser-default custom-select custom-select-lg mb-3" path="gameTeamList" items="${user.gameTeamList}" itemLabel="name" itemValue="id"/><br>
        <form:errors path = "gameTeamList"/>
    <input type="submit" value="Edit" class="btn btn-primary py-3 px-5">
    </form:form>


</section>




<%@ include file="/WEB-INF/jsp/generals/footer.jsp" %>

</body>
</html>