<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="mainmodule">
<head>
	<script data-require="angular.js@*" data-semver="1.4.1" src="https://code.angularjs.org/1.4.1/angular.js"></script>
    <script data-require="angular-route@*" data-semver="1.4.1" src="http://code.angularjs.org/1.4.1/angular-route.js"></script>
    <script src="js/main.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body ng-controller="MainController">
	szar bazmeg ez az egész {{5/10}}
	<button type="button" ng-click="includeHtml()">Click</button>
	{{showHtml}}
	<div  ng-include="'fronttemplate/index.html'" ng-show="showHtml">
		<div>index.html megjelenítése</div>
	</div>
</body>
</html>