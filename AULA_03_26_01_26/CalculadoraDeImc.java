//31-    Calculadora de IMC: Peça peso (kg) e altura (cm), calcule o IMC e categorize.

package AULA_03_26_01_26;

import java.util.Scanner;

public class CalculadoraDeImc {

    public static void calculadoraDeImc(double xpeso, double xaltura) {
        double imc = xpeso / Math.pow(xaltura, 2);
        System.out.printf("O IMC é: %.2f%n", imc);

        /*
        IMC    | Categoria
        < 18.5 | Abaixo do peso
        18.5 a 24.9 | Peso normal
        25.0 a 29.9 | Sobrepeso
        30.0 a 34.9 | Obesidade grau I
        35.0 a 39.9 | Obesidade grau II
        ≥ 40.0 | Obesidade grau III
    */

        if (imc<18.5) {
            System.err.println("Abaixo do Peso!");
        }
        else
            if ((imc>=18.5) &&  (imc<25)) {
                 System.err.println(" Peso normal!");
            }
            else 
            {
                    if ((imc>=25) &&  (imc<30)) 
                    {
                    System.err.println("Sobrepeso!");
                    }
                    else
                    {
                              if ((imc>=30) &&  (imc<35)) 
                              {
                              System.err.println("Obesidade grau I");
                              }
                              else
                              {
                                    if ((imc>=35) &&  (imc<40)) 
                                    {
                                    System.err.println("Obesidade grau II");
                                    }
                                    else
                                    { 
                                    System.err.println(" Obesidade grau III");
                                    }
                              }     
                    }
            }
    }
  
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o peso [use vírgula]:");
        double peso = in.nextDouble();

        System.out.println("Digite a altura [use vírgula]:");
        double altura = in.nextDouble();

        calculadoraDeImc(peso, altura);

        in.close();
    }
}
