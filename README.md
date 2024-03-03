# practica2progra2


Este proyecto implementa una aproximación al número Pi utilizando el método de Montecarlo. La aproximación se realiza generando puntos aleatorios dentro de un cuadrado unitario y contando cuántos de esos puntos caen dentro de un círculo unitario inscrito. La relación entre la cantidad de puntos dentro del círculo y el total de puntos generados se utiliza para aproximar el valor de Pi.

En cuanto a su estructura, el proyecto se organiza en dos paquetes:

Paquete "mates", el cual cotiene la clase "Matemáticas" el cual implementa la lógica del método de Montecarlo. Y el paquete "aplicacion", donde contiene la clase "Principal" que se encarga de la ejecución del programa.

En cuanto a la compilación y ejecución del programa, deberemos ejecutar el programa principal utiliando el siguiente comando:

java -cp bin aplicacion.Principal <numero_de_pasos>

Este comando generará una aproximación de Pi utilizando un millón de puntos donde podremos ajustar la cantidad de pasos que sean necesarios-
