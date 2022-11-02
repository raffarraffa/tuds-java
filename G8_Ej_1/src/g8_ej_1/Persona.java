package g8_ej_1;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String dni;
    private Perro perro = null;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro p) {
        this.perro = p;
    }

    /*   
    public void AdoptarPerro(ArrayList<Perro> perros){
        if (perro==null) {
            for (Perro aux : perros) {
                this.perro = aux;
            } 
        }
    }
     */
    
    public String personaYPerro() {
        return "• PERSONA:\nNombre: " + nombre + " | Apellido: " + apellido + " | Edad: " + edad + " años | DNI: " + dni + "\n ADOPTÓ A:\n" + perro.toString();
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Apellido: " + apellido + " | Edad: " + edad + " años | DNI: " + dni + "\n• ADOPTÓ A:\n" + perro.toString();
    }

}
