package AULA_03_26_01_26;

import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int numero1 = in.nextInt();

        System.out.println("Digite o segundo numero:");
        int numero2 = in.nextInt();

        System.out.println("Soma = " + (numero1 + numero2));

        in.close();
    }
}
