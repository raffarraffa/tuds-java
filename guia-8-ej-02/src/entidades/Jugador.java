package entidades;

public class Jugador {

    private int id;
    private String nombre;
    private boolean mojado = false;

    public Jugador() {
    }

    public Jugador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean disparoRevolver(Revolver revolver) {

        if (revolver.mojar(id)) {
            mojado = true;
        } else {
            revolver.siguienteChorro();
        }
        return mojado;
    }

    @Override
    public String toString() {
        return "\nJugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }

}
