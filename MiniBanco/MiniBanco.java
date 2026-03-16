package MiniBanco;

import java.util.Scanner;

public class MiniBanco {

    static void exibirMenu() {
    System.out.println("**********************");
    System.out.println("    Bem-vindo ao MiniBanco!    ");
    System.out.println("**********************");
    System.out.println("1 - Depositar");
    System.out.println("2 - Sacar");
    System.out.println("3 - Consultar Saldo");
    System.out.println("4 - Ver Extrato");
    System.out.println("5 - Sair");
    System.out.println("-----------------------");
    System.out.print("Escolha a sua opção: ");
    }
    
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

        while (opcao!=0)
        {
            exibirMenu();

            opcao=scanner.nextInt();

                if (opcao == 1) {
                    System.out.println(" Depositar - em breve");
                    System.out.println("-----------------------");
                }

                else if (opcao == 2) {
                    System.out.println(" Saca - em breve");
                    System.out.println("-----------------------");
                }

                else if (opcao == 3) {
                    System.out.println(" Consultar Saldo");
                    System.out.println("-----------------------");
                }

                else if (opcao == 4) {
                    System.out.println(" Extrato - em breve");
                    System.out.println("-----------------------");
                }

                else if (opcao == 5) {
                    System.out.println("Até logo," + nome + "!");
                    System.out.println("-----------------------");
                }

                else {
                    System.out.println("Opção inválida!");
                    System.out.println("-----------------------");
                }
        }

   
        scanner.close();
    }
}
