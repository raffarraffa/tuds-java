package guia09ejercicio03.entidades;

import static guia09ejercicio03.Guia09ejercicio03.leer;

public class Television extends Electrodomestico {

    private int resolucion;
    private boolean sintonizador;

    public Television() {
        type="televisor";
    }

    public Television(int resolucion, double precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
    }

    public int getCarga() {
        return resolucion;
    }

    public void setCarga(int resolucion) {
        this.resolucion = resolucion;
    }

    public void crearTelevisor() {
        super.crearElectrodomestico();
        boolean aux = true;
        String tdt = "";
        type = "televisor";
        System.out.print("Ingrese resolucion televisor ->");
        resolucion = leer.nextInt();
        do {
            System.out.print("Ingrese Sintonizador TDT (S/N) ->");
            tdt = leer.next().toLowerCase();
            switch (tdt) {
                case "s":
                    sintonizador = true;
                    aux = false;
                    break;
                case "n":
                    sintonizador = true;
                    aux = false;
                    break;
                default:
                    System.out.println("Valor fuera de rango, ingrese 'S /N");
                    
            }
        } while (aux);
        precioFinal();
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (resolucion > 40) {
            this.precio = precio*1.3;
        }
        if(sintonizador){
            this.precio +=500;
        }

    }
    @Override
    public String toString() {
//        return "Electrodomestico{  precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + ", type=" + type + '}';
return "\n{ \"tipo\":\"" + type + "\",\"" + "precio\":\"" + precio + "\",\"color\":\"" + color + "\",\"sintonizador\":\"" + sintonizador + "\",\"consumo\":\"" + consumo + "\",\"peso\":\"" + peso + "\"}\n";
    }
}
