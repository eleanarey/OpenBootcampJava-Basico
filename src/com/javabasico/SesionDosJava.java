/**Ejercicio sesión 2:
 * Crear una funcion que reciba un precio y devuelva el precio con el IVA incluido
 */

package com.javabasico;

public class SesionDosJava {

    public static void main(String[] args) {
                        CalcularPvp(10);
            }
            private static void CalcularPvp ( double base){
                double iva= base*0.21;
                double pvp= base+iva;
                System.out.println("El precio total a pagar es: " + pvp);
            }

        }