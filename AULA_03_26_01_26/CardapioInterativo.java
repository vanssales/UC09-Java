package AULA_03_26_01_26;

import java.util.Scanner;

public class CardapioInterativo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Veja o cardapio interativo
        System.out.print("********************************************************");   
        System.out.print("Escolha os itens do Cardapio Interativo");
        System.out.print("0 - Sair do Cardápio"); 
        System.out.print("1 - Lanche de Hambúrguer/queijo/bacon R$ 15,00");
        System.out.print("2 - Café R$ 10,00");
        System.out.print("3 - Coca - Cola R$ 8,00");
        System.out.print("4 - Paçoca R$ 2,00");
        System.out.print("5 - Prato Feito de Ovo Frito R$ 22,00");
        System.out.print("6 - Prato Feito de Frango R$ 24,00");
        System.out.print("7 - Prato Feito de Omelete R$ 25,00");    
        System.out.print("8 - Água mineral R$ 4,00"); 
        System.out.print("********************************************************");
        
        // Digite o numero para escolher
        while (opcao!=0)
        {
        System.out.print("Escolha o número do cardápio!");
        int opcao = in.nextInt();
            Case opcao=
        }
    
        // Cálculos
        double valorGorjeta = preco * (porcentagem / 100.0);
        double totalFinal = preco + valorGorjeta;

        // Saída formatada
        System.out.println("\n----- CONTA RESUMIDA -----");
        System.out.printf("Conta: R$ %.2f%n", preco);
        System.out.printf("Gorjeta Porcentagem %d por cento: Gorjeta Valor R$ %.2f %n", porcentagem, valorGorjeta);
        System.out.printf("Total a pagar: R$ %.2f %n", totalFinal);

        in.close();
    }
}
