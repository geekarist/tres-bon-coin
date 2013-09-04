'use strict';

angular.module('webappApp')
    .controller('MainCtrl', function ($scope, $http) {
        $scope.awesomeThings = [
            'HTML5 Boilerplate',
            'AngularJS',
            'Karma'
        ];

        $http.get('../webresources/myresource/regions').success(function(data) {
            $scope.regions = data.items;
        });

        $scope.updateRegion = function() {
            $http.get('../webresources/myresource/results?region='+ $scope.region).success(function(data) {
                var items = data.items;
                $scope.awesomeThings = [];
                for (var i = 0; i<items.length; i++) {
                    $scope.awesomeThings.push(items[i]);
                }
            })
        }

    });
