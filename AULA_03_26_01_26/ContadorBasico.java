package AULA_03_26_01_26;
import java.util.Scanner;

public class ContadorBasico {

public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);

        // Veja o cardapio interativo
        System.out.println("********************************************************");   
        System.out.println("Escolha o que deseja fazer no contador");
        System.out.println("0 - Sair do Contador"); 
        System.out.println("1 - Incrementar");
        System.out.println("2 - Decrementar");
        System.out.println("3 - Reiniciar");
        System.out.println("********************************************************");

        int opcao=-1;
        int contador=0;
        // Digite o numero para escolher
        while (opcao!=0)
        {
        System.out.print("Escolha uma opçao: ");
        opcao = in.nextInt();
            switch (opcao)
            {
                case 0: 
                System.out.println("Sair do Contador");
                
                break;

                case 1: 
                System.out.println("Incrementando");
                contador = contador+1;
                System.out.println("Valor atual = "+ contador);
                break;

                case 2: 
                System.out.println("Decrementando");
                contador = contador-1;
                System.out.println("Valor atual = "+ contador);
                break;

                case 3: 
                System.out.println("Reiniciando");
                contador=0;
                System.out.println("Reiniciando o contador!");
                System.out.println("Valor  = "+ contador);
                break;

                default:
                System.out.println("Opção inválida. Escolha uma opção de 0 a 3!");
            }
        }

        System.out.println("O valor final no contador é: " + contador);
        in.close();
    }
    
}