# Monstercat Project

##### Sobre la API
Es una API desarrollada en Java con SpringBoot con una base de datos SQL (MySQL) basada en el sello discográfico de música electrónica Monstercat que sirve para crear, modificar, eliminar y ver canciones, artistas y albumes.
Mas adelante voy a crear un frontend (ya está en proceso) para que la interacción con la API sea más amigable, pero por el momento hay una colección de pedidos a la API (en el directorio raíz) creada con la APP Insomnia para importar a Postman, Insomnia u otra aplicación.

La base de datos la tengo dockerizada. Estos son los comandos que usé para crear el container:

1) docker pull mysql

2) docker run --name mysql -p 3307:3306 -e MYSQL_USER=admin -e MYSQL_PASSWORD=admin -e MYSQL_ROOT_PASSWORD=admin -e MYSQL_DATABASE=monstercat -d mysql