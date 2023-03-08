/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
 */
package ejercicio02;

import entidades.ClaseArray;

/**
 *
 * @author scand
 */
public class Ejercicio02 {

    public static void main(String[] args) {

        int[] vector = {7, 9, 11};
        ClaseArray ar1 = new ClaseArray(vector);

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(vector[i]);
            }
        } catch (ArrayIndexOutOfBoundsException a) {
            System.err.println(a);
            System.err.println("Error: Indice fuera de rango");
        } catch (Exception a) {
            System.err.println(a);
            System.out.println("Error: Fallo en el sistema.");
        }
    }//main
}//class
