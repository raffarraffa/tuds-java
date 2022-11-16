package guia09ejercicio02.entidades;

import static guia09ejercicio02.Guia09ejercicio02.leer;
import java.util.*;

public class Electrodomestico {

    private final int PRECIO_INICIAL  = 1000;
    protected double precio;
    protected String color;
    protected char consumo;
    protected double peso;
    protected String type;
    public static List<String> colores = Arrays.asList("azul", "blanco", "gris", "negro", "rojo");

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumo, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private char comprobarConsumoEnergetico(char consumo) {
        consumo = Character.toLowerCase(consumo);
        if (consumo >= 'a' && consumo < 'f') {
            return consumo;
        }
        return 'f';
    }

    private String comprobarColor(String color) {
        color = color.toLowerCase();
        if (colores.contains(color)) {
            return color;
        } else {
            return "blanco";
        }
    }
//    private double  preciofinal(double precio, double peso, char consumo )

    public void precioFinal() {

        switch (consumo) {
            case 'a':
                precio += 1000;
                break;
            case 'b':
                precio += 800;
                break;
            case 'c':
                precio += 600;
                break;
            case 'd':
                precio += 500;
                break;
            case 'e':
                precio += 300;
                break;
            case 'f':
                precio += 100;
                break;
            default:
        }

        if (peso >= 1 && peso < 20) {
            precio += 100;
        } else if (peso >= 20 && peso < 50) {
            precio += 500;
        } else if (peso >= 50 && peso < 80) {
            precio += 800;
        } else {
            precio += 1000;

        }
        this.precio = precio;
    }

    public void crearElectrodomestico() {
        System.out.println("-------------* ELECTRODOMESTICO " +type.toUpperCase()+"  *------------");
        System.out.print("Ingrese peso " + type + " -> ");
        this.peso = leer.nextDouble();
        System.out.print("Ingrese color " + type + " -> ");
        this.color = comprobarColor(leer.next());
        System.out.print("Ingrese consumo " + type + " -> ");
        this.consumo = comprobarConsumoEnergetico(leer.next().charAt(0));
        this.precio = PRECIO_INICIAL;
    }

    @Override
    public String toString() {
//        return "Electrodomestico{  precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + ", type=" + type + '}';
        return "\n{ \"tipo\":\"" + type + "\",\"" + "precio\":\"" + precio + "\",\"color\":\"" + color + "\",\"consumo\":\"" + consumo + "\",\"peso\":\"" + peso + "\"}\n";
    }

}
