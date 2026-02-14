package Aula_09_13_02_26;

import java.util.Scanner;

public class Strings4 {

      // Metodo que separa hora inserida pelo usuario em AM e PM
    public static void mostrarAM_PM(int hora, int minuto) {

        if (hora < 12) {
            System.out.printf("%02d:%02d AM\n", hora, minuto);
        } else {
            System.out.printf("%02d:%02d PM\n", hora, minuto);
        }
    }
       
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite a hora (0 até 23): ");
        int hora = in.nextInt();

        System.out.print("Digite o minuto (0 até 59): ");
        int minuto = in.nextInt();

        mostrarAM_PM(hora, minuto); 
        in.close();
    }
}

