//45-    Menu Simples de "Caixa Eletrônico": Simule operações de depósito, saque e consulta de saldo.
package AULA_03_26_01_26;

import java.util.Scanner;

public class MenuSimplesCaixaEletronico {

 


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double deposito = -32767;
        while (deposito<0)
        {
            System.out.println("Faça um depósito inicial. O valor deve ser igual ou maior que 1");
            deposito = in.nextDouble();
        }

        int opcao=-1;
        int total = 0;
        switch (opcao){
            case 1: total=total+valordeposito;
            case 2: total=total-valorsaque
            case 3: consultar(total);

        }
       
        System.out.println("Faça um depósito");
        double valorDolar = in.nextDouble();

        System.out.println("Digite a taxa de cambio [use a vírgula]:");
        double taxaCambio = in.nextDouble();
        
        System.out.printf("Convertendo a moeda! = %.2f%n", valorDolar * taxaCambio);

        in.close();
    }
}


 int opcao=-1;
        int soma=0;
        // Digite o numero para escolher
        while (opcao!=0)
        {
        System.out.print("Escolha o que deseja fazer");
        opcao = in.nextInt();
            switch (opcao)
            {
                case 0: 
                System.out.println("Saindo do caixa eletronico!");
                break;

                case 1: 
                System.out.println("Você escolheu depositar");
                total = total + soma;
                break;

                case 2: 
                System.out.println("Você escolheu sacar");
                soma = soma + 10;
                break;

                case 3: 
                System.out.println("Você escolheu consultar");
                soma = soma + 8;
                break;

                default:
                System.out.println("Opção inválida. Escolha uma opção de 0 a 3!");
            }
        }

        System.out.println("O valor final na sua conta é: " + soma);

        in.close();