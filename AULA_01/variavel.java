package AULA_01;

public class variavel {
    public static void main(String[] args) {

        // Declaração de variáveis
        String nome;
        int x, y;
        String sobrenome;
        int hora, minuto;
        String mensagem;

        mensagem = "Olá, tudo bem?"; // atribuindo a string à variável mensagem
        
        hora = 11;
        minuto = 56;

        x=3;
        y=x;

        System.out.println("y: " + y);

        System.out.println("Hora e minuto: " + hora + ":" + minuto);
    }
}
