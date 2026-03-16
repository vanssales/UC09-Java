//45-    Menu Simples de "Caixa Eletrônico": Simule operações de depósito, saque e consulta de saldo.
package AULA_03_26_01_26;

import java.util.Scanner;

public class MenuSimplesCaixaEletronico {

 
<<<<<<< HEAD


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
=======
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double total = -1;
   
            while (total<=0) {
            System.out.println("Digite um valor de depósito. Deve ser maior ou igual a 1: ");
            total = in.nextDouble();
            System.out.printf("O valor depositado é %.2f \n",total);
            }

        int opcao=-1;
        while (opcao!=0) 
        {
            System.out.println("-------------------------------------------------------");
            System.out.println("MENU DA CONTA");
            System.out.println("-------------------------------------------------------");
            System.out.println("0 - Sair Da Conta!");
            System.out.println("1 - Depositar na conta");
            System.out.println("2 - Sacar da conta ");
            System.out.println("3 - Consultar Saldo");
            System.out.println("-------------------------------------------------------");
             

            //Digite a opçao: sair 
            while (opcao!=0)
            {
            System.out.print("Escolha o que deseja fazer: ");
            opcao = in.nextInt();
                switch (opcao)
                {
                    case 0: 
                    System.out.println("Saindo do caixa eletronico!");
                    break;

                    case 1: 
                    System.out.println("Você escolheu depositar");
                    double valorDeposito=-1;
                                while (valorDeposito<=0) {
                                System.out.println("Digite um valor de depósito. Deve ser maior ou igual a 1: ");
                                valorDeposito = in.nextDouble();
                                System.out.printf("O valor depositado é %.2f \n",valorDeposito);
                                }
                    total=total+valorDeposito;
                    System.out.println("Total após o depósito: "+ total);
                    break;

                    case 2: 
                    System.out.println("Você escolheu depositar");
                    double valorSaque=-1;
                                while (valorSaque<=0) {
                                System.out.println("Digite um valor de saque. Deve ser maior ou igual a 1: ");
                                valorSaque= in.nextDouble();
                                System.out.printf("O valor sacado é %.2f \n",valorSaque);
                                }
                                if (valorSaque<=total) {
                                    total=total-valorSaque;
                                    System.out.println("Total após o depósito: "+ total);
                                }
                                else
                                {
                                    System.out.println("Saldo da Conta:" + total);
                                    System.out.println("Valor do saque:" + valorSaque);
                                    System.out.println("O valor que está na conta é menor que o valor do saque!");
                                }
                    
                    break;

                    case 3: 
                    System.out.println("Você escolheu consultar o Saldo! ");
                    System.out.println("Total na conta: "+ total);
                    break;

                    default:
                    System.out.println("Opção inválida. Escolha uma opção de 0 a 3!");
                }
            }
        }

        System.out.println("O valor final na sua conta é: " + total);

        in.close();
    } //fim do programa principal

}



>>>>>>> 15961410594d236944f0bc80662b90c240ac95b5
