/**
 * Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para
 * leer dos números en forma de cadena. A continuación, utilice el método parseInt() de la
 * clase Integer, para convertir las cadenas al tipo int y guardarlas en dos variables de tipo
 * int. Por ultimo realizar una división con los dos numeros y mostrar el resultado.
 */
package guia10ej04;

import guia10ej04.entidades.DivisionNumero;
import java.util.*;

public class Guia10ej04 {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        DivisionNumero result = new DivisionNumero();
        String num1, num2;
        System.out.println("EJERCICIO 3 GUIA 10");
        System.out.print("Ingrese dividendo  -> ");
        result.setNum_1(Integer.parseInt(leer.next()));
        System.out.print("Ingrese divisor  -> ");
        result.setNum_2(Integer.parseInt(leer.next()));
        result.divisionNumeros();
    }

    public static void info() {

    }

}
