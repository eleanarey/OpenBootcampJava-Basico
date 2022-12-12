package com.introduccion;
import java.util.Scanner;

public class Tema4 {

    public static void main(String[] args)
    {

    /** 1- Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
    Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
     **/

        float numeroIf;
        Scanner teclado1 = new Scanner(System.in);
        System.out.print("Introduzca un numero para la variable numeroIf: ");
        numeroIf = teclado1.nextFloat();

        if (numeroIf> 0 ) {
            System.out.println("La variable es un numero positivo");
        }
        else if (numeroIf < 0) {
            System.out.println("La variable es un numero negativo");
        }
        else {
            System.out.println("La variable es cero");
        }

    /** 2- Crea un bucle While, este bucle tendrá que tener como condición
    que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
   - Incrementar el valor de la variable en uno cada vez que se ejecute.
   - Mostrarlo por pantalla cada vez que se ejecute.
    */

        int numeroWhile;
        Scanner teclado2 = new Scanner(System.in);
        System.out.print("Introduzca un numero para la variable numeroWhile: ");
        numeroWhile = teclado2.nextInt();


        while (numeroWhile < 3) {// condicion

            System.out.println("numeroWhile" + " " + numeroWhile);

            numeroWhile++; // contador
        }


    /** 3- Para el bucle Do While, deberás crear la misma estructura que en el While,
    pero solo se debe ejecutar una vez.
     */

        int numeroDoWhile;
        Scanner teclado3 = new Scanner(System.in);
        System.out.print("Introduzca un numero para la variable numeroDoWhile: ");
        numeroDoWhile = teclado3.nextInt();

        do {
            System.out.println("El numero DoWhile ingresado es" + " " + numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile < 3);// condicion

    /** 4- Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0
    y su condición será que la variable sea igual o menor que 3,
    se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
     */
        System.out.println("numeroFor se inicializa en 0 y se ejecuta el bucle for mientras la variable sea menor o igual a 3");
        for(int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("El valor de la variable numeroFor es: " + numeroFor);
        }

    /** 5- Por último, para el Switch, deberás crear la variable estacion,
    y distintos case para las cuatro estaciones del año.
    Dependiendo del valor de la variable estacion se deberá mandar un mensaje
    por consola informando de la estación en la que está.
    También habrá que poner un default para cuando el valor de la variable no sea una estación.
     */

        String estacion;
        Scanner teclado4 = new Scanner(System.in);
        System.out.print("Introduzca la estacion en la que estamos (primavera, verano, otoño o invierno) : ");
        estacion = teclado4.next();

        switch(estacion){
            case "primavera":
                System.out.print("La estacion en la que estamos es: " + estacion);
                break;
            case "verano":
                System.out.print("La estacion en la que estamos es: " + estacion);
                break;
            case "otoño":
                System.out.print("La estacion en la que estamos es: " + estacion);
                break;
            case "invierno":
                System.out.print("La estacion en la que estamos es: " + estacion);
                break;
            default:
                System.out.print("No existe esta estacion");

        }
    }
}
