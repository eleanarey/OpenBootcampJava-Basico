/**      Tema 3
 *       Segunda parte:
        -Crear una clase coche.
        -Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
        -Una función que incremente el número de puertas que tiene el coche.
        -Crear un objeto miCoche en el main y añadirle una puerta.
        -Mostrar el número de puertas que tiene el objeto.
        **/
package com.introduccion;

public class Tema3Parte2 {


        public static void main (String [] args) {

            Coche miCoche = new Coche();
            miCoche.agregarPuertas();
            System.out.println("Mi coche tiene " + miCoche.puertas + " puertas");
        }
    static class Coche {

        public int puertas = 2;

        public void agregarPuertas() {
            this.puertas++;
        }
    }
}