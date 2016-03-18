<%--
User: Ranga Reddy
Date: 09/05/2015
Time: 6:52 PM
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="author" content="Ranga Reddy">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Information</title>
<!-- Bootstrap CSS -->
<%-- <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet"> --%> 
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<style type="text/css">
.myrow-container{
margin: 20px;
}
</style>
</head>
<body class=".container-fluid">
<div class="container myrow-container">
<div class="panel panel-success">
<div class="panel-heading">
<h3 class="panel-title">
Hotel Details
</h3>
</div>
<div class="panel-body">
<form:form id="employeeRegisterForm" cssClass="form-horizontal" modelAttribute="hotel" method="post" action="saveHotel">

<div class="form-group">
<div class="control-label col-xs-3"> <form:label path="namehotel" >Name</form:label> </div>
<div class="col-xs-6">
<form:hidden path="idhotel" value="${hotelObject.idhotel}"/>
<form:input cssClass="form-control" path="namehotel" value="${hotelObject.namehotel}"/>
</div>
</div>
<div class="form-group">
<div class="control-label col-xs-3"> <form:label path="namelocal" >Namelocal</form:label> </div>
<div class="col-xs-6">
<form:input cssClass="form-control" path="namelocal" value="${hotelObject.namelocal}"/>
</div>
</div>
<div class="form-group">
<div class="control-label col-xs-3"> <form:label path="namecity" >Namecity</form:label> </div>
<div class="col-xs-6">
<form:input cssClass="form-control" path="namecity" value="${hotelObject.namecity}"/>
</div>
</div>


<div class="form-group">
<form:label path="countreview" cssClass="control-label col-xs-3">Countreview</form:label>
<div class="col-xs-6">
<form:input cssClass="form-control" path="countreview" value="${hotelObject.countreview}"/>
</div>
</div>
<div class="form-group">
<form:label path="rank" cssClass="control-label col-xs-3">Rank</form:label>
<div class="col-xs-6">
<form:input cssClass="form-control" path="rank" value="${hotelObject.rank }"/>
</div>
</div>

<div class="form-group">
<div class="control-label col-xs-3"><form:label path="star">Star</form:label></div>
<div class="col-xs-6">
<form:input cssClass="form-control" path="star" value="${hotelObject.star}"/>
</div>
</div>
<div class="form-group">
<div class="control-label col-xs-3"> <form:label path="description" >Description</form:label> </div>
<div class="col-xs-6">
<form:input cssClass="form-control" path="description" value="${hotelObject.description }"/>
</div>
</div>
<div class="form-group">
<div class="control-label col-xs-3"> <form:label path="phone" >Phone</form:label> </div>
<div class="col-xs-6">
<form:input cssClass="form-control" path="phone" value="${hotelObject.phone}"/>
</div>
</div>
<div class="form-group">
<div class="control-label col-xs-3"> <form:label path="website" >Web</form:label> </div>
<div class="col-xs-6">
<form:input cssClass="form-control" path="website" value="${hotelObject.website}"/>
</div>
</div>
<div class="form-group">
<div class="control-label col-xs-3"> <form:label path="address" >Địa chỉ</form:label> </div>
<div class="col-xs-6">
<form:input cssClass="form-control" path="address" value="${hotelObject.address}"/>
</div>
</div>
<div class="form-group">
<div class="control-label col-xs-3"> <form:label path="email" >Email</form:label> </div>
<div class="col-xs-6">
<form:input cssClass="form-control" path="email" value="${hotelObject.email}"/>
</div>
</div>
<div class="form-group">
<div class="control-label col-xs-3"> <form:label path="status" >tình trạng</form:label> </div>
<div class="col-xs-6">
<form:input cssClass="form-control" path="status" value="${hotelObject.status }"/>
</div>
</div>
<div class="form-group">
<div class="control-label col-xs-3"> <form:label path="quantityroom" >Số phòng</form:label> </div>
<div class="col-xs-6">
<form:input cssClass="form-control" path="quantityroom" value="${hotelObject.quantityroom  }"/>
</div>
</div>
<div class="form-group">
<div class="control-label col-xs-3"> <form:label path="cooperation1" >Hợp tác 1</form:label> </div>
<div class="col-xs-6">
<form:input cssClass="form-control" path="cooperation1" value="${hotelObject.cooperation1  }"/>
</div>
</div>
<div class="form-group">
<div class="control-label col-xs-3"> <form:label path="cooperation2" >Hợp tác 2</form:label> </div>
<div class="col-xs-6">
<form:input cssClass="form-control" path="cooperation2" value="${hotelObject.cooperation2 }"/>
</div>
</div>
<div class="form-group">
<div class="control-label col-xs-3"> <form:label path="cooperation3" >Hợp tác 3</form:label> </div>
<div class="col-xs-6">
<form:input cssClass="form-control" path="cooperation3" value="${hotelObject.cooperation3 }"/>
</div>
</div>

<div class="form-group">
<div class="row">
<div class="col-xs-4">
</div>
<div class="col-xs-4">
<input type="submit" id="saveHotel" class="btn btn-primary" value="Save" onclick="return submitEmployeeForm();"/>
</div>
<div class="col-xs-4">
</div>
</div>
</div>

</form:form>
</div>
</div>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<script type="text/javascript">
function submitEmployeeForm() { 

// getting the employee form values
var name = $('#name').val().trim();
var age = $('#age').val();
var salary = $('#salary').val();
if(name.length ==0) {
alert('Please enter name');
$('#name').focus();
return false;
}

if(age <= 0) {
alert('Please enter proper age');
$('#age').focus();
return false;
}

if(salary <= 0) {
alert('Please enter proper salary');
$('#salary').focus();
return false;
}
return true;
}; 
</script>
</body>
</html>