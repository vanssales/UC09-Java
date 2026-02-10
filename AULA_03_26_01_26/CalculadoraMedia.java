package AULA_03_26_01_26;

import java.util.Scanner;

public class CalculadoraMedia {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro numero decimal [use virgula]:");
        double numero1 = in.nextDouble();

        System.out.println("Digite um segundo numero decimal [use virgula]:");
        double numero2 = in.nextDouble();

        System.out.println("Digite um terceiro numero decimal [use virgula]:");
        double numero3 = in.nextDouble();
        
        System.out.println("Media = " + (numero1 + numero2 + numero3)/3);

        in.close();
    }
}
