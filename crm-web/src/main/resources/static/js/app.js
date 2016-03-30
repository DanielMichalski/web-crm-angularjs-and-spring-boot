(function () {
    var app = angular.module('crmApp', ['ngRoute', 'crmService']);

    app.config(['$routeProvider', function ($routeProvider) {
        $routeProvider
            .when('/clients', {
                controller: 'ClientsListCtrl',
                templateUrl: 'views/clients-list.html'
            })
            .when('/sectors', {
                templateUrl: 'views/sectors-list.html'
            })
            .when('/users', {
                templateUrl: 'views/users-list.html'
            })
            .otherwise({
                redirectTo: '/clients'
            });
    }]);

    app.controller('ClientsListCtrl', ['$scope', 'clients', 'users', 'sectors', function ($scope, clients, users, sectors) {
        
        $scope.clients = [];
        $scope.users = [];
        $scope.sectors = [];

        $scope.orderByColumn = 'id';
        $scope.orderByDir = false;
        
        $scope.filterBy = {};

        init();

        function init() {
            clients.getClients(function (clients) {
                $scope.clients = clients;
            });
            users.getUsers(function (users) {
                $scope.users = users;
            });
            sectors.getSectors(function (sectors) {
                $scope.sectors = sectors;
            })
        }

        $scope.changeOrder = function (columnName) {
           if($scope.orderByColumn == columnName)  {
               $scope.orderByDir = !$scope.orderByDir;
           } else {
               $scope.orderByColumn = columnName;
               $scope.orderByDir = false;
           }
        }

    }]);

})();