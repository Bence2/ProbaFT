

var MainController = function($scope){
	$scope.showHtml = true;
	$scope.includeHtml = function(){
		console.log("lefutott")
		$scope.showHtml = !this.showHtml; 
	};
    
};

var app = angular.module("mainmodule", []);
app.controller("MainController", MainController);

