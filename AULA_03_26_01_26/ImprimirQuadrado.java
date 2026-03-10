// 12- Escreva um método imprimirQuadrado(int n) que imprima "O quadrado de n é n²".
package AULA_03_26_01_26;

import java.util.Scanner;

public class ImprimirQuadrado {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = in.nextInt();

        // Chama o método
        imprimirQuadrado(n);

        in.close();
    }

    public static void imprimirQuadrado(int n) {
        int quadrado = n * n;
        System.out.println("O quadrado de " + n + " é " + quadrado);
    }
}

