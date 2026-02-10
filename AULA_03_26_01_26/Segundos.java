package AULA_03_26_01_26;

import java.util.Locale;
import java.util.Scanner;

public class Segundos {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US); // força uso do ponto

        System.out.println("Digite um numero de Segundos");
        int segundos = in.nextInt();

        int minutos= segundos/60;
        int restosegundos= segundos%60;

        System.out.println ("Minutos: " + minutos);
        System.out.println ("resto de segundos " + restosegundos);

        in.close();
    }
}