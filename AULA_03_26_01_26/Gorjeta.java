// 16- Calculadora de Gorjeta
package AULA_03_26_01_26;

import java.util.Scanner;

public class Gorjeta {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Entrada do valor da conta
        System.out.print("Digite o valor total da conta: [em reais]: ");
        double preco = in.nextDouble();

        // Entrada da porcentagem
        System.out.print("Digite a porcentagem da gorjeta (número inteiro): ");
        int porcentagem = in.nextInt();

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
