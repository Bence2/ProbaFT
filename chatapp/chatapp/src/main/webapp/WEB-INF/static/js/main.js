var MainController = function($scope, $http,$location,  getmessagesservice, sendmessagesservice) {

	$scope.logSthg = function(){
		console.log("logolok");
	};
	
//	var changeUrl = function(){
//		$location.path('/chatapp/route')
//	};
	// ez így fos volt
	
	var getMessagesSucceeds = function(data) {
		$scope.messages = data;
		$location.path('/route');
	}
	
	var sendMessagesSucceeds = function(data) {
		console.log("sikeresen visszatert a sendmessage")
	}

	var getMessagesFails = function(reason) {
		console.log(reason); //erre (is) mondja, h hibat dob a json parseolasnal 
		console.log("erroooorr");
	};
	
	
	$scope.getMessages = function() {
		getmessagesservice.getMessages().then(getMessagesSucceeds, getMessagesFails);
	}
	
	$scope.sendMessages = function(sendersmessage){
		sendmessagesservice.sendMessages(sendersmessage).then(sendMessagesSucceeds, getMessagesFails);
		console.log("scope.sendmessages lefutott");
	};
};

var app = angular.module("mainmodule", ['ngRoute']);
angular.module("mainmodule").config(function($routeProvider){
	console.log("route resz");
	//$locationProvider.hashPrefix('!');
	$routeProvider.
//			when(
//				"/chatapp/route", 
//					{
//		        templateUrl: "static/html/route.html"
//		        //controller: "MainController"
//					}
//				).
				when(
				"/route", 
					{
		        templateUrl: "static/html/route.html"
		        //controller: "MainController"
					}
				)
		});

app.controller("MainController", MainController);

//app.config(function($routeProvider){
//	$routeProvider.
//			when(
//				"/chatapp/route", 
//					{
//		        templateUrl: "static/html/route.html",
//		        controller: "MainController"
//					}
//				)
//		});

	
	
//	$scope.sendersmessage = {};
//	
//	$scope.sendersmessage.dateOfMessage = 1440064421037;

//	$scope.getMessages = function(){
//		$http.get("/chatapp/getmessages")
//		 .then(getMessagesSucceeds, getMessagesFails);
//	};


