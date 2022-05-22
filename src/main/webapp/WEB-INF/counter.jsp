<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script type="text/javascript" src="js/app.js"></script>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css" />
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<title>Counter</title>
</head>
<body>
	<div class="d-flex justify-content-center mt-5">
		<H3>You have visited ${page} - ${count} ${times}.</H3>
	</div>
	<div class="d-flex justify-content-center mt-5">
		<a href="/">Test another visit?</a>
	</div>
	<div class="d-flex justify-content-center mt-5">
		<a href="/countplus2">Or maybe test another 2 visits?</a>
	</div>
	<div class="d-flex justify-content-center mt-5">
		<a href="/resetcount">Reset Count</a>
	</div>
</body>
</html>