package AULA_01;

import java.util.Scanner;

public class eEntrada {
    public static void main(String[] args) {

        String line;

        // Declaração de um Scanner
        Scanner in = new Scanner(System.in);

        System.out.println("Digite alguma coisa:");
        line = in.nextLine();

        System.out.println("Você disse: " + line);

        in.close();
    }
}
