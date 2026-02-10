import java.util.Scanner;

public class ImprimirCabecalhoNota {

    // Agora recebe o nome da loja
    public static void imprimirCabecalhoNota(String nomeLoja) {

       System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");
        System.out.println("\t\t" + nomeLoja);
        System.out.println("\t Telefone: 000-001-0009-010");
        System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");

    }

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Qual o nome da loja?:");
        String nomeLoja = ler.nextLine();

        // Chamada correta
        imprimirCabecalhoNota(nomeLoja);

        ler.close();
    }
}



