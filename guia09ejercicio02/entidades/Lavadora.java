package guia09ejercicio02.entidades;

import static guia09ejercicio02.Guia09ejercicio02.leer;

public class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora() {
        type="lavadora";
    }

    public Lavadora(int carga, double precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
        super.crearElectrodomestico();
        type = "lavadora";
        System.out.print("Ingrese capacidad de lavadora ->");
        carga = leer.nextInt();
        precioFinal();
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (carga > 30) {
            this.precio +=500;
        }
        
    }
    @Override
    public String toString() {
//        return "Electrodomestico{  precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + ", type=" + type + '}';
return "\n{ \"tipo\":\"" + type + "\",\"" + "precio\":\"" + precio + "\",\"color\":\"" + color + "\",\"capacidad\":\"" + carga + "\",\"consumo\":\"" + consumo + "\",\"peso\":\"" + peso + "\"}\n";
    }
}
