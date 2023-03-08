/*
EJERCICIO COMPLEMENTARIO DE MANEJO DE EXCEPCIONES
Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar de invocar el
método esMayorDeEdad() a través de ese objeto. Luego, englobe el código con una cláusula
try-catch para probar la nueva excepción que debe ser controlada.
 */
package ejercicio07;

import ejercicio07.Entidades.Persona;
import ejercicio07.Servicios.Servicios;
import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        //Persona[] pers1 = new Persona[4];
        Servicios serv = new Servicios();

        //Inicializo el objeto persona en null
        Persona p1 = null;

        //invocar el método esMayorDeEdad()
        //serv.esMayorDeEdad(p1); //tira error Exception in thread "main" java.lang.NullPointerException
        try {
            System.err.println("Es mayor de edad: " + serv.esMayorDeEdad(p1));
        } catch (Exception a) {
            System.err.println("Se produjo una excepcion: " + a.getMessage());
            System.err.println("Se produjo una excepcion: " + a);
            System.err.println(a.toString());
            System.err.println(a.fillInStackTrace());
        }
    }
}
