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

    app.factory('users', ['$http', function ($http) {
        var _getUsers = function (callback) {
            callback = callback || function () {
                };

            $http.get('/api/users')
                .success(function (data) {
                    callback(data)
                });
        };
        return {
            getUsers: _getUsers
        };
    }]);

    app.factory('sectors', ['$http', function ($http) {
        var _getSectors = function (callback) {
            callback = callback || function () {
                };

            $http.get('/api/sectors')
                .success(function (data) {
                    callback(data)
                });
        };
        return {
            getSectors: _getSectors
        };
    }]);


})();