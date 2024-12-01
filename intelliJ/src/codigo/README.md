1. ENUNCIADO DE LA ACTIVIDAD

Vas a crear un juego de azar donde van a competir en una carrera varios animales. Para
ello vamos a tener una clase Animal con las siguientes características:
-
 Un atributo String para el nombre
-
 Un atributo int para la distancia recorrida durante la carrera
Y en cuanto al comportamiento de Animal, habrá:
-
 Un constructor que recibirá el nombre y que inicializará la distancia recorrida a 0.
El método no mostrará nada en consola.
-
 Un método correr que recibe un valor entero (la distancia recorrida en metros). El
método sumará dicha nueva cantidad de metros al atributo de distancia recorrida
en los turnos anteriores. El método no mostrará nada en consola.
Esa clase deberá funcionar con el siguiente método Main.java:

package codigo;
import java.util.Random;
public class Main {
public static void main(String[] args) {
Animal gato = new Animal("Simba");
Animal perro = new Animal("Luna");
Animal zorro = new Animal("Thor");
Random rn = new Random();
for (int turno = 1; turno <= 10; turno++) {
gato.correr(rn.nextInt(9)+1);
perro.correr(rn.nextInt(9)+1);
zorro.correr(rn.nextInt(9)+1);
}
System.out.println(gato.getNombre() + " " + gato.getDistancia() + " metros");
System.out.println(perro.getNombre() + " " + perro.getDistancia() + " metros");
System.out.println(zorro.getNombre() + " " + zorro.getDistancia() + " metros");
}
}

Presta especial atención a los detalles, como el nombre del paquete o los nombres de los
métodos que se emplean en el método main para construir tu clase Animal. En caso de
error, el programa no funcionará, suponiendo un suspenso.

2. EJEMPLO DE EJECUCIÓN DE MAIN.JAVA
A continuación podemos ver un ejemplo de ejecución de una carrera. Dado que los
números son aleatorios, el resultado puede variar de una ejecución a otra.
Este es el Output:
Simba 62 metros
Luna 58 metros
Thor 42 metros


3. EVALUACION
La evaluación de esta actividad se realizará siguiendo la siguiente rúbrica:
1. Compilación (2 puntos). El programa compila correctamente.
2. Clase Animal (8 puntos) distribuidos de la siguiente forma:
a. Creación de atributos (2 puntos). Creación correcta de atributos.
b. Creación del método constructor (2 puntos). Método constructor correcto.
c. Creación de getters y setters (2 puntos). Getters y setters correctos.
d. Creación del método correr (2 puntos). Creación correcta del método.
