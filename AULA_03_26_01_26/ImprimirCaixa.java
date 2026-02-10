//14-    Escreva um método imprimirCaixa() que use imprimirLinha para formar uma caixa.
package AULA_03_26_01_26;

public class ImprimirCaixa {

    public static void main(String[] args) {

        imprimirCaixa();
    }

    public static void imprimirCaixa() {

        int largura = 20;
        int altura = 10;

        for (int j = 0; j < altura; j++) {   // linhas

            System.out.print("|"); // lado esquerdo

            for (int i = 0; i < largura; i++) { // hifens
                System.out.print("-");
            }

            System.out.println("|"); // lado direito + quebra linha
        }
    }
}
