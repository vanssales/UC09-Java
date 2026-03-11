//33-    Calculadora de Valor Futuro: VF = P * (1 + r)^t. Use Math.pow.
package AULA_03_26_01_26;

import java.util.Scanner;

public class ConversorUnidadesAprimorado {

    public static double milhasMetros(double milhas) {
        double metros=milhas*1609.34;
        return metros;
    }

    public static double milhasQuilometros(double milhas) {
        double quilometros=milhas*1.60934;
        return quilometros;
    }
    

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Digite a distância em milhas: ");
        double milhas = in.nextDouble();

        System.out.println("Digite uma opção");
        System.out.println("1- Converter Milhas em metros!");
        System.out.println("2- Converter Milhas em quilometros!");
   
        int opcao=-1;

        while (opcao!=1 && opcao!=2)
        {
            System.out.print("Escolha a opção:");
            opcao = in.nextInt();
                    switch (opcao)
                    {
                        case 1: 
                        System.out.println("O valor de milhas em metros é: 1" + milhasMetros(milhas));
                        break;

                        case 2: 
                        System.out.println("O valor de milhas em quilometros é: 1" + milhasQuilometros(milhas));
                        break;

                        default:
                        System.out.println("Opção inválida. Escolha 1 (Milhas em metros) ou 2 (Milhas em quilometros)!");
                    }
        }
    in.close();
    }
}

