var app = angular.module("miApp",["ngRoute","ngStorage"]);

app.config(function($routeProvider){
    $routeProvider
        .when("/", {
            controller: "modulo1Controller",
            controllerAs: "m1",
            templateUrl: "vistas/form.html"
        })
        .when("/ventas", {
            controller: "ventaController",
            controllerAs: "ven",
            templateUrl: "vistas/ventas.html"
        })
        .when("/usuarios", {
            controller: "usuarioController",
            controllerAs: "us",
            templateUrl: "vistas/usuarios.html"
        })
        .when("/pedidos", {
            controller: "pedidoController",
            controllerAs: "ped",
            templateUrl: "vistas/pedidos.html"
        })
        .when("/promociones", {
            controller: "promocionController",
            controllerAs: "promo",
            templateUrl: "vistas/promociones.html"
        })
        .when("/premios", {
            controller: "premioController",            
            templateUrl: "vistas/premios.html"
        });
});

