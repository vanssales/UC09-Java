import java.util.Scanner;

public class Tarefaconverter {

    // Scanner global
    static Scanner leianum = new Scanner(System.in);

    public static void receberCentimetros() {
        System.out.println("Informe o valor em centímetros:");
        valorCentimetros = leianum.nextDouble();
    }

    public static void calcularPolegadas() {
        quantidadePolegadas = valorCentimetros / CM_PARA_POLEGADAS;
        System.out.printf("%10.2f cm correspondem a %.2f polegadas\n",valorCentimetros, quantidadePolegadas);
    }

    public static void calcularPes() {
        quantidadePes = quantidadePolegadas / POL_PARA_PES;
        System.out.printf("%10.2f polegadas correspondem a %.2f pés\n",quantidadePolegadas, quantidadePes);
    }

    static final double CM_PARA_POLEGADAS = 2.54;
    static final double POL_PARA_PES = 12.0;

    static double valorCentimetros;
    static double quantidadePolegadas;
    static double quantidadePes;

    public static void main(String[] args) {

        receberCentimetros();
        calcularPolegadas();
        calcularPes();

        leianum.close();   // fechar leianum
    }
}

