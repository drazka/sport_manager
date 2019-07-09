<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<nav class="navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light" id="ftco-navbar">
    <div class="container">
        <div class="navbar-brand">
            <a href="/TourDeFranceGame/login"><span>LOG IN</span></a>
            <a href="/TourDeFranceGame/"><span>SPORT GAME</span></a>
        </div>

        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#ftco-nav" aria-controls="ftco-nav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="oi oi-menu"></span> Menu
        </button>

        <div class="collapse navbar-collapse" id="ftco-nav">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item"><a href="/TourDeFranceGame/" class="nav-link">Home</a></li>
                <li class="nav-item"><a href="/createTeam" class="nav-link">Create Team</a></li>
                <li class="nav-item active"><a href="games.html" class="nav-link">Games</a></li>
                <li class="nav-item"><a href="/stages-result" class="nav-link">Stage results</a></li>
                <li class="nav-item"><a href="contact.html" class="nav-link">Contact</a></li>
                <li class="nav-item cta"><a href="/TourDeFranceGame/login" class="nav-link">Login</a></li>

            </ul>
        </div>
    </div>
</nav>
