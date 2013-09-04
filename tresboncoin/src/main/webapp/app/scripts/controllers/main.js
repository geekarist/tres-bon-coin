'use strict';

angular.module('webappApp')
    .controller('MainCtrl', function ($scope, $http) {
        $scope.awesomeThings = [
            'HTML5 Boilerplate',
            'AngularJS',
            'Karma'
        ];

        // Call backend
        $http.get('../webresources/myresource').success(function(data) {
            $scope.awesomeThings.push(data)
        })
    });
