/**
 * Realizar una baraja de cartas españolas orientada a objetos.
 * Una carta tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas).
 * Esta clase debe contener un método toString() que retorne el número de carta y el palo. La
 * baraja estará compuesta por un conjunto de cartas, 40 exactamente.
 * Las operaciones que podrá realizar la baraja son:
 * • barajar(): cambia de posición todas las cartas aleatoriamente.
 * • siguienteCarta(): devuelve la siguiente carta que está en la baraja,
 * cuando no haya más o se haya llegado al final, se indica al usuario que no hay más cartas.
 * • cartasDisponibles(): indica el número de cartas que aún se puede repartir.
 * • darCartas(): dado un número de cartas que nos pidan,le devolveremos ese número de cartas.
 * En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero debemos indicárselo al usuario.
 * • cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna indicárselo al usuario
 * • mostrarBaraja(): muestra todas las cartas hasta el final.
 * Es decir, si se saca una carta y luego se llama al método, este no mostrara esa primera carta.
 */
package guia.pkg8.ej.pkg03;

import guia.pkg8.ej.pkg03.entidades.Mazo;
import javax.swing.JOptionPane;

public class Guia8Ej03 {

    public static void main(String[] args) {
        int opcion, cantidad;
        Mazo mazo = new Mazo();
        mazo.crearMazo();
        mazo.barajarMazo();
        do {
            opcion = menu();
            switch (opcion) {
                case 0: // siguiente carta

                    mazo.siguienteCarta();
                    break;
                case 1: // dar cantidad cartas
                    System.out.println("------------------------------------------------------");
                    cantidad = menuDar();
                    mazo.darCartas(cantidad, mazo.cartasDisponibles());

                    break;
                case 2: // disponibles 
                    System.out.println("------------------------------------------------------");
                    cantidad = mazo.cartasDisponibles();
                    System.out.println("Quedan disponibles " + cantidad + " cartas");
                    break;
                case 3: // cartas monton
                    System.out.println("------------------------------------------------------");
                    mazo.cartasMonton();
                    break;
                case 4: // muetra mazo
                    System.out.println("------------------------------------------------------");
                    mazo.mostrarMazo();
                    break;
            }
        } while (opcion != 5);
    }

    static public int menu() {
        String[] botones = {"Siguiente Carta", "Dar Cartas ", "Nº Cartas Disponibles", "Cartas dadas ", "Mostrar mazo", "Salir"};
        int opcion = JOptionPane.showOptionDialog(null,
                "ELIJA una opcion:",
                "TUDS guia 8 ejercicio 3",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,
                botones, null);
        return opcion;
    }

    static public int menu2() {
        String[] botones = {"Siguiente Carta", "Dar Cartas ", "Nº Cartas Disponibles", "Cartas dadas ", "Mostrar mazo", "Salir"};
        int opcion = JOptionPane.showOptionDialog(null,
                "ELIJA una opcion:",
                "TUDS guia 8 ejercicio 3",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,
                botones, null);
        return opcion;
    }

    static public int menuDar() {
        int opcion = Integer.valueOf(JOptionPane.showInputDialog("Ingrese cantidad cartas:"));
        return opcion;
    }

}
