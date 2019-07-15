<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

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
            <h1 class="mb-3 bread">STAGE RESULTS</h1>
            <p class="breadcrumbs"><span class="mr-2"><a href="index.jsp">Home <i class="ion-ios-arrow-forward"></i></a></span> <span>Stage results <i class="ion-ios-arrow-forward"></i></span></p>
          </div>
        </div>
      </div>
    </section>

     <section class="ftco-section">
      <div class="container">
        <div class="row d-flex">

            <c:forEach items="${allStages}" var="stage">

          <div class="col-md-6 col-lg-3 ftco-animate">
          	<div class="blog-entry">
              <a href="/TourDeFranceGame/stage-result/${stage.id}"  class="block-20" style="background-image: url('/resources/images/image_${stage.id}.jpg');">
              </a>
              <div class="text mt-3 float-right d-block">
              	<div class="d-flex align-items-center p-2 pr-3 mb-4 topp">
              		<div class="one">
              			<span class="day mr-1"><fmt:formatDate value="${stage.startDate}" pattern="dd"/></span>
              		</div>
              		<div class="two">
              			<span class="yr"><fmt:formatDate value="${stage.startDate}" pattern="yyyy"/></span>
              			<span class="mos"><fmt:formatDate value="${stage.startDate}" pattern="MMM"/></span>
              		</div>
              	</div>
                <h3 class="heading">${stage.name}</h3>
              </div>
            </div>
          </div>
            </c:forEach> <br />
        </div>
<!--
        <div class="row mt-5">
          <div class="col text-center">
            <div class="block-27">
              <ul>
                <li><a href="#">&lt;</a></li>
                <li class="active"><span>1</span></li>
                <li><a href="#">2</a></li>
                <li><a href="#">3</a></li>
                <li><a href="#">4</a></li>
                <li><a href="#">5</a></li>
                <li><a href="#">&gt;</a></li>
              </ul>
            </div>
          </div>
        </div>
-->
      </div>
    </section>
		
		<section class="ftco-subscribe img" style="background-image: url(/resources/images/bg_2.jpg);">
      <div class="overlay">
        <div class="container">
          <div class="row d-flex justify-content-center">
            <div class="col-md-9 text-wrap text-center heading-section heading-section-white ftco-animate">
              <h2>Subcribe to our upcoming games</h2>
              <div class="row d-flex justify-content-center mt-4 mb-4">
                <div class="col-md-10">
                  <form action="#" class="subscribe-form">
                    <div class="form-group d-flex">
                      <input type="text" class="form-control" placeholder="Enter email address">
                      <input type="submit" value="Subscribe" class="submit px-3">
                    </div>
                  </form>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>


      <%@ include file="/WEB-INF/jsp/generals/footer.jsp" %>
    
  </body>
</html>