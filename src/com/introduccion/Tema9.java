package com.introduccion;

public class Tema9 {

        public static void main(String[] args) {

            // Crea ahora un objeto de la clase Cliente que
            Cliente objetoCliente = new Cliente();

            // debe tener como propiedades la edad, el telefono, el nombre y el credito,
            //tienes que darles valor
            objetoCliente.edad = 32;
            objetoCliente.nombre = "Eleana";
            objetoCliente.telefono = 5268220;
            objetoCliente.credito = 1000000;

            // y mostrarlas por pantalla.
            System.out.println(">> Datos Cliente");
            System.out.println("Nombre: " + objetoCliente.nombre);
            System.out.println("Edad: " + objetoCliente.edad);
            System.out.println("Nro de telefono: " + objetoCliente.telefono);
            System.out.println("Importe de credito en Euros: " + objetoCliente.credito);

            Trabajador objetoTrabajador = new Trabajador();

            objetoTrabajador.edad = 33;
            objetoTrabajador.nombre = "Rey";
            objetoTrabajador.telefono = 9857725;
            objetoTrabajador.salario = 3000;

            System.out.println(">> Datos Trabajador");
            System.out.println("Nombre: " + objetoTrabajador.nombre);
            System.out.println("Edad: " + objetoTrabajador.edad);
            System.out.println("Telefono: " + objetoTrabajador.telefono);
            System.out.println("Salario en Euros: " + objetoTrabajador.salario);
        }

        /*
        Crea una clase Persona con las siguientes variables:
                La edad
                El nombre
                El teléfono
        */
        class Persona {
            int edad;
            String nombre;
            int telefono;
        }

        // Una vez creada la clase, crea una nueva clase Cliente que herede de Persona,
        static class Cliente extends Persona {
            // esta nueva clase tendrá la variable credito solo para esa clase.
            double credito;
        }

        //Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona,
        static class Trabajador extends Persona {
            // y con una variable salario que solo tenga la clase Trabajador.
            double salario;
        }
}
