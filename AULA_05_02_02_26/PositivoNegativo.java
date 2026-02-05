package AULA_05_02_02_26;

import java.util.Scanner;

public class PositivoNegativo{
       
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int numero = in.nextInt();

        if (numero == 0)
        {
        System.out.println("O número nao é positivo nem negativo!");
        }
        else
        {
            
                if (numero > 0)
                {
                System.out.println("O número é positivo");
                }
                else
                {
                System.out.println("O número é Negativo");
                }

        }
    in.close();    
    }
}

