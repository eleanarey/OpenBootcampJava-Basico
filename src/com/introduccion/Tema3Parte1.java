/**     Tema 3
 *      Primera parte:
        -Crear una función con tres parámetros que sean números que se suman entre sí.
        -Llamar a la función en el main y darle valores.
        **/

package com.introduccion;

public class Tema3Parte1 {


        public static void main (String[] args)
        {
            int resultado;
            resultado = suma (5, 10, 15);
            System.out.println("El resultado de la suma es " + resultado);
        }

        public static int suma(int a, int b, int c)
        {
            return a + b + c;
        }
    }