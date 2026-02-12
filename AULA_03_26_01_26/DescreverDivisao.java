package AULA_03_26_01_26;

import java.util.Scanner;

public class DescreverDivisao {
    //28-    Método descreverDivisao(int a, int b) que imprima "a / b = q, resto r".

    public static void descreverDivisao(int a, int b)
    {

        if (b == 0) {1
           System.out.println("Divisão por zero");
        }
        else
        {   
        System.out.println(a + "/" + b +  "= " + a/b);
        System.out.println("resto: " + (a%b));
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor 1:");
        int a = in.nextInt();

        System.out.println("Digite o valor 2:");
        int b = in.nextInt();

        descreverDivisao(a, b);

        in.close();
    }
}