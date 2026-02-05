package AULA_05_02_02_26;

import java.util.Scanner;

public class ImparPar {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = in.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par!");
        } else {
            System.out.println("O número é ímpar!");
        }

        in.close();
    }
}
