//36-    Calculadora de Notas: Média de 3 provas com atribuição de conceito (A, B, C...).
package AULA_03_26_01_26;

import java.util.Scanner;

public class AtribuicaoConceito{
       
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a nota");
        double nota = in.nextDouble();

        if (nota <= 3)
        {
        System.out.println("O aluno foi reprovado");
        }
        else
        {
            
                if (nota>= 3 && nota<5)
                {
                System.out.println("Recuperacao");
                }
                else
                {
                System.out.println("Aprovado");
                }

        }
    in.close();    
    }
}

