/**
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. 
 *  El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
 *  después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
 *  decide salir, se mostrará todos los perros guardados en el ArrayList.
 */
package guia_7_ej_01;
import java.util.ArrayList;
import java.util.Scanner;

public class Guia_7_ej_01 {

    public static void main(String[] args) {
        ArrayList<String> perros = new ArrayList();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String perro;
        do {
            System.out.print("Ingrese raza perro -> ");
            perro = leer.next();// conviene porque permite manipular los datos y validar los mismos 
            perro = perro.toUpperCase();
            if (perros.contains(perro)) { // NO PERMITE REPETIR RAZAS
                System.out.println("La Raza existe");
            } else {
                perros.add(perro); // agrega lo leido por variable
            }
            
            // perros.add(leer.next()); // agrego raza leido directo en el metodo NO CONVIENE PORQUE NO PERMITE VALIDAR DATOS O MANIPULARLOS
            
            System.out.print("Quiere ingresar otro prerro (S /N) ->");
        } while (leer.next().equalsIgnoreCase("s")); // puede tener valores 'V'  o  'F'
        /*
        for (String perro1 : perros) {
            System.out.println("Raza: " + perro1);
        }
        */
        perros.forEach((perro1) -> { // esta es mas moderna y muy similar a otros lenguajes, conviene que lo aprendan (javascript, php, python)
            System.out.println("Raza: " + perro1);
        });
    }
}
     /* opcion antigua
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean otro = true;
        String raza;
        ArrayList<String> perros = new ArrayList();
        System.out.println("Razas perros");
        do {
            System.out.print("Ingrese raza -> ");
            raza = leer.next();
            perros.add(raza);
            System.out.print("Quiere ingresar otra raza -> S (si) N (no) ");
            if (leer.next().equalsIgnoreCase("N")) {
                otro = false;
            }
        } while (otro);
        
        perros.forEach((nombre) -> {
            System.out.println("Raza  " + nombre);
        });
        System.out.println(perros);
*/
    }
}
