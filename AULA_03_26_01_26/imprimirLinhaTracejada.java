package AULA_03_26_01_26;

import java.util.Scanner;

public class imprimirLinhaTracejada {

    public static void imprimirLinhaTracejada(int comprimentolinha) { 

        for (int i=1;i<comprimentolinha;i++)
        {
             System.out.print("-");
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o comprimento da Linha");
        int comprimento = in.nextInt();

        imprimirLinhaTracejada(comprimento); 
        System.out.println(" ");

        in.close();
    }
}
