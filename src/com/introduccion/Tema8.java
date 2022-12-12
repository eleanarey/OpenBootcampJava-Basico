//Tema_8 - Practica de encapsulación:
package com.introduccion;

public class Tema8 {

        public static void main(String[] args)
        {
            //Crear un objeto persona en el main.
            Persona personaObj = new Persona();

// Utiliza los gets y sets para darle valores a las propiedades
// edad, nombre y telefono, por último muéstralas por consola.
            personaObj.setEdad(32);
            personaObj.setNombre("Eleana");
            personaObj.setTelefono(5268220);
            System.out.println("Nombre: " + personaObj.getNombre());
            System.out.println("Edad: " + personaObj.getEdad());
            System.out.println("Telefono: " + personaObj.getTelefono());

        }
        //Crear clase Persona.
        public static class Persona{

            //Crear variables las privadas edad, nombre y telefono de la clase Persona.
            private String nombre;
            private int edad;
            private int telefono;

            //Crear gets y sets de cada propiedad.
            public String getNombre() {
                return nombre;
            }
            public void setNombre(String nombre) {
                this.nombre = nombre;
            }
            public int getEdad() {
                return edad;
            }
            public void setEdad(int edad) {
                this.edad = edad;
            }
            public int getTelefono() {
                return telefono;
            }
            public void setTelefono(int telefono) {
                this.telefono = telefono;
            }
        }
}
