package guia.pkg7.ej.pkg04.entidades;

import java.util.*;

public class Pelicula {

    private String titulo;
    private String director;
    private Double duracion; // en horas

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion ;
    }

    public String getTitulo() {
        return titulo;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula:" + "titulo: " + titulo + ", director: " + director + ", duracion: " + ( horasMinutos(duracion));
    }

    public String horasMinutos(double time) {
        String duracion = "";
        int hora, minuto;
        hora = (int) (time);
        minuto = (int) ((time - hora) * 60);
        duracion += String.valueOf(hora) + " hora y " + minuto + " minutos";
        return duracion;
    }
    public static Comparator<Pelicula> compararDuracionDesc = (Pelicula peli1, Pelicula peli2) -> peli2.getDuracion().compareTo(peli1.getDuracion());
    public static Comparator<Pelicula> compararDuracionAsc = (Pelicula peli1, Pelicula peli2) -> peli1.getDuracion().compareTo(peli2.getDuracion());
    public static Comparator<Pelicula> compararTituloDesc = (Pelicula peli1, Pelicula peli2) -> peli2.getTitulo().compareTo(peli1.getTitulo());
    public static Comparator<Pelicula> compararTituloAsc = (Pelicula peli1, Pelicula peli2) -> peli1.getTitulo().compareTo(peli2.getTitulo());
    public static Comparator<Pelicula> compararDirectorDesc = (Pelicula peli1, Pelicula peli2) -> peli2.getDirector().compareTo(peli1.getDirector());
    public static Comparator<Pelicula> compararDirectorAsc = (Pelicula peli1, Pelicula peli2) -> peli1.getDirector().compareTo(peli2.getDirector());
}
