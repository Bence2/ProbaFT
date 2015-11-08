var MainController = function($scope, $http,$location) {
};

var app = angular.module("mainmodule", ['ngRoute']);
angular.module("mainmodule").config(function($routeProvider){
	console.log("route resz");
	$routeProvider.

				when(
				"/rolunk", 
					{
		        templateUrl: "static/html/rolunk.html"
					}
				).
				when(
				"/carousel", 
					{
		        templateUrl: "static/html/carousel.html"
					}
				)
				
		});

app.controller("MainController", MainController);
