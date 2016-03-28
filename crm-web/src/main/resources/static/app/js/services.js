(function () {

    var app = angular.module('crmService', []);

    app.factory('clients', ['$http', function ($http) {

        var _getClients = function (callback) {
            callback = callback || function () {
                };

            $http.get('/api/clients')
                .success(function (data) {
                    callback(data)
                });
        };

        return {
            getClients: _getClients
        };

    }]);

})();