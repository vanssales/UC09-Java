package AULA_05_02_02_26;

import java.util.Scanner;

public class Switchcomando {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um numero:");
        char numero = in.next().charAt(0);

        switch (numero) {

            case '1':
                System.out.println("1");
                break;

            case '2':
                System.out.println("2");
                break;

            case '3':
                System.out.println("3");
                break;

            default:
                System.out.println("Qualquer número diferente de 1, 2 ou 3");
        }

        in.close();
    }
}
