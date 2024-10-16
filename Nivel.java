public class Nivel {

     int edadMinima;
     int edadMaxima;
     double valorBaseMatricula;


    //Getters and Setters 
    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public int getEdadMaxima() {
        return edadMaxima;
    }

    public void setEdadMaxima(int edadMaxima) {
        this.edadMaxima = edadMaxima;
    }

    public double getValorBaseMatricula() {
        return valorBaseMatricula;
    }

    public void setValorBaseMatricula(double valorBaseMatricula) {
        this.valorBaseMatricula = valorBaseMatricula;
    }

    // Constructor
    public Nivel(int edadMinima, int edadMaxima, double valorBaseMatricula) {
        this.edadMinima = edadMinima;
        this.edadMaxima = edadMaxima;
        this.valorBaseMatricula = valorBaseMatricula;
    }



    
}