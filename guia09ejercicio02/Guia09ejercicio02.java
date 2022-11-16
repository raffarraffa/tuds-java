/**
 * @Override
    public Double precioFinal()
    {
     Double precioFinal = super.precioFinal();
     
     if (getCarga().doubleValue() > 30)
        { precioFinal = precioFinal.intValue() + 500.0; }
     
     //System.out.print("\n [Debug@Lavadora] Precio final seteado en $" + precioFinal.toString());
     
     return precioFinal;
    }
@Override
    public Double precioFinal()
    {
     Double precioFinal = super.precioFinal();
     
     if (getCarga().doubleValue() > 30)
        { precioFinal = precioFinal.intValue() + 500.0; }
     
     return precioFinal;
    }

 */
package guia09ejercicio02;

import guia09ejercicio02.entidades.Electrodomestico;
import guia09ejercicio02.entidades.Lavadora;
import guia09ejercicio02.entidades.Television;
import java.util.*;

public class Guia09ejercicio02 {
public static   Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
    ArrayList<Electrodomestico> electrodomesticos =new ArrayList();
    Lavadora lava1=new Lavadora();
    lava1.crearLavadora();
    electrodomesticos.add(lava1);
    Television tele1=new Television();
    tele1.crearTelevisor();
    electrodomesticos.add(tele1);
    System.out.println(electrodomesticos);
    }
}
