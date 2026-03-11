package AULA_08_09_02_26;

public class Loops9 {

    //Repete 100 vezes

    public static void nested() {

        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                System.out.printf("%4d + %4d = %4d%n", x, y, (x + y));
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("nested");
        nested();
    }
}
