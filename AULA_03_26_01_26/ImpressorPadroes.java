// 24 - Repetidor de String
package AULA_03_26_01_26;

import java.util.Scanner;

public class ImpressorPadroes {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("-----------------------------------------");

        // Imprimindo Triangulo
        System.out.println("-----------------------------------------");
        System.out.println("\n Triângulo de estrelas:");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Imprimindo Retangulo
        System.out.println("-----------------------------------------");
        System.out.println("\n Retângulo vazado de estrelas:");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {

                if (i == 1 || i == 5 || j == 1 || j == 10) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        } // <-- CHAVE QUE FALTAVA

        in.close();
    }
}