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
    System.out.println("0 - Sair");
    System.out.println("-----------------------");
    System.out.print("Escolha a sua opção: ");
    }

    static double depositar(double saldo, double valor)
    {
        return saldo + valor;        
    }

    static void exibirSaldo(double saldo)
    {
        System.out.printf("Saldo atual: R$ %.2f\n", saldo);
    }

    static boolean valorEvalido(double valor)
    {
        return valor > 0;
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
                    //Implementar o deposito
                    System.out.println("-----------------------");
                    System.out.println("Valor a depositar: RS: ");
                    double valor = scanner.nextDouble();
                        if (!valorEvalido(valor)){
                            System.out.println("Atenção. Valor inválido! Valor deve ser maior que zero");
                            System.out.println("-----------------------");
                        }
                        else
                        {
                            saldo=depositar(saldo, valor);
                            exibirSaldo(saldo);
                            System.out.println(" Deposito realizado!");
                            System.out.println("-----------------------");
                        }
                  
                }

                else if (opcao == 2) {
                    System.out.println("-----------------------");
                    System.out.println(" Saca - em breve");
                    System.out.println("-----------------------");
                }

                else if (opcao == 3) {
                    System.out.println("-----------------------");
                    System.out.println(" Consultar Saldo");
                    System.out.println("-----------------------");
                }

                else if (opcao == 4) {
                    System.out.println("-----------------------");
                    System.out.println(" Extrato - em breve");
                    System.out.println("-----------------------");
                }

                else if (opcao == 0) {
                    System.out.println("-----------------------");
                    System.out.println("Até logo," + nome + "!");
                    System.out.println("-----------------------");
                }

                else {
                    System.out.println("-----------------------");
                    System.out.println("Opção inválida!");
                    System.out.println("-----------------------");
                }
        }

   
        scanner.close();
    }
}
