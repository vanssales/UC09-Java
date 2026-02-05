package AULA_01;

import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {

        String nome;
        String sobrenome;

        // Declaração de um Scanner
        Scanner in = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        nome = in.nextLine();
        nome = nome.toUpperCase();

        System.out.println("Digite seu sobrenome:");
        sobrenome = in.nextLine();
        sobrenome = sobrenome.toUpperCase();

        System.out.println(nome+" "+sobrenome);

        in.close();
    }
}
