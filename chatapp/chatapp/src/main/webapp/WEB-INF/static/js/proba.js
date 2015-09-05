var MainController = function($scope, $http) {
	$scope.getmessages = function() {
		getmessagesservice.getMessages().then(getMessagesSucceeds, getMessagesFails);
	}
	
	$scope.getmessagesvfor = function(){
		$http.get("/chatapp/getmessages")
		.then(getMessagesSucceeds, getMessagesFails);
		
	};
	
	$scope.messages = $http.get("/chatapp/getmessages")
	.then(getMessagesSucceeds, getMessagesFails);
	
	$scope.logSthg = function(){
		console.log("logolok");
	};
	//ez nem mukodik
//	$scope.getmessagesvtwo = $http.get("/getmessages")
//			.then(getMessagesSucceeds, getMessagesFails);
//	
//	$scope.getmessagesvthree = $http.get("/chatapp/getmessages")
//	.then(getMessagesSucceeds, getMessagesFails);

	var getMessagesSucceeds = function(data){
		$scope.messages = data;
	}
	
	var getMessagesFails = function(reason){
		console.log("erroooorr");
	};
	
//
//	$scope.search = function(username) {
//		$log.info("Searching for " + username);
//		github.getUser(username).then(onUserComplete, onError);
//		if (countdownInterval) {
//			$interval.cancel(countdownInterval);
//			$scope.countdown = null;
//		}
//	};

};

var app = angular.module("mainmodule", []);
app.controller("MainController", MainController);
