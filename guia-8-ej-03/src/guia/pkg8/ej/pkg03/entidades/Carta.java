/**
 *
 */
package guia.pkg8.ej.pkg03.entidades;

public class Carta {

    private String palo;
    private int numero;
    private boolean dada = false;

    public Carta() {
    }

    public Carta(String palo, int numero,boolean dada) {
        this.palo = palo;
        this.numero = numero;
        this.dada = dada;
    }
        public Carta(String palo, int numero) {
        this.palo = palo;
        this.numero = numero;
   }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isDada() {
        return dada;
    }

    public void setDada(boolean dada) {
        this.dada = dada;
    }

    @Override
    public String toString() {
        return " " + numero + " " + palo ;
    }

}
