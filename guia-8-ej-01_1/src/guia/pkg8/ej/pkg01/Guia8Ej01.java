/**
 * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos clases.
 * Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
 * Persona con atributos: nombre, apellido, edad, documento y Perro.
 * Ahora deberemos en el main crear dos Personas y dos Perros.
 * Después, vamos a tener que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
 * mostrar desde la clase Persona, la información del Perro y de la Persona.
 */
package guia.pkg8.ej.pkg01;

import guia.pkg8.ej.pkg01.entidades.*;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.*;

public class Guia8Ej01 {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        // var d eopciones     
            limpiarConsola();
        int opcion_menu_principal = 100;
        int opcion_persona;
        int opcion_mascota;
        ArrayList<Persona> personas = new ArrayList();
        ArrayList<Perro> perros = new ArrayList();
        boolean no_existe = false;
        // cinstanciar perros
       /* 
        for (int i = 1; i <= 10; i++) {
            Perro perro = new Perro("perro" + String.valueOf(i), "raza" + String.valueOf(i), i * 5, "tamaño" + String.valueOf(i), i * 2);
            perros.add(perro);
        }
        // instanciar personas
        for (int i = 1; i <= 10; i++) {
            Persona persona = new Persona("persona  " + String.valueOf(i), "Apellido " + String.valueOf(i), (i * 14), String.valueOf((int) (Math.random() * 100000000 - 9999999) + 1));
            personas.add(persona);
        }
*/
        while (opcion_menu_principal != 0) {
            //delay();
            limpiarConsola();
            menu();
            opcion_menu_principal = opcion(0, 8);

            switch (opcion_menu_principal) {
                case 1: //  persona BUSCAR Y ELEGIR PUEDE
                    subMenuPersona();
                    opcion_persona = opcion(0, 2);
                    switch (opcion_persona) {
                        case 1:
                            
                            System.out.println("adopta");
                            break;
                        case 2:
                            System.out.println("devuleve");
                            break;
                        case 0:
                            System.out.println("vovler menu principal");
                            delay(10);
                            break;
                    }
                    
                case 2: // persona alta
                    System.out.println("ALTA PERSONA");
                    Persona persona = new Persona();
                    System.out.println("Ingrese datos persona");
                    System.out.print("Nombre: -> ");
                    persona.setNombre(leer.next());
                    System.out.print("Apellido: -> ");
                    persona.setApellido(leer.next());
                    System.out.print("Edad: -> ");
                    persona.setEdad(leer.nextInt());
                    System.out.print("Dni: -> ");
                    persona.setDocumento(leer.next());
                    personas.add(persona);
                    delay(10);
                    break;
                case 3: // mascotas alta
                    System.out.println("ALTA mascota");
                    Perro perro = new Perro();
                    System.out.println("Ingrese datos mascota");
                    System.out.print("Nombre: -> ");
                    perro.setNombre(leer.next());
                    System.out.print("Raza: -> ");
                    perro.setRaza(leer.next());
                    System.out.print("Edad: -> ");
                    perro.setEdad(leer.nextInt());
                    System.out.print("Tamaño: -> ");
                    perro.setTamanio(leer.next());
                    perros.add(perro);
                    delay(10);
                    break;

                case 4: // ver mascotas adoptadas
                    do {                       
             
                    System.out.println("submenu mascotas");
                    subMenuMascota();
                    opcion_mascota = opcion(0, 3);
                    switch (opcion_mascota) {
                        case 1:
                            System.out.println("listar mascotas adiptadas");
                            delay(10);
                            break;
                        case 2:
                            System.out.println("listar mascotas sin adoptar");
                            delay(10);
                            break;
                        case 3:
                            System.out.println(" listar general mascotas(aadoptas, sin adoptar");
                            delay(10);
                            break;
                        case 0:
                            break;
                    }
                   } while (opcion_mascota!=0);
                   delay(10);
                    break;
                case 5: //ver personas sin mascota
                    limpiarConsola();
                    no_existe = true;
                    for (Persona aux_persona : personas) {
                        if (aux_persona.getPerro() == null) {
                            System.out.println(aux_persona.getNombre());
                            no_existe = false;
                        }
                    }
                    for (Perro aux_perro : perros) {
                         System.out.println(aux_perro.getNombre());
                        System.out.println(aux_perro);
                    }

                    delay(50);
                    break;
                case 6: // ver personas con mascota
                    limpiarConsola();
                    no_existe = true;
                    for (Persona aux_persona : personas) {
                        if (aux_persona.getPerro() != null) {
                            System.out.println(aux_persona.getNombre());
                            System.out.println(aux_persona.getPerro());
                            no_existe = false;
                        }
                    }
                    if (no_existe) {
                        System.err.println("Ninguna personas tiene mascota");
                    }
                    delay(10);
                    break;
                case 7: //adoptar
                    System.out.println("Linea 62 ");
                    System.out.println(" OPCION siete");
                    delay(10);
                    break;
                case 8: // devolver
                    System.out.println("Linea 67 ");
                    System.out.println(" OPCION ocuo");
                    delay(10);
                    break;
                case 0: // salir
                    limpiarConsola();
                    System.out.println("--------------------------------------");
                    System.err.println("------------ FIN PROGRAMA ------------");
                    System.out.println("--------------------------------------");
                    //System.err.println(personas);
                    //System.err.println(perros);
                    delay(10);
                    break;
            }
        }
    }

    public static void delay(int tiempo) {
        try {
            //System.out.println("delay");
            Thread.sleep(tiempo * 100);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void menu() { // menu principal
        limpiarConsola();
        System.out.println("-------------- Menu --------------");
        System.err.println("1 -  Personas Adopta / Devuelve ");
        System.out.println("2 -  Personas alta ");
        System.err.println("3 -  Mascota alta ");
        System.err.println("4 -  Mascota listar");// { op1: LISTAR mascotas sin adoptadar, y permitir elegir cual se adopta setear dueño con persona }
        System.out.println("0 -  SALIR ");
        System.out.println("-------------- oooo --------------");
    }

    public static void subMenuPersona() {
        limpiarConsola();
        System.out.println("---------- Menu PERSONA ----------");
        System.out.println("1 -  Adoptar mascota ");
        System.out.println("2 -  Devolver mascota ");
        System.out.println("0 -  Volver ");
        System.out.println("-------------- oooo --------------");

    }

    public static void subMenuMascota() {
        limpiarConsola();
        System.out.println("---------- Menu MASCOTA ----------");
        System.out.println("1 -  Listar mascotas adoptadas ");
        System.out.println("2 -  Listar mascotas sin adoptar ");
        System.out.println("3 -  Listar mascotas resumen "); // este da listado con status: adoptas y sin adoptar
        System.out.println("0 -  Volver ");
        System.out.println("-------------- oooo --------------");

    }


    public static int opcion(int min, int max) {
        int opcion;
        System.err.print("Ingrese opcion -> ");
        opcion = leer.nextInt();
        if (opcion > max || opcion < min) {
            System.err.println("Volviendo menu, vuelva a introducir OPCION");
            delay(10);
            opcion = 100;
        }
        return opcion;
    }

    public static void limpiarConsola() {
        try {
            Robot limpiar = new Robot();
            limpiar.keyPress(KeyEvent.VK_CONTROL);
            limpiar.keyPress(KeyEvent.VK_L);
            limpiar.keyRelease(KeyEvent.VK_CONTROL);
            limpiar.keyRelease(KeyEvent.VK_L);
        } catch (AWTException e) {
            System.out.println("Error al limpiar la pantalla" + e.getMessage());
        }
        // System.out.println("...");
        delay(1);

    }
}
