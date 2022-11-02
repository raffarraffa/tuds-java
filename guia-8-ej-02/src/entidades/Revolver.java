package entidades;

public class Revolver {

    private int posicion_actual;
    private int posicion_carga;

    public Revolver() {

    }

    public void cargarRevolver() {
        this.posicion_actual = (int) (Math.random() * 5);
        this.posicion_carga = (int) (Math.random() * 5);
    }

    public boolean mojar(int id) {
       
        return (id == posicion_carga);
    }

    public void siguienteChorro() {
    posicion_actual++; 
        if (posicion_actual == 6) { // posicion maxima 5
            posicion_actual = 0;
       }
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicion_actual=" + posicion_actual + ", posicion_carga=" + posicion_carga + '}';
    }

}
