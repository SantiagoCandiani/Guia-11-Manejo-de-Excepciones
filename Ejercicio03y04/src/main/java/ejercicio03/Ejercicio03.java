/*
 Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
 */
package ejercicio03;

import entidades.DivisionNumero;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author scand
 */
public class Ejercicio03 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        DivisionNumero d1 = new DivisionNumero();

        try {
            System.out.println("- Ingrese el primer numero:");
            String aux1 = leer.next();
            System.out.println("- Ingrese el segundo numero:");
            String aux2 = leer.next();

            d1.setNum1(Integer.parseInt(aux1));
            d1.setNum2(Integer.parseInt(aux2));

            double division = (d1.getNum1() / d1.getNum2());
            System.out.println("El resultado de la division es:" + (double) division);

        } catch (NumberFormatException e) {
            System.err.println(e);
            e.printStackTrace();
            System.err.println("Error de formato");
        } catch (ArithmeticException e) {
            System.err.println("e");
            System.err.println("Division por cero");
        } catch (InputMismatchException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        main(args); //sirve para poder ejecutarlo muchas veces. Recursivo.

    }//main
}//class
