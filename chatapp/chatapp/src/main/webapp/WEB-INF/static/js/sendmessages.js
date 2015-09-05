var sendmessagesservice = function($http) {

	var sendMessages = function(sendersmessage) {
		console.log("sendersmessage sendMessages hivas")
		console.log(sendersmessage);
		return $http.post("/chatapp/sendmessages", sendersmessage)
		.then(function(response) {
			console.log("sendmessage lefutott")
			return response;
		});
	};


	return {
		sendMessages : sendMessages
	};

};

var module = angular.module("mainmodule");
module.factory("sendmessagesservice", sendmessagesservice);
