package AULA_08_09_02_26;

public class Loops8 {

    public static void appreciate1() {
        int i = 2;

        while (i <= 8) {
            System.out.println(i + " , ");
            i += 2;
        }
    }

       public static void appreciate2() {

        for (int i = 2; i <= 8; i += 2) {
            System.out.println(i + " , ");
        }

    }

    public static void main(String[] args) {
        System.out.println("Apreciate 1");
        appreciate1();
        System.out.println("Apreciate 2");
        appreciate2();
        System.out.println("Sistema Finalizado");
    }
}
