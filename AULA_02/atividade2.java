import java.util.Scanner;

public class atividade2 {

    static final double METRO_PARA_CM = 100.0;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um valor EXATO em metros:");
        double metros = in.nextDouble();

        double centimetros = metros * METRO_PARA_CM;

        System.out.printf("%10.2f metros = %10.2f centímetros\n", metros, centimetros);
    }
}
