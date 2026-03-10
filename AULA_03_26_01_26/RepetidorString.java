// 24 - Repetidor de String
package AULA_03_26_01_26;

import java.util.Scanner;

public class RepetidorString {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Quantas vezes você quer repetir a palavra?: ");
        int vezes = in.nextInt();
        in.nextLine();

        System.out.print("Digite a palavra: ");
        String palavra = in.nextLine();

        for (int i = 0; i < vezes; i++) {
            System.out.println(palavra);
        }

        in.close();
    }
   
}
