# Spring-boot-keycloak

En el servidor keycloak, he seguido https://www.baeldung.com/spring-boot-keycloak, creando un administrador (admin/admin),un realm "myrealm", un usuario "myuser", con contraseña "myuser", un client "login-app", con valid redirect URI "http://localhost:8081/*". El usuario myuser tiene role user (tambien se ha creado ese role).
Subo el servidor keycloack como tal, en lugar de un docker, porque haciendo pruebas para que funcionara el proyecto de springboot he probado a correr el servidor keycloak del mismo tutorial, y aunque el resultado ha sido el mismo, he conseguido que los datos sean persistentes (en docker no lo he conseguido, y eso que he hecho pull docker, no se si hay que hacer algo mas, en cualquier caso no he centrado mi esfuerzo ahi siendo que no iba bien el servidor de springboot).


El servidor keycloak se sirve ejecutando "./standalone.sh -Djboss.socket.binding.port-offset=100" en Spring-boot/bin. Por defecto en el puerto 8180.

El proyecto de springboot se ejecuta mediante "mvn -e clean spring-boot:run", le pongo el flag -e para que muestre algo al menos... Ahi es donde se puede ver que se queja de que no encuentra la ruta al entrar en localhost:8081 (servidor springboot), que deberia mostrar el html "external", que aun no hace nada con keycloak.

En el commit del directorio Spring-boot explico algo sobre la configuracion que tiene.
