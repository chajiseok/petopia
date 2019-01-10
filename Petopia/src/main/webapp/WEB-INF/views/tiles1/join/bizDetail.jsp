<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<style type="text/css">

.carousel-inner > .item > img {
      top: 0;
      left: 0;
      min-width: 100%;
      min-height: 400px;
    } 

</style>    
    
    
    
<div align="center" style="margin: 0 auto; /* border: solid red 1px; */">
	
	<h2 style="margin-bottom: 50px;">병원상세페이지</h2>
	
	<div style="width:50%; /* border: solid red 1px; */">
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
        <img src="<%=request.getContextPath() %>/resources/img/hospitalimg/bbb.jpg" style="width: 100%;">
      </div>
    
      <div class="item">
        <img src="<%=request.getContextPath() %>/resources/img/hospitalimg/ccc.jpg" style="width: 100%;">
      </div>
    </div>
	
	  <!-- Left and right controls -->
		  <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
		    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
		    <span class="sr-only">Previous</span>
		  </a>
		  <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
		    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
		    <span class="sr-only">Next</span>
		  </a>
		</div>
	</div>
	
</div>