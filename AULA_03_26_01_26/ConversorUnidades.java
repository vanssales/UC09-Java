

import java.util.Scanner;
import java.util.Locale; //pois usarei o ponto como separador

public class ConversorUnidades {

    static final double CM_PARA_POLEGADAS = 2.54;
 
    public static void main(String[] args) {

        Locale.setDefault(Locale.US); //usaremos o ponto - sistema americano

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um valor em polegadas (use ponto):");
        double polegadas = in.nextDouble();

        double cm = polegadas * CM_PARA_POLEGADAS;

        // correto
        System.out.printf("%10.2f polegadas = %10.2f centímetros \n", polegadas, cm);

    in.close();   

    }
}
