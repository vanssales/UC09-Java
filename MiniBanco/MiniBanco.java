package MiniBanco;

import java.util.Scanner;

public class MiniBanco {

    static final double LIMITE_SAQUE = 1000.00;
    static final double TAXA_SAQUE = 0.02;

    static double calcularTotalSaque(double valor){
        return valor = (valor + TAXA_SAQUE);
    }

    static boolean dentroDoLimite(double valor){
        return valor <= LIMITE_SAQUE;

    }

    static boolean saldoSuficiente(double saldo, double valor)
    {
        return saldo >= calcularTotalSaque(valor);
    }

    static double sacar(double saldo, double valor)
    {
        return saldo - calcularTotalSaque(valor);
    }

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
    
    static void exibirExtrato(String[] extrato, int totalLinhas)
    {
        System.out.println("\n ----------------Extrato-----------------");

        if (totalLinhas==0)
        {
            System.out.println("Nenhuma movimentação!");
        }
        else
        {

            for(int i=0; i<totalLinhas; i++)
            {
                System.out.println(""+ extrato[i]);

            }

        }
        System.out.println("-------------------------------------------");

    }


    static int registrar(String[] extrato, int totalLinhas, String linha)
    {
        extrato[totalLinhas] = linha;
        return totalLinhas + 1;
    }
    

    public static void main(String[] args) {
        System.out.println("MiniBanco iniciado!");
        Scanner scanner = new Scanner(System.in);

        //variáveis de extrato
        String[] extrato = new String[50];
        int totalLinhas = 0; 

        // Variáveis principais da conta
        double saldo = 0.0;
        int opcao = -1;

        // Entrada do nome do usuário
        System.out.print("Digite seu nome: ");
        //String nome = scanner.next();
        String nome = scanner.nextLine();

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
                        if (!valorEvalido(valor))
                        {
                            System.out.println("Atenção. Valor inválido! Valor deve ser maior que zero");
                            System.out.println("-----------------------");
                        }
                        else
                        {
                            saldo=depositar(saldo, valor);
                            exibirSaldo(saldo);
                            System.out.println(" Deposito realizado!");
                            System.out.println("-----------------------");
                            totalLinhas = registrar(extrato, totalLinhas, String.format("DEPÓSITO + R$ %.2f => Saldo R$ %.2f", valor, saldo));
                        }
                  
                }

                else if (opcao == 2) 
                {
                    System.out.println("Valor a sacar: R$: ");
                    double valorSaque = scanner.nextDouble();

                    if (!valorEvalido(valorSaque)) {
                        System.out.println("Atenção. Valor inválido! Valor deve ser maior que zero");
                        System.out.println("-----------------------");
                    }

                    else if (!dentroDoLimite(valorSaque)) {
                        System.out.printf("Limite excedido. Máximo R$ %.2f%n", LIMITE_SAQUE);
                        System.out.println("-----------------------");
                    }

                    else if (!saldoSuficiente(saldo, valorSaque)) {
                        System.out.println("Atenção. Saldo insuficiente");
                        System.out.println("-----------------------");
                    }

                    else {
                        double taxa = valorSaque * TAXA_SAQUE;
                        saldo = sacar(saldo, valorSaque);
                        /*System.out.printf("Saque realizado. Taxa cobrada R$ %.2f%n", taxa);
                        exibirSaldo(saldo);*/
                        System.out.printf("Saque realizado. Taxa cobrada: R$ %.2f%n", taxa);
                        totalLinhas = registrar(extrato, totalLinhas, String.format("SAQUE - R$ %.2f => Saldo R$ %.2f", valorSaque, saldo));
                        
                    }
                }

                else if (opcao == 3) {
                    System.out.println("-----------------------");
                    System.out.println(" Consultar Saldo");
                    exibirSaldo(saldo);
                    System.out.println("-----------------------");
                }

                else if (opcao == 4) {
                    System.out.println("-----------------------");
                    System.out.println(" Extrato - em breve");
                    System.out.println("-----------------------");
                    exibirExtrato(extrato, totalLinhas);

                }

                else if (opcao == 0) {
                    exibirExtrato(extrato, totalLinhas);
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
