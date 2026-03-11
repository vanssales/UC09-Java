package AULA_06_04_02_26;

import java.util.Scanner;

public class DistanciaParametro {

    //Função que retorna a distancia entre 2 pontos
    public static double calcularDistancia(double v1, double v2) 
    {
        return Math.pow(v2 - v1, 2);
    }

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

        // Usa o método para X
        double dx = calcularDistancia(x1, x2);

        // Usa o método para Y
        double dy = calcularDistancia(y1, y2);

        // Soma os resultados
        double distancia = Math.sqrt(dx + dy);

        System.out.println("Distancia = " + distancia);

        in.close();
    }
}
