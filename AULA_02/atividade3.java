import java.util.Scanner;

public class atividade3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); //um unico scanner basta - scanner de teclado - apenas um teclado

        String nome;
        int idade;
        
       
       
        System.out.printf("Digite sua idade: ");
        idade = in.nextInt(); // caso de um inteiro
        in.nextLine();
        System.out.printf("Digite seu nome: ");
        nome = in.nextLine(); //caso de uma string


        /*correto*/
        System.out.printf("Nome: %s \n Idade: %d", nome, idade);

   
    }
}