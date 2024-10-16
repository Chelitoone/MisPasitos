import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.text.NumberFormat;

public class Jardin {

    //Metodos a implementar en el codigo 
    
    public static double calcularDescuento(Niño niño) {
        double descuento = 0;
        if (niño.getNumeroHermanos() == 1) {
            descuento = 0.15;
        } else if (niño.getNumeroHermanos() >= 2 && niño.getNumeroHermanos() <= 4) {
            descuento = 0.05 * niño.getNumeroHermanos();
        }
        return descuento;
    }

    public static double calcularValorMatricula(int nivel, double descuento) {
        double valorBase = 0;
        switch (nivel) {
            case 1:
                valorBase = 4300000;
                break;
            case 2:
                valorBase = 3900000;
                break;
            case 3:
                valorBase = 3500000;
                break;
        }
        return (valorBase * (1 - descuento)) + 400000;
    }

    public static int asignarNivel(Niño niño, Nivel nivel1, Nivel nivel2, Nivel nivel3) {
        if (niño.getEdad() >= nivel1.getEdadMinima() && niño.getEdad() <= nivel1.getEdadMaxima()) {
            return 1;
        } else if (niño.getEdad() >= nivel2.getEdadMinima() && niño.getEdad() <= nivel2.getEdadMaxima()) {
            return 2;
        } else if (niño.getEdad() >= nivel3.getEdadMinima() && niño.getEdad() <= nivel3.getEdadMaxima()) {
            return 3;
        } else {
            // Caso en el que la edad no corresponde a ningún nivel
            System.out.println("La edad de " + niño.getNombre() + " no corresponde a ningún nivel.");
            return -1; 
        }
    }

    public static void main(String[] args) {
        
        ArrayList<Niño> niños = new ArrayList<>();

        // Crear niveles
        Nivel nivel1 = new Nivel(1, 2, 4300000);
        Nivel nivel2 = new Nivel(3, 4, 3900000);
        Nivel nivel3 = new Nivel(5, 5, 3500000);

        // Lista de estudiantes iniciales
        Niño mariana = new Niño("Mariana", 3, 2, 3);
        Niño pedrito = new Niño("Pedrito", 5, 3, 3);
        Niño sara = new Niño("Sara", 1, 1, 3);
        Niño miguel = new Niño("Miguel", 2, 1, 2);
        Niño jose = new Niño("José", 4, 2, 1);
        Niño lorena = new Niño("Lorena", 1, 1, 0);

        niños.add(mariana);
        niños.add(pedrito);
        niños.add(sara);
        niños.add(miguel);
        niños.add(jose);
        niños.add(lorena);

        

        for (Niño niño : niños) {
            int nivel = asignarNivel(niño, nivel1, nivel2, nivel3);
            double descuento = calcularDescuento(niño);
            double valorMatricula = calcularValorMatricula(nivel, descuento);
            niño.setValorMatricula(valorMatricula);

            JOptionPane.showMessageDialog(null, "El valor de la matrícula para " + niño.getNombre() + " es: $" + NumberFormat.getNumberInstance().format(valorMatricula));
        }

        String listaFinal = "Lista de niños matriculados:\n";
        for (Niño niño : niños) {
         listaFinal += niño.getNombre() + ": $" + NumberFormat.getNumberInstance().format(niño.getValorMatricula()) + "\n";
             }
        JOptionPane.showMessageDialog(null, listaFinal);

        }

 }