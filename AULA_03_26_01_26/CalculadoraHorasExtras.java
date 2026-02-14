package AULA_03_26_01_26;

import java.util.Scanner;

public class CalculadoraHorasExtras {

    public static void calculadoraHorasExtras(double horas, double salario) {

        double salarioFinal;

        if (horas > 40) {
            double valorHora = salario / 40;
            double horasExtras = horas - 40;
            salarioFinal = salario + (horasExtras * valorHora * 1.5);
        } 
        else
            {
            salarioFinal = salario;
        }

        System.out.println("Salário final: " + salarioFinal);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o salário da pessoa:");
        double salario = in.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas:");
        double horasTrabalhadas = in.nextDouble();

        calculadoraHorasExtras(horasTrabalhadas, salario);

        in.close();
    }
}
