var getmessagesservice = function($http) {

	var getMessages = function() {
		return $http.get("/chatapp/getmessages").then(function(response) {
			return response.data;
		});
	};

	return {
		getMessages : getMessages
	};

};

var module = angular.module("mainmodule");
module.factory("getmessagesservice", getmessagesservice);
