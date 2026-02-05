package AULA_01;

public class variavel2 {
    public static void main(String[] args) {

        // Declaração de variáveis
        // String nome;
        int x, y;
        // String sobrenome;
        int hora, minuto;
        String mensagem;
        String mensagemNova;

        mensagem = "Olá, tudo bem!"; // atribuindo a string à variável mensagem
        mensagemNova = "Olá, não está tudo bem!"; // atribuindo a string à variável mensagemNova

        System.out.println("Mensagem: " + mensagem);
        System.out.println("Mensagem: " + mensagemNova);
        
        hora = 11;
        minuto = 56;

        x=3;
        y=x;

        System.out.println("y: " + y);

        System.out.println("Hora e minuto: " + hora + ":" + minuto);

        System.out.println("Quantos minutos tem na variável hora, somado à variável minutos");
        System.out.println((hora*60)+minuto);

        System.out.println("Fração da hora que a var minuto representa");
        System.out.println(minuto*1.0/60);

        System.out.println("A porcentagem de hora que a var minuto representa");
        System.out.println((minuto*100)/60);

    }
}
