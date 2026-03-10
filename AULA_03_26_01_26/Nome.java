package AULA_03_26_01_26;

import java.util.Scanner;

public class Nome {

    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {

            System.out.print("Digite seu nome: ");
            String nome = in.nextLine();

            System.out.println("Olá " + nome);
        }
    }
}
