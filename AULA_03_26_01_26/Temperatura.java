package AULA_03_26_01_26;

import java.util.Locale;
import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US); // força uso do ponto

        System.out.println("Digite a temperatura em Celsius:");
        double celsius = in.nextDouble();

        System.out.println("Temperatura: " + celsius + " °C");

        in.close();
    }
}