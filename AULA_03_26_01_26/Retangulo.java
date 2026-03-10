package AULA_03_26_01_26;

import java.util.Locale;
import java.util.Scanner;

public class Retangulo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);

        System.out.println("Digite o comprimento do retângulo:");
        double comprimento = in.nextDouble();

        System.out.println("Digite a largura do retângulo:");
        double largura = in.nextDouble();

        double area = comprimento * largura;

        System.out.println("Area do Retangulo = " + area);

        in.close();
    }
}
