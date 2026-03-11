package AULA_04_30_01_26;

import java.util.Locale;
import java.util.Scanner;

public class Areacirculo {

    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {

            in.useLocale(Locale.US); // aceita ponto

            System.out.print("Digite o diâmetro em metros: ");
            double diametro = in.nextDouble();

            //double pi = Math.PI;

            //double raio = diametro / 2;

            //double areaCirculo = pi * raio * raio; -> MODO NORMAL

            double areaCirculo = (Math.PI) * Math.pow((diametro / 2),2);

            System.out.printf("Área do círculo: %.2f metros quadrados%n", areaCirculo);

        }
    }
}
