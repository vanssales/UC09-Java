import java.util.Scanner;

public class atividade {

    static final double CM_PARA_POLEGADAS = 2.54;
    static final double POL_PARA_PES = 12.0;
    static int pol;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um valor EXATO em cm:");
        double cm = in.nextDouble();

        double polegadas = cm / CM_PARA_POLEGADAS;
        double pes = polegadas / POL_PARA_PES;

        pol = (int) polegadas;

        // correto
        System.out.printf("%10.2f pés = %10.2f cm = %4d pol \n", pes, cm, pol);

    }
}
