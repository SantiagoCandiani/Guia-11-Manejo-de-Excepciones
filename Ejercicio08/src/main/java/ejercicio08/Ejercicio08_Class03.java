/*
Indique que se mostrará por pantalla cuando se ejecute cada una de estas clases:
 */
package ejercicio08;

/**
 * @author scandiani
 */
public class Ejercicio08_Class03 {

    ///////////////////////////////////////
    ////////Ejercicio08: Class Tres////////
    ///////////////////////////////////////
    public static void main(String[] args) {
        try {
            System.out.println(metodo());
        } catch (Exception e) {
            System.err.println("Excepcion en metodo() ");
            e.printStackTrace();
        }
    }//main

    private static int metodo() {
        int valor = 0;
        try {
            valor = valor + 1;
            valor = valor + Integer.parseInt("W");
            valor = valor + 1;
            System.out.println("Valor final del try: " + valor);
        } catch (NumberFormatException e) {
            valor = valor + Integer.parseInt("W");
            System.out.println("Valor final del catch: " + valor);
        } finally {
            valor = valor + 1;
            System.out.println("Valor final del finally:" + valor);
        }
        valor = valor + 1;
        System.out.println("Valor antes del return: " + valor);
        return valor;
    }
}//class

/**
 RESPUESTA AL EJECUTARLO:
 Excepcion en metodo() Valor final del finally:2

java.lang.NumberFormatException: For input string: "W"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:580)
	at java.lang.Integer.parseInt(Integer.java:615)
	at ejercicio08.Ejercicio08_Class03.metodo(Ejercicio08_Class03.java:31)
	at ejercicio08.Ejercicio08_Class03.main(Ejercicio08_Class03.java:16)
 */

/**
RESPUESTA DE CHAT GPT:
Cuando se ejecute la clase Tres, se imprimirá lo siguiente en la consola:
 
    - Valor final del catch: 1
    - Valor final del finally:2
    - Valor antes del return: 3
    - 3
    
#La explicación es la siguiente:
    1- Se define una variable de tipo entero llamada "valor" y se inicializa en 0.
    2- Se inicia el bloque try, donde se intenta realizar una serie de operaciones.
    3- Primero, se incrementa la variable "valor" en 1.
    4- Luego, se intenta convertir la cadena "W" en un número entero utilizando el método Integer.parseInt("W").
       Como la cadena no puede ser convertida en un número entero, se genera una excepción de tipo NumberFormatException.
    5- Como se ha generado una excepción, se salta al bloque catch. En este bloque, se vuelve a intentar convertir la cadena "W"
       en un número entero, incrementando la variable "valor" en 1.
    6- Después del bloque catch, se ejecuta el bloque finally, que siempre se ejecuta, independientemente de si se ha 
       generado o no una excepción. En este bloque, se incrementa la variable "valor" en 1.
    7- Finalmente, fuera del bloque try-catch-finally, se incrementa la variable "valor" en 1 más y se devuelve el valor de la variable.

Entonces, la salida del programa es:

    * En el bloque catch, el valor de "valor" es 1, ya que se ha incrementado en 1 antes de intentar convertir la cadena "W" en un número entero.
    * En el bloque finally, el valor de "valor" se incrementa en 1 más, y se convierte en 2.
    * Fuera del bloque try-catch-finally, el valor de "valor" se incrementa en 1 más, y se convierte en 3.
    * Finalmente, se muestra por pantalla "Valor final del catch: 1", "Valor final del finally: 2" y "Valor antes del return: 3".
**/