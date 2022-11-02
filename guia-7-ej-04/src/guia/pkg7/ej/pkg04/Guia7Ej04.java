/**
 * Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
 * Para esto, tendremos una clase Pelicula con el titulo, director y duración de la película (en horas).
 * Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo que se pide a continuación:
 * En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario todos sus datos y guardándolos en el objeto Pelicula.
 * Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere crear otra Pelicula o no.
 * Después de ese bucle realizaremos las siguientes acciones:
 * • Mostrar en pantalla todas las películas.*
 * • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.*
 * • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
 * • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
 * • Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
 * • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package guia.pkg7.ej.pkg04;
import guia.pkg7.ej.pkg04.entidades.Pelicula;
import java.util.*;

public class Guia7Ej04 {

    public static void main(String[] args) {
        String titulo , director;
        double duracion;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Pelicula> peliculas = new ArrayList();
// data debug
        Pelicula peli = new Pelicula("RAMBO", "STALLONE", 1.5);
        peliculas.add(peli);
        Pelicula peli1 = new Pelicula("RAMBO II", "STALLONE2", 0.85);
        peliculas.add(peli1);
        Pelicula peli2 = new Pelicula("ROKY", "STALLONE4", 0.40);
        peliculas.add(peli2);
        Pelicula peli3 = new Pelicula("ROKY II", "TALLONE1", 1.40);
        peliculas.add(peli3);
        Pelicula peli4 = new Pelicula("ROKY III", "LLONE", 1.59);
        peliculas.add(peli4);
       
 // fin data debug       
        
        do {
        System.out.print("Titulo de pelicula -> ");
        titulo = leer.next();
        System.out.print("Director -> ");
        director = leer.next();
        System.out.print("Duracion (horas ) -> ");
        duracion = leer.nextInt();
        System.out.print("Duracion (minutos ) -> ");
        duracion += (leer.nextDouble()/60);
        

        System.out.print("Quiere ingrear otra pelicula (S/N)");
        Pelicula peli_new = new Pelicula(titulo, director, duracion);
        peliculas.add(peli_new);
        } while (leer.next().equalsIgnoreCase("S"));
        for (int i = 0; i < peliculas.size(); i++) {
            System.out.println( peliculas.get(i).getTitulo() +" " + peliculas.get(i).getDirector() + " "+ peliculas.get(i).getDuracion()); 
        }

        
                System.out.println("");
        System.out.println("__________________ LISTADO FLTRADO MAYOR 1 hora ____________________");
        peliculas.stream().filter((pelicula) -> (pelicula.getDuracion() > 1)).forEachOrdered((pelicula) -> {
            
            System.out.println(pelicula);
        });
        
        for (Pelicula pelicula : peliculas) {
            
        }
        peliculas.sort(Pelicula.compararDuracionDesc);
        System.out.println("");
        System.out.println("__________________ LISTADO ORDENADO POR duracion DESC____________________");
        peliculas.forEach((pelicula) -> {
            System.out.println(pelicula);
        });
        peliculas.sort(Pelicula.compararDuracionAsc);
        System.out.println("");
        System.out.println("_________________ LISTADO ORDENADO duracion ASC________________________");
        peliculas.forEach((pelicula) -> {
            System.out.println(pelicula);
        });
        peliculas.sort(Pelicula.compararTituloDesc);
        System.out.println("");
        System.out.println("__________________ LISTADO ORDENADO Titulo DESC__________________________");
        peliculas.forEach((pelicula) -> {
            System.out.println(pelicula);
        });
        peliculas.sort(Pelicula.compararTituloAsc);
        System.out.println("");
        System.out.println("__________________ LISTADO ORDENADO Titulo ASC__________________________");
        peliculas.forEach((pelicula) -> {
            System.out.println(pelicula);
        });
        peliculas.sort(Pelicula.compararDirectorDesc);
        System.out.println("");
        System.out.println("__________________LISTADO ORDENADO Director DESC__________________________");
        peliculas.forEach((pelicula) -> {
            System.out.println(pelicula);
        });
        peliculas.sort(Pelicula.compararDirectorAsc);
        System.out.println("");
        System.out.println("__________________LISTADO ORDENADO Director ASC__________________________");
        peliculas.forEach((pelicula) -> {
            System.out.println(pelicula);
        });
    }
}
