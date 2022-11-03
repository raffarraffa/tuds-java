/**
 * Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de un número de jugadores, que, con un revolver de agua, el cual posee una sola
 * carga de agua, se dispara y se moja. Las clases a hacer del juego son las siguientes:
 * Clase Revolver de agua: esta clase posee los siguientes atributos:
 * _. posición actual  * (posición del tambor que se dispara, puede que esté el agua o no)
 * _. posición agua (la posición del tambor donde se encuentra el agua). Estas dos posiciones, se generarán
 * aleatoriamente.
 * Métodos:
 * • llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los
 * valores deben ser aleatorios.
 * • mojar(): devuelve true si la posición del agua coincide con la posición actual
 * • siguienteChorro(): cambia a la siguiente posición del tambor
 * • toString(): muestra información del revolver (posición actual y donde está el agua)
 * Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
 * jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado
 * (indica si está mojado o no el jugador). El número de jugadores será decidido por el
 * usuario, pero debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
 * Métodos:
 * • disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
 * mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
 * revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
 * devuelve true, sino false.
 * Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de
 * Jugadores) y Revolver
 * Métodos:
 * • llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores y el revolver para guardarlos en los atributos del juego. • ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó. Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego
 */
package guia.pkg8.ej.pkg02;

import entidades.*;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.*;

/**
 *
 * @author User
 */
public class Guia8Ej02 {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

  /*      
System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW0odKWWWWWWWWWWWWWWWWWWWW");
System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWXx,..:ONWWWWWWWWWWWWWWWWWW");
System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWKdc;:llc;oXWWWWWWWWWWWWWWWWW");
System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWX0ocool:'..'oXWWWWWWWWWWWWWWWW");
System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNKkxdoc:'.',''.cKWWWWWWWWWWWWWWWW");
System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNKkxxoc;..',,'';oONWWWWWWWWWWWWWWWWW");
System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNXXKkdxdc;..',,'':d0NWWWWWWWWWWWWWWWWWWWW");
System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWN0xddxdol;..',,'':d0NWWWWWWWWWWWWWWWWWWWWWWW");
System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNKOxoool::;..',''':dKNWWWWWWWMMWWWWWWWWWWWWWWWWW");
System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWWNKkl,..;l:;:c:;,',cxKNWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
System.out.println("WWWWWWWWWWWWWWWWWWWWWWWNXKKkl,.  .. .dXNNO;;xKWWWWWMWWWWWWWWWWWWWWWWWWWWWWWWWWW");
System.out.println("WWWWWWWWWWWWWWWWWWWWW0oloc,. ..'.....cxlcc:dNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
System.out.println("WWWWWWWWWWWWWWWWWWWWWOcxXc 'o0Oc. ...',;coddKWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
System.out.println("WWWWWWWWWWWWWWWWWWWWWXokWx':kd;..','..cOKXNkl0WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
System.out.println("WWWWWWWWWWWWWWWWWNOxd:.dWNx' .'::;,;d0NNXOlco0WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
System.out.println("WWWWWWWWWWWWWWWWWXkxkccKMMW0l::;cdO0xdxl;;dXWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
System.out.println("WWWWWWWWWWWWWWWWWWWMOckWMMMMMNKKKx;'cxkdll0WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
System.out.println("WWWWWWWWWWWWWWWWWWXd. :XMMMMMMWO;. .kMMMW0kXWWWWMWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
System.out.println("WWWWWWWWWWWWWWWWWWO,   ;kKKOdlc,;xxcck000xxNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
System.out.println("WWWWWWWWWWWWWWWWWWNk.    ..     ,0WNOdlclxXWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
System.out.println("WWWWWWWWWWWWWWWWWWWNc            :kOOkOKNWWWWMWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
System.out.println("WWWWWWWWWWWWWWWWWWWWo         .,oOXKKNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
System.out.println("WWWWWWWWWWWWWWWWWWWWo        .oNWWWWWWWWWWWWWMWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
System.out.println("WWWWWWWWWWWWWWWWWWWWd         ;kXWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
System.out.println("WWWWWWWWWWWWWWWWWWWMk.         .xWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
System.out.println("WWWWWWWWWWWWWWWWMWWWK;          :ONWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
System.out.println("WWWWWWWWWWWWWWWWWWWWWo.          'OWWWMWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
System.out.println("WWWWWWWWWWWWWWWWWWWWWK;          .OWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
System.out.println("WWWWWWWWWWWWWWWWWMWWWWO.         ;0WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
System.out.println("WWWWWWWWWWWWWWWWWWWWWWNl      .;xXWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
System.out.println("WWWWWWWWWWWWWWWWWWWWWWW0;..,cd0NWWWWWMWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWX0KNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
*/

        // variables entorno
        ArrayList<Jugador> jugadores = new ArrayList();
        Juego game = new Juego();
        Revolver revolver = new Revolver();
        revolver.cargarRevolver();
        //        int cant_jugadores;
// debug
        ArrayList<String> aux_jug = new ArrayList();
        aux_jug.add("Rafa");
        aux_jug.add("Leo");
        aux_jug.add("Mari");
        aux_jug.add("Pablo");
        aux_jug.add("Natalia");
        aux_jug.add("Juana");
        for (int i = 0; i < aux_jug.size(); i++) {
            Jugador jugador = new Jugador();
            jugador.setId(i);
            jugador.setNombre(aux_jug.get(i));
            jugadores.add(jugador);
        }
        game.llenarJuego(jugadores, revolver);
     //   System.out.println(game);
        game.rondaJuego();
     //   System.out.println(game);
        
        //System.out.print("Cantidad jugadores maxima alcanzada \n juegan 6 jugadores");
        // logica

        /* cant_jugadores = leer.nextInt();
                System.out.print("Ingrese cantidad jugadores (1 - 6)-> ");
        if (cant_jugadores > 6) {
                System.out.print("Cantidad jugadores maxima alcanzada \n juegan 6 jugadores");
            cant_jugadores = 6;
        }
        
        for (int i = 0; i < cant_jugadores; i++) {
            Jugador jugador = new Jugador();
            jugador.setId(i);
            System.out.print("Ingrese nombre");
            jugador.setNombre(leer.next());
            jugadores.add(jugador);
        }
         */
        // inicalizamos juego
     


        /*    
        int opcion_menu = 100;
        Revolver revolver = new Revolver();
        revolver.cargarRevolver();
        System.out.println(revolver);
        revolver.cargarRevolver();
        System.out.println(revolver.mojar());
        System.out.println(revolver);
        limpiarConsola();
        System.out.println("");
        do {
            limpiarConsola();
            menu();
            opcion_menu = opcion(0, 2);
            System.err.println(opcion_menu);
        } while (opcion_menu == 100);
    }

    public static void menu() {
        System.out.println("----------------------0 MENU RULETA RUSA 0---------------");
        System.out.println("1.-  Iniciar Juego ");
        System.out.println("2.-  Volver a jugar ");
        System.out.println("0.-  Salir Juego");
    }

    public static int opcion(int min, int max) {
        int opcion;
        System.err.print("Ingrese opcion -> ");
        opcion = leer.nextInt();
        if (opcion > max || opcion < min) {
            System.err.println("ERROR Ingrese valor entre " + min + " - " + max + "   vuelva a introducir OPCION");
            delay(3);
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

    public static void delay(int tiempo) {
        try {
            //System.out.println("delay");
            Thread.sleep(tiempo * 1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
         */
    }
}

