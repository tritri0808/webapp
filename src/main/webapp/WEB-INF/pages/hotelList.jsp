<%--
User: Ranga Reddy
Date: 09/05/2015
Time: 6:52 PM
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hotel List</title>
<!-- Bootstrap CSS -->
<%-- <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet"> --%>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<style type="text/css">
.myrow-container {
	margin: 10px 0px 10px 0px;
}
</style>
</head>
<body class=".container-fluid">
	<div class="container myrow-container">
		<div class="panel panel-success">
			<div class="panel-heading">
				<h3 class="panel-title">
					<div align="left">
						<b>Hotel List</b>
					</div>
					<div align="right">
						<a href="createHotel">Add New Hotel</a>
					</div>
				</h3>
			</div>
			<div class="panel-body">
				<c:if test="${empty hotelList}">
There are no Hotel
</c:if>
				<c:if test="${not empty hotelList}">

					<form action="searchHotel">
						<div class="row">
							<div class="col-md-6">
								<div class="col-md-6">Search Hotel:</div>
								<div class="col-md-6">
									<input type="text" name="searchName" id="searchName">
								</div>
							</div>
							<div class="col-md-4">
								<input class="btn btn-success" type='submit' value='Search' />
							</div>
						</div>
					</form>

					<table class="table table-hover table-bordered"
						style="table-layout: fixed; word-wrap: break-word; width: 100% !important;">
						<thead style="background-color: #bce8f1;">
							<tr>
								<th>IDHotel</th>
								<th>Namehotel</th>
								<th>Namelocal</th>
								<th>Namecity</th>
								<th>CountReview</th>
								<th>Rank</th>
								<th>Star</th>
								<th>Description</th>
								<th>Phone</th>
								<th>Website</th>
								<th>Address</th>
								<th>Email</th>
								<th>Status</th>
								<th>quantityRoom</th>
								<th>cooperation1</th>
								<th>cooperation2</th>
								<th>cooperation3</th>
								<th>cooperation4</th>
								<th>cooperation5</th>
								<th>cooperation6</th>
								<th>Edit</th>
								<th>Delete</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${hotelList}" var="emp">
								<tr>
									<th style="white-space: normal;"><c:out
											value="${emp.idhotel}" /></th>
									<th style="white-space: normal;"><c:out
											value="${emp.namehotel}" /></th>
									<th style="white-space: normal;"><c:out
											value="${emp.namelocal}" /></th>
									<th style="white-space: normal;"><c:out
											value="${emp.namecity}" /></th>
									<th style="white-space: normal;"><c:out
											value="${emp.countreview}" /></th>
									<th style="white-space: normal;"><c:out
											value="${emp.rank}" /></th>
									<th style="white-space: normal;"><c:out
											value="${emp.star}" /></th>
									<th style="white-space: normal;"><c:out
											value="${emp.description}" /></th>
									<th style="white-space: normal;"><c:out
											value="${emp.phone}" /></th>
									<th style="white-space: normal;"><c:out
											value="${emp.website}" /></th>
									<th style="white-space: normal;"><c:out
											value="${emp.address}" /></th>
									<th style="white-space: normal;"><c:out
											value="${emp.email}" /></th>
									<th style="white-space: normal;"><c:out
											value="${emp.status}" /></th>
									<th style="white-space: normal;"><c:out
											value="${emp.quantityroom}" /></th>
									<th style="white-space: normal;"><c:out
											value="${emp.cooperation1}" /></th>
									<th style="white-space: normal;"><c:out
											value="${emp.cooperation2}" /></th>
									<th style="white-space: normal;"><c:out
											value="${emp.cooperation3}" /></th>
									<th style="white-space: normal;"><c:out
											value="${emp.cooperation4}" /></th>
									<th style="white-space: normal;"><c:out
											value="${emp.cooperation5}" /></th>
									<th style="white-space: normal;"><c:out
											value="${emp.cooperation6}" /></th>

									<th><a
										href="editHotel?idhotel=<c:out value='${emp.idhotel}'/>">Edit</a></th>
									<th><a
										href="deleteHotel?idhotel=<c:out value='${emp.idhotel}'/>">Delete</a></th>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</c:if>
			</div>
		</div>
		<script
			src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
		<script
			src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

		<%-- <script src="<c:url value="/resources/js/jquery-2.1.3.js"/>"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
--%>
</body>
</html>