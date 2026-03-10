package AULA_03_26_01_26;

import java.util.Scanner;

public class Precoquantidade {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um preço (em Reais) [Use a vírgula]: ");
        double preco = in.nextDouble();

        System.out.println("Digite uma quantidade (numero inteiro): ");
        int quantidade = in.nextInt();
        
        System.out.printf("VALOR = %.2f reais%n", preco * quantidade);


        in.close();
    }
}
