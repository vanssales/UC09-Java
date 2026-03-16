package MiniBanco;

import java.util.Scanner;

public class MiniBanco {

    public static void main(String[] args) {
        System.out.println("MiniBanco iniciado!");
        Scanner scanner = new Scanner(System.in);

        // Variáveis principais da conta
        double saldo = 0.0;
        int opcao = -1;

        // Entrada do nome do usuário
        System.out.print("Digite seu nome: ");
        String nome = scanner.next();

        // Saída formatada usando printf
        System.out.printf("Olá, %s! Seu saldo atual é R$ %.2f%n", nome, saldo);

        scanner.close();
    }
}
