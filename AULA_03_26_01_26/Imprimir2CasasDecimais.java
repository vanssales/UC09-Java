//10-    Use printf para imprimir um double com exatamente duas casas decimais.

package AULA_03_26_01_26;

import java.util.Scanner;

public class Imprimir2CasasDecimais {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número real (use a vírgula): ");
        double numero = in.nextDouble();

        System.out.printf("Número formatado = %.2f%n", numero);

        in.close();
    }
}
