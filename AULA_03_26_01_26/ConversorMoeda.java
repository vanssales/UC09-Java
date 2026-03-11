package AULA_03_26_01_26;

import java.util.Scanner;

public class ConversorMoeda {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um valor em USD [use a vírgula]:");
        double valorDolar = in.nextDouble();

        System.out.println("Digite a taxa de cambio [use a vírgula]:");
        double taxaCambio = in.nextDouble();
        
        System.out.printf("Convertendo a moeda! = %.2f%n", valorDolar * taxaCambio);

        in.close();
    }
}
