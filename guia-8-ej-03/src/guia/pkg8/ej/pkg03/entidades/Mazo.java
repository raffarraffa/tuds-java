package guia.pkg8.ej.pkg03.entidades;

import java.util.ArrayList;
import java.util.Collections;

public class Mazo {

    private final ArrayList<Carta> cartas = new ArrayList();
    private int dadas = 0;

    public Mazo() {
    }

    public void crearMazo() {

        for (int i = 1; i <= 12; i++) {
            if (!(i == 8 || i == 9)) {

                Carta aux_carta_oro = new Carta("ORO", i);
                Carta aux_carta_copa = new Carta("COPA", i);
                Carta aux_carta_basto = new Carta("BASTO", i);
                Carta aux_carta_espada = new Carta("ESPADA", i);
                cartas.add(aux_carta_oro);
                cartas.add(aux_carta_copa);
                cartas.add(aux_carta_basto);
                cartas.add(aux_carta_espada);

            }
        }
    }

    public boolean barajarMazo() {
        Collections.shuffle(cartas);
        return true;
    }

    public void siguienteCarta() {
        Carta carta;
        if (dadas >= 40) {
            System.out.println("No hay mas cartas");
        } else {
            System.out.println(cartas.get(dadas));
            dadas++;
        }
    }

    public void siguienteCarta2() {
        Carta carta;
        if (dadas == 39) {
            System.out.println("No hay mas cartas");
        } else {
            for (Carta carta1 : cartas) {
                if (!carta1.isDada()) {
                    // carta1.setDada(true);
                    System.out.println(carta1);
                    carta1.setDada(true);
                    dadas++;
                    break;
                }
            }
        }
//        return carta;
    }

    public int cartasDisponibles() {
        //  System.out.println(40 - dadas);
        return (40 - dadas);
    }

    public void darCartas(int cantidad, int disponibles) {
        //if (cantidad <= dadas) {
        int limit = dadas + cantidad;
       
        if (limit <= 40) {
            for (int i = dadas; i < limit; i++) {
                System.out.println(cartas.get(i));
            }
            dadas = dadas + cantidad;
        } else {

            System.out.println("No alcanzan para dar todas las cartas solcitadas.");
            System.out.println("Quedan " + (40 - dadas) + " cartas en el mazo");
        }
        System.out.println("Cartas dadas " + dadas);
    }

    public void cartasMonton() {
        if(dadas >0){ 
        for (int i = 0; i < dadas; i++) {
            System.out.println(cartas.get(i));
        }
        }else{
            System.out.println("No se direron cartas");
        }
    }

    public void mostrarMazo() {
        int cartas_mazo = 40 - dadas ;
        if (dadas < 40) {
            
            for (int i = dadas; i < 40; i++) {
                System.out.print(cartas.get(i));
                if((i+1) % 5 == 0 && i > 0){
                    System.out.println("");
                }
            }
        }
        System.out.println("");
    }

//siguienteCarta(): devuelve la siguiente carta que está en la baraja,
//cuando no haya más o se haya llegado al final, se indica al usuario que no hay más cartas.

    /*@Override
    public String toString() {
        return "Mazo:" + cartas;
    }
     */
    @Override
    public String toString() {
        return "Mazo{" + "cartas=" + cartas + ", dadas=" + dadas + '}';
    }
}
