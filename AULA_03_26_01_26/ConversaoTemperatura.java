package AULA_03_26_01_26;

import java.util.Locale;
import java.util.Scanner;

public class ConversaoTemperatura {

    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {

            in.useLocale(Locale.US); // aceita ponto

            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = in.nextDouble();

            double fahrenheit = (celsius * 9 / 5) + 32;

            System.out.println("Temperatura em Fahrenheit: " + fahrenheit + " °F");
        }
    }
}
