// 24 - Repetidor de String
package AULA_03_26_01_26;

import java.util.Scanner;

public class ImpressorPadroes{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Imprimindo um triângulo e um retângulo vazado de estrelas!");
        
        //Imprimindo Triangulo
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) 
            {
                System.out.print("*");
            }
        System.out.println(" ");
        }

         //Imprimindo Retangulo
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) 
            {
                System.out.print("*");
            }
        System.out.println(" ");
        }

        in.close();
    }
   
}