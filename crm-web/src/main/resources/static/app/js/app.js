(function () {
    var app = angular.module('crmApp', ['ngRoute', 'crmService']);

    app.config(['$routeProvider', function ($routeProvider) {
        $routeProvider
            .when('/clients', {
                controller: 'ClientsListCtrl',
                templateUrl: 'app/views/clients-list.html'
            })
            .when('/sectors', {
                templateUrl: 'app/views/sectors-list.html'
            })
            .when('/users', {
                templateUrl: 'app/views/users-list.html'
            })
            .otherwise({
                redirectTo: '/clients'
            });
    }]);

    app.controller('ClientsListCtrl', ['$scope', 'clients', function ($scope, clients) {
        
        $scope.clients = [];

        $scope.orderByColumn = 'id';
        $scope.orderByDir = false;

        clients.getClients(function (clients) {
            $scope.clients = clients;
        });

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