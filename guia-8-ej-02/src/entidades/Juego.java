package entidades;

import java.util.ArrayList;

public class Juego {

    private ArrayList<Jugador> jugadores = new ArrayList();
    private Revolver revolver = new Revolver();
    private boolean fin_juego = false;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    /* este metodo es al pedo, los de EGG son insufribles aguanten los propfes JUAN y CRISTINA */
    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver revolver) {
        
        this.jugadores = jugadores;
        this.revolver = revolver;
    }
/*ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y aprieta el gatillo. 
 * Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se moja, se pasa al siguiente jugador hasta que uno se moje.
 * Si o si alguien se tiene que mojar. 
 * Al final del juego, se debe mostrar que jugador se mojó.
 * Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego
*/
    public boolean rondaJuego() {
        fin_juego = true;
        
        do {
            for (Jugador jugador : jugadores) {
                jugador.disparoRevolver(revolver);
            }
            
        } while (!fin_juego);
        
        return fin_juego;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + "\n revolver=" + revolver + "\n fin_juego=" + fin_juego + '}';
    }

}
