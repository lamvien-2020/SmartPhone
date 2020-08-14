<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<title>Catagory</title>
<body>
	<div class="well well-small">
		<h3>Our Products</h3>
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
</body>
