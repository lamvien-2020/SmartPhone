<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<head>
<meta charset="UTF-8">
<title>List Cart</title>
</head>
<body>
	<div class="row">
		<div class="span12">
			<ul class="breadcrumb">
				<li><a href="<c:url value ="/HomePage/" />">Home</a> <span
					class="divider">/</span></li>
				<li class="active">Check Out</li>
			</ul>
			<div class="well well-small">
				<h1>Your Cart</h1>
				<hr class="soften" />
				<table class="table table-bordered table-condensed">
					<thead>
						<tr>
							<th>Product</th>
							<th>Name</th>
							<th>Unit price</th>
							<th>Quantity</th>
							<th>Edit</th>
							<th>Delete</th>
							<th>Total</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="item" items="${cart}" varStatus="index">
							<tr>
								<td><img width="100"
									src="<c:url value ="/assets/user/img/${item.value.product.img}" />"
									alt=""></td>
								<td>${item.value.product.name}</td>
								<td>${item.value.product.price}$</td>
								<td><input class="span1" style="max-width: 34px"
									id="quantity-${item.key}" size="16" type="number" min="0"
									max="200" value="${item.value.quanty}"></td>
								<td><button data-id="${item.key}"
										class="btn btn-mini btn-danger edit-Cart" type="button">
										<span class="icon-edit"></span>
									</button></td>
								<td><a href="<c:url value ="/deleteCart/${item.key }" />"
									class="btn btn-mini btn-danger" type="button"> <span
										class="icon-remove"></span>
								</a></td>
								<td>${item.value.totalPrice}$</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<br /> <a href="products.html" class="shopBtn btn-large"><span
					class="icon-arrow-left"></span> Continue Shopping </a> <a
					href="login.html" class="shopBtn btn-large pull-right">Next <span
					class="icon-arrow-right"></span></a>

			</div>
		</div>
	</div>
	
<content tag = "script">
	<script>
	$(".edit-Cart").on("click",function(){		
		var id = $(this).data("id");
		var quanty = $("#quantity-"+id).val();		
		window.location = "./editCart/"+id+"/"+quanty;		
	});
	</script>
</content>
</body>

