package AULA_03_26_01_26;

import java.util.Scanner;

public class SaudacaoPersonalizada {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = in.nextLine();

        // Chama o método de saudação
        saudacao(nome);

        in.close();
    }

    // Método de saudação personalizada
    public static void saudacao(String nome) {
        System.out.println("Olá, " + nome + "! Seja bem-vindo(a)!");
    }
}
