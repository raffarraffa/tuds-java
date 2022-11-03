package entidades;

public class Revolver {

    private int posicion_actual;
    private int posicion_carga;

    public Revolver() {

    }

    public void cargarRevolver() {
        this.posicion_actual = (int) (Math.random() * 6);
        this.posicion_carga = (int) (Math.random() * 6);
    }

    public int getPosicion_actual() {
        return posicion_actual;
    }

    public int getPosicion_carga() {
        return posicion_carga;
    }

    public boolean mojar() {
        return (posicion_actual == posicion_carga);
    }

    public void siguienteChorro() {
        /*
        posicion_actual++;
        if (posicion_actual == 6) { // posicion maxima 5 (de 0 a 5)
            posicion_actual = 0;
        }
         */
        posicion_actual = (int) (Math.random() * 6);
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicion_actual=" + posicion_actual + ", posicion_carga=" + posicion_carga + '}';
    }

}
