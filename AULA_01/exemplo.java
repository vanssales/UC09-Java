package AULA_01;

public class exemplo {
    public static void main(String[] args) {

        // Declaração de variáveis
        String teste, teste1; 
        teste = "Hello";
        teste1 = "World";
        /*
        Não pode:
        "hello" - 1
        "mundo" / 123
        hello * "Mundo"*/

        System.out.println(1 + 2 + "Hello");
        System.out.println("Hello"+ 1 + 2);
        System.out.println(teste + " " + teste1);
        //Sout - para dar Sytem.out.println
        System.out.println(teste + " " + teste1);
        System.out.println(teste.length());
    }
}