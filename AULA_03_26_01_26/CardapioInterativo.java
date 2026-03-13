package AULA_03_26_01_26;

import java.util.Scanner;

public class CardapioInterativo {

    public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);

        // Veja o cardapio interativo
        System.out.println("********************************************************");   
        System.out.println("Escolha os itens do Cardapio Interativo");
        System.out.println("0 - Sair do Cardápio"); 
        System.out.println("1 - Lanche de Hambúrguer/queijo/bacon R$ 15,00");
        System.out.println("2 - Café R$ 10,00");
        System.out.println("3 - Coca - Cola R$ 8,00");
        System.out.println("4 - Paçoca R$ 2,00");
        System.out.println("5 - Prato Feito de Ovo Frito R$ 22,00");
        System.out.println("6 - Prato Feito de Frango R$ 24,00");
        System.out.println("7 - Prato Feito de Omelete R$ 25,00");    
        System.out.println("8 - Água mineral R$ 4,00"); 
        System.out.println("9 - Suco de Laranja R$ 9,00");
        System.out.println("********************************************************");
        
        int opcao=-1;
        int soma=0;
        // Digite o numero para escolher
        while (opcao!=0)
        {
        System.out.print("Escolha o número do cardápio: ");
        opcao = in.nextInt();
            switch (opcao)
            {
                case 0: 
                System.out.println("Saindo do menu Interativo");
                break;

                case 1: 
                System.out.println("Você escolheu Lanche de Hambúrguer/queijo/bacon");
                soma = soma + 15;
                break;

                case 2: 
                System.out.println("Você escolheu Café");
                soma = soma + 10;
                break;

                case 3: 
                System.out.println("Você escolheu Coca - Cola");
                soma = soma + 8;
                break;

                case 4: 
                System.out.println("Você escolheu Paçoca");
                soma = soma + 2;
                break;

                case 5: 
                System.out.println("Você escolheu Prato Feito de Ovo Frito");
                soma = soma + 22;
                break;

                case 6: 
                System.out.println("Você escolheu Prato Feito de Frango ");
                soma = soma + 24;
                break;

                case 7: 
                System.out.println("Você escolheu Prato Feito de Omelete");
                soma = soma + 25;
                break;

                case 8: 
                System.out.println("Você escolheu Água mineral ");
                soma = soma + 4;
                break;

                case 9: 
                System.out.println("Você escolheu Suco de Laranja!");
                soma = soma + 9;
                break;

                default:
                System.out.println("Opção inválida. Escolha uma opção de 0 a 9!");
            }
        }

        System.out.println("O total final da compra é: " + soma);

        in.close();
    }
}
