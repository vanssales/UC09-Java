// 13- Escreva um método imprimirSoma(int a, int b) que imprima a soma
package AULA_03_26_01_26;

import java.util.Scanner;

public class imprimirSoma {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int n1 = in.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int n2 = in.nextInt();

        // Chama o método
        imprimirSoma(n1, n2);

        in.close();
    }

    public static void imprimirSoma(int n1, int n2) {
        int soma = n1 + n2;
        System.out.println("A soma é " + soma);
    }
}

