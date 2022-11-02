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
        ArrayList<Persona> personas = new ArrayList();
        ArrayList<Perro> perros = new ArrayList();
        boolean no_existe = false;
        for (int i = 1; i <= 10; i++) {

            Perro perro = new Perro("perro" + String.valueOf(i), "raza" + String.valueOf(i), i * 5, "tamaño" + String.valueOf(i), i * 2);
            perros.add(perro);
        }
        for (int i = 1; i <= 10; i++) {
            Persona persona = new Persona("persona  " + String.valueOf(i), "Apellido " + String.valueOf(i), (i * 14), String.valueOf((int) (Math.random() * 100000000 - 9999999) + 1));
            personas.add(persona);
        }
        int opcion = 100;
        while (opcion != 0) {
            //delay();
            limpiarConsola();
            menu();
            opcion = opcion();
            switch (opcion) {
                case 1: // ingresar mascota
                    limpiarConsola();
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
                case 2: // ingresar persona
                    limpiarConsola();
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
                    delay(100);
                    break;
                case 3: // ver mascotas sin adoptar
                    limpiarConsola();
                    for (Perro aux_perro : perros) {
                        no_existe = true;
                        if (aux_perro.getDuenio() == null) {
                            System.out.println(aux_perro.getNombre());
                            no_existe = false;
                        }
                        if (no_existe) {
                            System.err.println("No hay macotas sin adoptar");
                        }
                    }
                    delay(100);
                    break;

                case 4: // ver mascotas adoptadas
                    limpiarConsola();
                    for (Perro aux_perro : perros) {
                        no_existe = true;
                        if (aux_perro.getDuenio() != null) {
                            System.out.println(aux_perro.getNombre());
                            no_existe = false;
                        }
                    }
                    if (no_existe) {
                        System.err.println("No hay mascotas adoptadas");
                    }
                    delay(100);
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
                    if (no_existe) {
                        System.err.println("Todas 5las personas tiene mascota");
                    }
                    delay(
                            100);
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
                    delay(100);
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
                    delay(100);
                    break;
            }
        }
    }

    public static void delay(int tiempo) {
        try {
            //System.out.println("delay");
            Thread.sleep(tiempo * 10);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void menu() {
        limpiarConsola();
        System.out.println("---------- Menu MASCOTAS ----------");
        System.out.println("1 -  Ingresar Mascota ");
        System.out.println("2 -  Ingresar Persona ");
        System.out.println("3 -  Elegir mascotas sin adoptar ");
        System.out.println("4 -  Ver mascotas adoptadas ");
        System.out.println("5 -  Ver Personas sin mascota ");
        System.out.println("6 -  Ver personas con mascota ");
        System.out.println("7 -  ADOPTAR MASCOTA ");
        System.out.println("8 -  DEVOLVER MASCOTA ");
        System.out.println("0 -  Salir ");
        System.out.println("-------------- oooo --------------");
    }
    public static void menuPersona(){
        
    }

    public static int opcion() {
        int opcion;
        System.err.print("Ingrese opcion -> ");
        opcion = leer.nextInt();
        if (opcion > 8 || opcion < 0) {
            System.err.println("No existe la Opcion, vuelva a introducir OPCION");
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
