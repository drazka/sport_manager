<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<nav class="navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light" id="ftco-navbar">
    <div class="container">
        <div class="navbar-brand">
            <c:if test="${pageContext.request.userPrincipal.name != null}">
                <form id="logoutForm" method="POST" action="${contextPath}/logout">
                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                </form>

                <span>Welcome ${pageContext.request.userPrincipal.name} | <a onclick="document.forms['logoutForm'].submit()">Logout</a></span>
            </c:if>

            <c:if test="${pageContext.request.userPrincipal.name == null}">
                <a href="/TourDeFranceGame/login"><span>LOG IN</span></a>
            </c:if>
            <a href="/TourDeFranceGame/"><span>SPORT GAME</span></a>
        </div>

        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#ftco-nav" aria-controls="ftco-nav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="oi oi-menu"></span> Menu
        </button>

        <div class="collapse navbar-collapse" id="ftco-nav">
            <ul class="navbar-nav ml-auto">
                <c:if test="${pageContext.request.userPrincipal.name == null}">
                    <li class="nav-item"><a href="/TourDeFranceGame/" class="nav-link">Home</a></li>
                    <li class="nav-item"><a href="/TourDeFranceGame/contact" class="nav-link">Contact</a></li>
                    <li class="nav-item"><a href="/TourDeFranceGame/login" class="nav-link">Login</a></li>
                    <li class="nav-item"><a href="/TourDeFranceGame/register" class="nav-link">Register</a></li>
                    <li class="nav-item"><a href="/TourDeFranceGame/stages-result" class="nav-link">Stage results</a></li>
                    <li class="nav-item"><a href="/TourDeFranceGame/general-result" class="nav-link">General results</a></li>
                    <li class="nav-item"><a href="/TourDeFranceGame/game-result" class="nav-link">The Best Players Ranking</a></li>
                </c:if>

            <c:if test="${pageContext.request.userPrincipal.name != null}">
                <li class="nav-item"><a href="/createTeam" class="nav-link">Create Team</a></li>
                <li class="nav-item"><a href="/chooseCyclists" class="nav-link">Edit your team</a></li>
                <li class="nav-item"><a href="/TourDeFranceGame/stages-result" class="nav-link">Stage results</a></li>
                <li class="nav-item"><a href="/TourDeFranceGame/general-result" class="nav-link">General results</a></li>
                <li class="nav-item"><a href="/TourDeFranceGame/game-result" class="nav-link">The Best Players Ranking</a></li>
            </c:if>

            </ul>
        </div>
    </div>
</nav>
