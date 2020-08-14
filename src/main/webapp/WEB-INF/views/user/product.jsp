<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<head>
<meta charset="UTF-8">
<title>Detail Product</title>
</head>
<div class="row ">
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
		<ul class="breadcrumb">
			<li><a href="<c:url value ="/HomePage/" />">Home</a> <span
				class="divider">/</span></li>
			<li><a href="<c:url value ="/catagory/" />">Products</a> <span
				class="divider">/</span></li>
			<li class="active">Detail</li>
		</ul>
		<div class="well well-small">
			<div class="row-fluid">
				<div class="span5">
					<a href="#"> <img
						src="<c:url value ="/assets/user/img/${ detail.img }" />" alt=""
						style="width: 100%"></a>
				</div>
				<div class="span7">
					<h3>${detail.name}</h3>
					<hr class="soft" />
					<form class="form-horizontal qtyFrm" method="get"
						action="<c:url value ="/addCart/${ detail.id }" />">
						<div class="control-group">
							<label class="control-label"><span>${detail.price}
									$</span></label>
						</div>
						<div class="control-group">
							<label class="control-label"><span>Color</span></label>
							<div class="controls">
								<select class="span11">
									<option>Red</option>
									<option>Purple</option>
									<option>Pink</option>
									<option>Gold</option>
								</select>
							</div>
						</div>
						<div class="control-group">
							<label class="control-label"><span>Ram</span></label>
							<div class="controls">
								<select class="span11">
									<option>64G</option>
									<option>128G</option>
									<option>256G</option>
									<option>512G</option>
								</select>
							</div>
						</div>
						<a class="shopBtn"
							href="<c:url value ="/addCart/${ detail.id }" />"
							title="add to cart"> <span class=" icon-shopping-cart"></span>
							Add to cart
						</a>
					</form>
				</div>
			</div>
			<hr class="softn clr" />

			<ul id="productDetail" class="nav nav-tabs">
				<li class="active"><a href="#home" data-toggle="tab">Product
						Details</a></li>
				<li class=""><a href="#profile" data-toggle="tab">Related
						Products </a></li>
			</ul>
			<div id="myTabContent" class="tab-content tabWrapper">
				<div class="tab-pane fade active in" id="home">
					<h4>Product Information</h4>
					<table class="table table-striped">
						<tbody>
							<tr class="techSpecRow">
								<td class="techSpecTD1">Color:</td>
								<td class="techSpecTD2">Black</td>
							</tr>
							<tr class="techSpecRow">
								<td class="techSpecTD1">Ram:</td>
								<td class="techSpecTD2">128G</td>
							</tr>
							<tr class="techSpecRow">
								<td class="techSpecTD1">CPU:</td>
								<td class="techSpecTD2">8G</td>
							</tr>
							<tr class="techSpecRow">
								<td class="techSpecTD1">Camera:</td>
								<td class="techSpecTD2">50M</td>
							</tr>
						</tbody>
					</table>
					<p>Exynos 9810 (10 nm), Octa-core (4x2.7 GHz Mongoose M3 &
						4x1.7 GHz Cortex-A55)</p>
					<p>MAIN CAMERA : Triple 12MP+12MP+12MP / SELFIE CAMERA : 32 MP</p>
				</div>
				<div class="tab-pane fade" id="profile">
					<h3>Compare the related products</h3>
				</div>
			</div>
		</div>
	</div>
</div>
