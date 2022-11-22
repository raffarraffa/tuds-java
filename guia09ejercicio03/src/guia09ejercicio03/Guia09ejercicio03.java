package guia09ejercicio03;
/* 
	esto esta editado ahora 22/11/2022 19:44
*/

import guia09ejercicio03.entidades.Electrodomestico;
import guia09ejercicio03.entidades.Lavadora;
import guia09ejercicio03.entidades.Television;
import java.util.*;

public class Guia09ejercicio03 {
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
