package AULA_03_26_01_26;

import java.util.Scanner;

public class Trocavalores {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numero1 = in.nextInt();

        System.out.println("Digite o segundo número:");
        int numero2 = in.nextInt();

        int aux;

        aux = numero1;
        numero1 = numero2;
        numero2 = aux;

        System.out.println("Variaveis trocadas");
        System.out.println("Numero 1 = " + numero1 + " | Numero 2 = " + numero2);

        in.close();
    }
}
