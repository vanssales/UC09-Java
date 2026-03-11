package AULA_03_26_01_26;

import java.util.Scanner;

public class AuxiliarGeometria {

    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {

            System.out.print("Digite o raio em metros (use vírgula): ");
            double raio = in.nextDouble();

            double circunferencia = 2 * (Math.PI) * raio;
            double areaCirculo = (Math.PI) * Math.pow(raio,2);
           
            System.out.printf("Circunferência do círculo: %.2f metros %n", circunferencia);
            System.out.printf("Área do círculo: %.2f metros quadrados%n", areaCirculo);

        }
    }
}
