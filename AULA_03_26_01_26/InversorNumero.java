//34-    Inversor de Número (3 dígitos): Inverta os dígitos de um número usando apenas aritmética.

package AULA_03_26_01_26;

import java.util.Scanner;

public class InversorNumero {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um numero de 3 digitos:");
        int numero = in.nextInt();

        int invertido = 0;

        for (int i = 0; i < 3; i++) {
            int digito = numero % 10;     
            invertido = invertido * 10 + digito; 
            numero = numero / 10;         
        }

        System.out.println(invertido); // imprime só o resultado final

        in.close();
    }
}


