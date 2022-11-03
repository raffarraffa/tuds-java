package entidades;

import java.util.ArrayList;

public class Juego {

    private ArrayList<Jugador> jugadores = new ArrayList();
    private Revolver revolver = new Revolver();
    private boolean fin_juego = false;

    public Juego() {
    }

    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public void rondaJuego() {
        fin_juego = true;
        int ronda = 1;
        do {
            System.out.println("------- Ronda " + ronda + " -------");
            for (Jugador jugador : jugadores) {
                jugador.disparoRevolver(revolver);
                System.out.print("Jugador  " + jugador.getNombre());
                if (jugador.isMojado()) {
                    System.out.println(" mojado");
                    System.out.println("---- FIN DEL JUEGO ----");
                    fin_juego = false;
                    break;
                }
                System.out.println(" ZAFASTE");
            }
            ronda++;
        } while (fin_juego);
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores= " + jugadores + "\n revolver=" + revolver + "\n fin_juego=" + fin_juego + '}';
    }

}
