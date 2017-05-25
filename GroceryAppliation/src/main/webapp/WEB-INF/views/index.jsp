<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
  <title>Grocery Store</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet" integrity="sha256-MfvZlkHCEqatNoGiOXveE8FIwMzZg4W85qfrfIFBfYc= sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ==" crossorigin="anonymous">
<!-- // -->
</head>
<body style="background-color: lightcyan;">

            <jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>





<div class="container">
<div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner">
    <div class="item active">
    
      <img src="<spring:url value="/resources/gro.jpg"></spring:url>" alt="Los Angeles" >
    </div>

    <div class="item">
      <img src="<spring:url value="/resources/gro.jpg"></spring:url>"/> 

    </div>

    <div class="item">
      <img  src="<spring:url value="/resources/buy-me2.jpg"></spring:url>" alt="New York">
    </div>
  </div>

  <!-- Left and right controls -->
  <a class="left carousel-control" href="#myCarousel" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
</div>
<br>
<div style="margin-bottom: 30px;">
<a href="details"><img src="<spring:url value="/resources/dairy.jpg" ></spring:url>" alt="HTML5 Icon" style=" margin-left: 170px"/></a>
<a href="details"><img src="<spring:url value="/resources/dairy.jpg" ></spring:url>" alt="HTML5 Icon" style=" margin-left: 170px"/></a>
<a href="details"><img src="<spring:url value="/resources/dairy.jpg" ></spring:url>" alt="HTML5 Icon" style="margin-left: 170px"/></a>
</div>
            <jsp:include page="/WEB-INF/views/footer.jsp"></jsp:include>


    </body>
</html>