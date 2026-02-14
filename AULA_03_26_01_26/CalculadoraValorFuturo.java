//33-    Calculadora de Valor Futuro: VF = P * (1 + r)^t. Use Math.pow.
package AULA_03_26_01_26;

import java.util.Scanner;

public class CalculadoraValorFuturo {

    public static double calculadoraValorFuturo(double P, double r, double t) {
        double VFuturo = P * Math.pow((1 + r), t);
        return VFuturo;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor inicial [P]:");
        double P = in.nextDouble();

        System.out.println("Digite a taxa de juros [use a vírgula - exemplo- 10% = 0,10]:");
        double r = in.nextDouble();

        System.out.println("Digite o tempo:");
        double t = in.nextDouble();

        double resultado = calculadoraValorFuturo(P, r, t);

        System.out.println("O valor futuro é: 1" + resultado);

        in.close();
    }
}

