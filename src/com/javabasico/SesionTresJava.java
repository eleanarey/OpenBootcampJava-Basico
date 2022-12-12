/**
 En este ejercicio tenéis que crear un bucle que permita concatenar textos
 e imprima el resultado final por consola.
 Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:

 @String[] nombres = {"", "", "", ""}
 *
 */

package com.javabasico;
import java.util.Scanner;

public class SesionTresJava {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");

        System.out.println("Escribe un texto o pulsa enter para terminar");
        String cadUsuario = entrada.next()  + " ";

        String concatenar = "";

        while (!cadUsuario.isEmpty()) {

            concatenar += cadUsuario;

            System.out.println("Escribe un texto o palabra o pulsa enter para terminar");
            cadUsuario = entrada.next();
        }
        System.out.println(concatenar);

    }
}
