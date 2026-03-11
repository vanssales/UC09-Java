//35- Verificador de Ano Bissexto: Determine se um ano é bissexto.
package AULA_03_26_01_26;

import java.util.Scanner;

public class VerificadorAnoBissexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = sc.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("O ano " + ano + " é bissexto.");
        } else {
            System.out.println("O ano " + ano + " NÃO é bissexto.");
        }

        sc.close();
    }
}
