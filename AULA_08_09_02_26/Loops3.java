package AULA_08_09_02_26;

public class Loops3 {

    public static void countdown(int n) {
        while (n <= 10) {
            System.out.println(n);
            n++;
        }
    }

    public static void main(String[] args) {
        int num = 1;
        countdown(num);
        System.out.println("Sistema Finalizado");
    }
}