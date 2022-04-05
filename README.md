# Aplicación Distribuida Segura en Todos sus Frentes
## Descripción
En este taller se desarrollará una aplicación capaz de permitir un acceso seguro desde el browser a la aplicación, es decir, que este garantizará autenticación, autorización e integridad de usuarios, en los que se ha creado una interfaz de inicio de sesión que permite acceso seguro desde el navegador, y donde el usuario puede iniciar sesión de forma segura en este. También se implementó la funcionalidad en la que al menos dos computadores se comunican entre ellos y el acceso de servicios remotos garantiza: autenticación, autorización e integridad entre los servicios, en los que nadie puede invocar los servicios si no está autorizado.

## Prerrequisitos
Para la realización y ejecución tanto del programa como de las pruebas de este, se requieren ser instalados los siguientes programas:
* Maven
* GIT
* Docker


## Instalación
Para descargar el proyecto de GitHub, primero debemos clonar este repositorio.
```
git clone https://github.com/conejihan/AREP-lab6
```

## Ejecución
Para compilar el proyecto se utilizara el siguiente comando:

```
mvn package
```
## Pruebas
Para realizar las pruebas se ejecuta el siguiente:

```
mvn test
```

## Certificados
Para poder establecer una conexión HTTPS con la aplicación, garantizando autenticación, autorización e integridad de usuarios, se realizará el procedimiento de establecer los certificados con llaves para cada uno de los programas. 

Para establecer la primera llave, se ejecutará el siguiente comando dentro de la carpeta keystores, donde se almacenará todas las llaves y certificados.

```
keytool -genkeypair -alias ecikeypair -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore ecikeystore.p12 -validity 3650
```

Despues se ingresaran los datos que se pediran.

Para establecer el certificado de la llave ya creada se ejecutará el siguiente comando.

```
keytool -export -keystore ./ecikeystore.p12 -alias ecikeypair -file ecicert.cer
```



Para crear el myTrustStore para la llave ya creada con su respectivo certificado, se ingresa el siguiente comando.

```
keytool -import -file ./ecicert.cer -alias firstCA -keystore myTrustStore
```



