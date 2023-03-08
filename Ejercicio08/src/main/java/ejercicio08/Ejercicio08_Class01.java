/*
Indique que se mostrará por pantalla cuando se ejecute cada una de estas clases:
 */
package ejercicio08;

/**
 * @author scandiani
 */
public class Ejercicio08_Class01 {
        //////////////////////////////////////
        ////////Ejercicio08: Class Uno////////
        //////////////////////////////////////

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
            valor = valor + Integer.parseInt("42");
            valor = valor + 1;
            System.out.println("Valor final del try:" + valor);
        } catch (NumberFormatException e) {
            valor = valor + Integer.parseInt("42");
            System.out.println("Valor final del catch  :" + valor);
        } finally {
            valor = valor + 1;
            System.out.println("Valor final del finally: " + valor);
        }
        valor = valor + 1;
        System.out.println("Valor antes del return: " + valor);
        return valor;
    }//metodo
}//class

/**
RESPUESTA:
Cuando se ejecute la clase Uno, se imprimirá lo siguiente en la consola:
    -Valor final del try: 44
    -Valor final del finally: 45
    -Valor antes del return: 46
    -46 (del retorno)
    
#La explicación es la siguiente:
    * El método metodo() tiene un bloque try-catch-finally que realiza ciertas operaciones
      aritméticas y luego imprime algunos mensajes en la consola. En este caso, no se produce
      una excepción, por lo que se ejecutan el bloque try y el bloque finally.
    * El bloque try suma 1 al valor de valor, luego suma 42 al mismo, y luego agrega 1 más.
      El resultado es 44. Este valor se imprime en la consola como "Valor final del try: 44".
    * Como no se produce una excepción, el bloque catch se salta y se ejecuta el bloque finally.
      El bloque finally suma 1 al valor de valor, lo que lo hace 45. Este valor se 
      imprime en la consola como "Valor final del finally: 45".
    * El valor de valor se incrementa en 1 una vez más fuera del bloque try-catch-finally 
      y se imprime en la consola como "Valor antes del return: 46".
    * Finalmente, el valor de retorno de metodo() se imprime en la consola como 46,
      que es el valor final.
**/
