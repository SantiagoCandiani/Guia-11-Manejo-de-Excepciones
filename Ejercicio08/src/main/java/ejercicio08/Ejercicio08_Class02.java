/*
Indique que se mostrará por pantalla cuando se ejecute cada una de estas clases:
 */
package ejercicio08;

/**
 * @author scandiani
 */
public class Ejercicio08_Class02 {
    //////////////////////////////////////
    ////////Ejercicio08: Class Dos////////
    //////////////////////////////////////

    public static void main(String[] args) {

        try {
            System.out.println(metodo());
        } catch (Exception e) {
            System.err.println("Excepcion en metodo()");
            e.printStackTrace();
        }

    }//main

    private static int metodo() {        
        int valor = 0;        
        try {
            valor = valor + 1;
            valor = valor + Integer.parseInt("W");
            valor = valor + 1;
            System.out.println("Valor final del try : " + valor);
        } catch (NumberFormatException e) {
            valor = valor + Integer.parseInt("42");
            System.out.println("Valor final del catch  : " + valor);
        } finally {
            valor = valor + 1;
            System.out.println("Valor final del finally: " + valor);
        }
        valor = valor + 1;
        System.out.println("Valor antes del return: " + valor);
        return valor;
    }
}//class

/**
RESPUESTA:
Cuando se ejecute la clase Dos, se imprimirá lo siguiente en la consola:
    -Valor final del catch: 43
    -Valor final del finally: 44
    -Valor antes del return: 45
    -45 (del retorno)
    
#La explicación es la siguiente:
    * El método metodo() tiene un bloque try-catch-finally que realiza ciertas operaciones
      aritméticas y luego imprime algunos mensajes en la consola.  En este caso, se produce una
      excepción de tipo NumberFormatException en la línea valor = valor + Integer.parseInt("W"),
      por lo que se ejecuta el bloque catch en lugar del bloque try.
    * El bloque catch suma 42 al valor de valor, que ya tenía un valor de 1, lo que lo hace 43.
      Este valor se imprime en la consola como "Valor final del catch: 43"
    * Luego, el bloque finally suma 1 al valor de valor, lo que lo hace 44. 
      Este valor se imprime en la consola como "Valor final del finally: 44".
    * El valor de valor se incrementa en 1 una vez más fuera del bloque try-catch-finally
      y se imprime en la consola como "Valor antes del return: 45".
    * Finalmente, el valor de retorno de metodo() se imprime en la consola como 45, 
      que es el valor final.
**/
