/**Ejercicio Sesión 1:
 *  Crear un proyecto java desde cero.
 *  Crear un paquete.
 *  Dentro del paquete crear una clase.
 *  Dentro de la clase crear un método main
 *  Imprimir todos los tipos de datos vistos.
 *  Tipos de datos mas comunes:
 *  int, long, double, boolean, String
 **/

package com.javabasico;

public class SesionUnoJava {
    public static void main(String[] args) {

        //declarar y asignar valor a los tipos de datos mas comunes
        int numero1 = 10;
        long numero2 = 203685477;
        double numero3 = 9.5d;
        boolean valor4 = true;
        String cadena5 = "Esto es una cadena de caracteres";

        //mas tipos de datos vistos
        byte numero6 = 3;
        short numero7 = 20;
        float numero8 = 19.5F;
        char valor9 = 'e';

        // y mostrarlas por pantalla.
        System.out.println(">> Todos los tipos de datos primitivos vistos son:");
        System.out.println("Int, para enteros: " + numero1);
        System.out.println("Long, para numero enteros de mayor tamaño: " + numero2);
        System.out.println("Double, para decimales: " + numero3);
        System.out.println("Boolean, para verdadero/falso: " + valor4);
        System.out.println("String, para cadenas de caracteres: " + cadena5);
        System.out.println("Byte, para numeros enteros entre -128 y 127 : " + numero6);
        System.out.println("Short,  para numeros enteros entre -32768 y 32767: " + numero7);
        System.out.println("Float, para numeros decimales: " + numero8);
        System.out.println("Char, para un caracter: " + valor9);

    }
}


