<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<title>HomePage</title>
<!-- Body Section -->
<div class="row">
	<div id="sidebar" class="span3">
		<div class="well well-small">
			<ul class="nav nav-list">
				<c:forEach var="item" items="${catagories}" varStatus="index">
					<li><a href="<c:url value ="/catagory/${item.id}" />"> <span
							class="icon-li icon-ok"></span> ${item.product}
					</a></li>
				</c:forEach>
				<li style="border: 0">&nbsp;</li>
				<li><a class="totalInCart" href="<c:url value ="/listCart/" />"><strong>Total
							Amount <span class="badge badge-warning pull-right"
							style="line-height: 18px;">${totalPriceCart} $</span>
					</strong></a></li>
			</ul>
		</div>
		<div class="well well-small">
			<a href="#"><img
				src="<c:url value ="/assets/user/img/paypal.jpg" />"
				alt="payment method paypal"></a>
		</div>
	</div>
	<div class="span9">
		<div class="well np">
			<div id="myCarousel" class="carousel slide homCar">
				<div class="carousel-inner">
					<c:forEach var="item" items="${slides}" varStatus="index">
						<c:if test="${index.first}">
							<div class="item active">
						</c:if>
						<c:if test="${not index.first}">
							<div class="item">
						</c:if>
						<img style="width: 100%"
							src="<c:url value ="/assets/user/img/Slides/${item.img}" />"
							alt="bootstrap ecommerce templates">
						<div class="carousel-caption">
							<h4>${item.caption}</h4>
							<p>
								<span>${item.content}</span>
							</p>
						</div>
				</div>
				</c:forEach>
			</div>
			<a class="left carousel-control" href="#myCarousel" data-slide="prev">&lsaquo;</a>
			<a class="right carousel-control" href="#myCarousel"
				data-slide="next">&rsaquo;</a>
		</div>
	</div>
	<!-- Products-->
	<div class="well well-small">
		<h3>
			<a class="btn btn-mini pull-right" href="#"
				title="View more">View More<span class="icon-plus"></span></a> Products
		</h3>
		<hr class="soften" />
		<div class="row-fluid">
			<c:if test="${ products.size() > 0 }">
				<ul class="thumbnails">
					<c:forEach var="item" items="${ products }" varStatus="loop">
						<li class="span4">
							<div class="thumbnail">
								<a class="zoomTool" href="<c:url value ="/detail/${item.id}" />"
									title="View detail"><span class="icon-search"></span> QUICK
									VIEW</a> <a href="<c:url value ="/detail/${item.id}" />"> <img
									src="<c:url value ="/assets/user/img/${ item.img }" />" alt=""></a>
								<div class="caption cntr">
									<p>${ item.name }</p>
									<p>
										<strong> ${ item.price }$</strong>
									</p>
									<h4>
										<a class="shopBtn" href="<c:url value ="/addCart/${ item.id }" />" title="add to cart"> Add to
											cart</a>
									</h4>
									<br class="clr">
								</div>
							</div>
						</li>
						<c:if
							test="${ (loop.index + 1) % 3 == 0 || (loop.index + 1)  == products.size() }">
				</ul>
				<c:if test="${ (loop.index + 1) < products.size() }">
					<ul class="thumbnails">
				</c:if>
			</c:if>
			</c:forEach>
			</c:if>
		</div>
	</div>
</div>
</div>
