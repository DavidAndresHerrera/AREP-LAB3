## AREP-2021 LAB-2

Este proyecto cuenta de un servidor que se va a usar para crear un mini spark y poder entender como funciona espark, ademas se va a hacer que se puedan consultar recursos que tenga el proyecto como imagenes, un index que es un html y texto.


### Prerequisitos

- Maven: Esta es la herramienta encargada de la creacion del proyecto y ayuda a manejar la despedencias del mismo
- Git: Software de control de versiones.
- JDK: Es la herramienta que sirve para desarrollar en java, versiones de este programa desde la 8 en adelante.
- Heroku: Debe tener instalado heroku cli en su computador si desea correr la aplicacion de manera local

### Instalacion

 Para poder instalar el programa debe clonar este repositorio en su computador, esto lo puede hacer con el sigueinte comando.
 >https://github.com/DavidAndresHerrera/AREP-LAB3.git

 antes de clonar el proyecto en su maquina local verifique la ubicacion donde quiere dejar el proyecto.
 
### Ejecucion y empaquetado

Para empaquetar y ejecutar el programa usando maven ingresa el siguiente comando dentro de la carpeta Media_DsvEstandar-app
> mvn package

Cuando ya el proyecto ha compilado, puede proceder a ejecutarlo, use el siguiente comando sobre el directorio SparkWebApp

> java -cp -cp "target/classes" edu.escuelaing.arep.sparkWeb.DemoRuntime


### Ejecucion de pruebas

Despues de empaquetado el programa y saber que esta corriendo de manera correcta ingresa el sigueitne comando

> mvn test

### Despliegue Heroku 

En este link podra ver el despliegue de la aplicacion en heroku.

> [![Deployed to Heroku](https://www.herokucdn.com/deploy/button.png)](https://desolate-spire-29160.herokuapp.com/)


### Integracion continua

En este link puede encontrar la integracion continua en CircleCi

> [![CircleCI](https://app.circleci.com/pipelines/github/DavidAndresHerrera/AREP-LAB2.svg?style=svg)](https://app.circleci.com/pipelines/github/DavidAndresHerrera/AREP-LAB3)

### Licencia
GNU General Public License v3.0 

### Autor 

#### David Andres Herrera Moya 
