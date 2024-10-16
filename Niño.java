public class Niño {
    
    String nombre;
    int edad;
    int nivel;
    int numeroHermanos; 
    double valorMatricula;

    //Getters and Setters 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getNumeroHermanos() {
        return numeroHermanos;
    }

    public void setNumeroHermanos(int numeroHermanos) {
        this.numeroHermanos = numeroHermanos;
    }

    public double getValorMatricula() {
        return valorMatricula;
    }

    public void setValorMatricula(double valorMatricula) {
        this.valorMatricula = valorMatricula;
    }

    //Contructor 
    public Niño(String nombre, int edad, int nivel, int numeroHermanos) {
        this.nombre = nombre;
        this.edad = edad;
        this.nivel = nivel;
        this.numeroHermanos = numeroHermanos;
    }

}
