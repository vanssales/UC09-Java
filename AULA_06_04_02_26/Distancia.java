package AULA_06_04_02_26;

import java.util.Scanner;

public class Distancia {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o x1:");
        double x1 = in.nextDouble();

        System.out.println("Digite o x2:");
        double x2 = in.nextDouble();

        System.out.println("Digite o y1:");
        double y1 = in.nextDouble();

        System.out.println("Digite o y2:");
        double y2 = in.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("Distancia = " + distancia);

        in.close();
    }
}
