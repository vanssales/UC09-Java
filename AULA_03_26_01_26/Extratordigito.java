package AULA_03_26_01_26;

import java.util.Scanner;

public class Extratordigito {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um numero de 3 digitos:");
        int numero = in.nextInt();

   for (int i = 0; i < 3; i++) {
    int digito = numero % 10;   // pega o último dígito
    System.out.println(digito);
    numero = numero / 10;       // remove o último dígito
    }

    in.close();
    }
}
