package AULA_03_26_01_26;

import java.util.Scanner;

public class ClassificadorIdade{
       
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a idade:");
        double idade = in.nextDouble();

        if (idade <= 12)
        {
        System.out.println("A pessoa é uma criança!");
        }
        else
        {
            
                if (idade>= 13 && idade<=18)
                {
                System.out.println("A pessoa é adolescente!");
                }
                else
                {
                System.out.println("A pessoa é adulta!");
                }

        }
    in.close();    
    }
}
