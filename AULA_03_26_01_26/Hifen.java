//11- Escreva um método void imprimirLinha() que imprima 20 hifens. Chame-o.
package AULA_03_26_01_26;

public class Hifen {

    public static void main(String[] args) {

        // Chamada do método
        imprimirLinha();
    }

    // Método que imprime 20 hifens
    public static void imprimirLinha() {
        for (int i = 0; i < 20; i++) {
            System.out.print("-");
        }
        System.out.println(); // pula a linha no final
    }
}
