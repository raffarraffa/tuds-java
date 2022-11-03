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
        // variables entorno
        ArrayList<Jugador> jugadores = new ArrayList();
        Juego game = new Juego();
        Revolver revolver = new Revolver();
        revolver.cargarRevolver();
        int cant_jugadores;
        // logica
        cant_jugadores = leer.nextInt();
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
        game.llenarJuego(jugadores, revolver);
        game.rondaJuego();
    }
}
