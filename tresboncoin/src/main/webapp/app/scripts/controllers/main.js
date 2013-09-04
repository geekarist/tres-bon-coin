'use strict';

angular.module('webappApp')
    .controller('MainCtrl', function ($scope, $http) {
        $scope.awesomeThings = [
            'HTML5 Boilerplate',
            'AngularJS',
            'Karma'
        ];

        $scope.updateRegion = function() {
            $http.get('../webresources/myresource?region='+ $scope.region).success(function(data) {
                var items = data.items;
                $scope.awesomeThings = [];
                for (var i = 0; i<items.length; i++) {
                    $scope.awesomeThings.push(items[i]);
                }
            })
        }

    });
