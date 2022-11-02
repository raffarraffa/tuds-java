/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
 */
package g8_ej_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author santi
 */
public class G8_Ej_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        //INGRESO LAS PERSONAS
        ArrayList<Persona> personas = new ArrayList();
        int cont = 1;
        do {
            System.out.println("                         <<< PERSONA N°" + cont + " >>>");
            System.out.print("Nombre: ");
            String nombre = leer.next();
            System.out.print("Apellido: ");
            String apellido = leer.next();
            System.out.print("Edad: ");
            int edad = leer.nextInt();
            System.out.print("Documento: ");
            String dni = leer.next();
            System.out.println("______________________________________________________________________");
            Persona H1 = new Persona(nombre, apellido, edad, dni);
            personas.add(H1);
            cont++;
        } while (cont <= 2);

        //INGRESO LOS PERROS
        ArrayList<Perro> perros = new ArrayList();
        cont = 1;
        do {
            System.out.println("                         <<< PERRO N°" + cont + " >>>");
            System.out.print("Nombre: ");
            String nombre = leer.next();
            System.out.print("Raza: ");
            String raza = leer.next();
            System.out.print("Edad: ");
            int edad = leer.nextInt();
            System.out.print("Tamaño: ");
            String tamanio = leer.next();
            System.out.println("______________________________________________________________________");
            Perro P1 = new Perro(nombre, raza, edad, tamanio);
            perros.add(P1);
            cont++;
        } while (cont <= 2);

        //ASIGNO PERRO A CADA PERSONA, COPIANDO LA LISTA ORIGINAL PERROS PARA PODER
        //BORRAR PERROS SELECCIONADOS, Y AHI SEGUIR PREGUNTANDO A LA OTRA PERSONA.
        ArrayList<Perro> perrosAdoptar = perros;
        for (Persona aux : personas) {
            if (aux.getPerro() == null) {

                System.out.print(aux.getNombre());
                System.out.println(", ¿Que perro desea adoptar?");
                cont = 1;
                for (Perro aux2 : perrosAdoptar) {
                    System.out.println(cont + ". " + aux2.getNombre());
                    cont++;
                }
                int resp = leer.nextInt();

                boolean flag = false;//Bandera para detener Do-While si la resp esta dentro de las opciones
                do {
                    if (resp <= perros.size()) {
                        aux.setPerro(perrosAdoptar.get(resp - 1));
                        perrosAdoptar.remove(resp - 1);
                        flag = true;
                    } else {
                        System.err.println("Opción invalida, ingrese nuevamente que perro desea adoptar.");
                        resp = leer.nextInt();
                    }
                } while (!flag);
            }
            System.out.println("______________________________________________________________________");
        }

        //MUESTRO LAS LISTAS
        System.out.println("                       <<< LISTADO ADOPCIONES >>>");
        personas.forEach((aux) -> {
            System.out.println(aux.personaYPerro());
            System.out.println("----------------------------------------------------------------------");
        });
    }
}
