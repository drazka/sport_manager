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
    
    <section class="hero-wrap hero-wrap-2" style="background-image: url('/images/bg_2.jpg');" data-stellar-background-ratio="0.5">
      <div class="overlay"></div>
      <div class="container">
        <div class="row no-gutters slider-text align-items-end justify-content-center">
          <div class="col-md-9 ftco-animate pb-5 text-center">
            <h1 class="mb-3 bread">STAGE RESULT</h1>
            <p class="breadcrumbs"><span class="mr-2"><a href="/">Home <i class="ion-ios-arrow-forward"></i></a></span>
              <span class="mr-2"><a href="/stages-result">Stages <i class="ion-ios-arrow-forward"></i></a></span>
              <span> ${stage.name} <i class="ion-ios-arrow-forward"></i></span></p>
          </div>
        </div>
      </div>
    </section>


    <section class="ftco-section ftco-game-schedule">
        <div class="container">
            <div class="row justify-content-center pb-5">
                <div class="col-md-6 heading-section text-center ftco-animate">
                    <span class="subheading"><a href="https://www.letour.fr/en/rankings">more information</a></span>
                    <h2 class="mb-4">${stage.name}</h2>
                </div>
            </div>
            <h3 class="mb-3"> Individual Classification </h3>
            <div class="row">
                <div class="col-md-4 d-inline-flex">
                    <div class="img img-game d-flex align-selg-stretch" style="background-image: url(/images/image_6.jpg);"></div>
                </div>
                <div class="col-md-8 d-flex">

                    <table id="tablePreview0" class="table table-striped">
                        <!--Table head-->
                        <thead>
                        <tr>
                            <th>#</th>
                            <th>Place</th>
                            <th>Name</th>
                            <th>Rider No.</th>
                            <th>Age</th>
                            <th>Team</th>
                            <th>Country</th>
                        </tr>
                        </thead>
                        <!--Table head-->
                        <!--Table body-->
                        <tbody>
                        <c:forEach items="${stageRankingListSpeed}" var="ranking" varStatus="theCount">
                            <tr>
                                <th scope="row">${theCount.count}</th>
                                <td>${ranking.place}</td>
                                <td>${ranking.cyclist.name}</td>
                                <td>RIDER NR to be added</td>
                                <td>${ranking.cyclist.age}</td>
                                <td>${ranking.cyclist.team.name}</td>
                                <td>${ranking.cyclist.country}</td>
                            </tr>
                        </c:forEach> <br />
                        </tbody>
                        <!--Table body-->
                    </table>

                </div>
            </div>
        </div>
    </section>


    <section class="ftco-section ftco-game-schedule">
      <div class="container">
        <div class="row">
            <div>
            <h2 class="mb-3"> ${stage.name}</h2>
            <h3 class="mb-3"> Climber Classification </h3>
            </div>
            <table id="tablePreview2" class="table table-striped">
              <!--Table head-->
              <thead>
              <tr>
                <th>#</th>
                <th>Place</th>
                <th>Name</th>
                <th>Rider No.</th>
                <th>Age</th>
                <th>Team</th>
                <th>Country</th>
              </tr>
              </thead>
              <!--Table head-->
              <!--Table body-->
              <tbody>
              <c:forEach items="${stageRankingListMount}" var="ranking" varStatus="theCount">
                <tr>
                  <th scope="row">${theCount.count}</th>
                  <td>${ranking.place}</td>
                  <td>${ranking.cyclist.name}</td>
                  <td>RIDER NR to be added</td>
                  <td>${ranking.cyclist.age}</td>
                  <td>${ranking.cyclist.team.name}</td>
                  <td>${ranking.cyclist.country}</td>
                </tr>
              </c:forEach> <br />
              </tbody>
              <!--Table body-->
            </table>
            <!--Table-->
            <img src="/images/image_7.jpg" alt="" class="img-fluid">
            <div>
            <h2 class="mb-3"> ${stage.name}</h2>
            <h3 class="mb-3"> Youth Classification </h3
            </div>
            <!--Table-->
            <table id="tablePreview3" class="table table-striped">

              <!--Table head-->
              <thead>
              <tr>
                <th>#</th>
                <th>Place</th>
                <th>Name</th>
                <th>Rider No.</th>
                <th>Age</th>
                <th>Team</th>
                <th>Country</th>
              </tr>
              </thead>
              <!--Table head-->
              <!--Table body-->
              <tbody>
              <c:forEach items="${stageRankingListYoung}" var="ranking" varStatus="theCount">
                <tr>
                  <th scope="row">${theCount.count}</th>
                  <td>${ranking.place}</td>
                  <td>${ranking.cyclist.name}</td>
                  <td>RIDER NR to be added</td>
                  <td>${ranking.cyclist.age}</td>
                  <td>${ranking.cyclist.team.name}</td>
                  <td>${ranking.cyclist.country}</td>
                </tr>
              </c:forEach> <br />
              </tbody>
              <!--Table body-->
            </table>
            <!--Table-->

        </div>

            <div class="tag-widget post-tag-container mb-5 mt-5">
              <div class="tagcloud">
                <a href="#" class="tag-cloud-link">Life</a>
                <a href="#" class="tag-cloud-link">Sport</a>
                <a href="#" class="tag-cloud-link">Tech</a>
                <a href="#" class="tag-cloud-link">Travel</a>
              </div>
            </div>
          </div>
    </section>
		
    <section class="ftco-subscribe img" style="background-image: url(/images/bg_2.jpg);">
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