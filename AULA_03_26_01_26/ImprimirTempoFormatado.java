package AULA_03_26_01_26;

import java.util.Scanner;

public class ImprimirTempoFormatado {

    public static void imprimirTempoFormatado(int h, int m, int s) {
        System.out.println(h + ":" + m + ":" + s);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a parte 1:");
        int a = in.nextInt();

        System.out.println("Digite a parte 2:");
        int b = in.nextInt();

        System.out.println("Digite a parte 3:");
        int c = in.nextInt();

        imprimirTempoFormatado(a, b, c); 

        in.close();
    }
}

