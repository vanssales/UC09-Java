package AULA_08_09_02_26;

public class Loops2 {

    public static void countdown(int n) {
        while (n < 10) {
            n++;
            System.out.println(n);
           
        }
    }

    public static void main(String[] args) {
        int num = 0;
        countdown(num);
        System.out.println("Sistema Finalizado");
    }
}
