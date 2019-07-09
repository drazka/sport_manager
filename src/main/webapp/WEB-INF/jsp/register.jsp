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

<section class="hero-wrap hero-wrap-2" style="background-image: url('/images/bg_2.jpg');" data-stellar-background-ratio="0.5">
    <div class="overlay"></div>
    <div class="container">
        <div class="row no-gutters slider-text align-items-end justify-content-center">
            <div class="col-md-9 ftco-animate pb-5 text-center">
                <h1 class="mb-3 bread">Play The Game</h1>
                <p class="breadcrumbs">
                    <span class="mr-2"><a href="/login">LOGIN <i class="ion-ios-arrow-forward"></i></a></span>

                </p>
            </div>
        </div>
    </div>
</section>


<section class="ftco-section contact-section">
    <div class="container">
        <div class="row block-9">
            <div class="col-md-6 order-md-last d-flex">
                <form action="#" class="bg-light p-5 contact-form">
                    <h3 class="heading">REGISTER</h3>
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Name">
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Surname">
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Login">
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Password">
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Confirm Password">
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="email">
                    </div>
                    <div class="form-group">
                        <input type="submit" value="Play!" class="btn btn-primary py-3 px-5">
                    </div>
                </form>

            </div>

        </div>
    </div>
</section>



<%@ include file="/WEB-INF/jsp/generals/footer.jsp" %>

</body>
</html>