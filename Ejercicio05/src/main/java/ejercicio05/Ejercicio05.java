/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */
package ejercicio05;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author scand
 */
public class Ejercicio05 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Random generadorAleatorio = new Random();
        int numeroAleatorioEntero = generadorAleatorio.nextInt(500);
        int contador = 0;
        System.out.println("El numero secreto:" + numeroAleatorioEntero);

        while (true) {
            try {
                System.out.println("Ingrese un numero:");
                int num = leer.nextInt();

                if (num == numeroAleatorioEntero) {
                    System.out.println("Has Adivinado.");
                    break;
                }
                if (num > numeroAleatorioEntero) {
                    System.out.println("El numero ingresado es mayor.");
                }
                if (num < numeroAleatorioEntero) {
                    System.out.println("El numero ingresado es menor.");
                }
            } catch (Exception e) {
                System.err.println(e);
                System.out.println("Error");
            } finally {
                contador++;
                System.out.println("Nro de intentos: " + contador);
                leer.next();//sirve para romper un bucle que se genera.

            }
        }

    }//main
}//class
