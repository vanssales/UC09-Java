package AULA_08_09_02_26;

public class ExemploString1 {

    public static void main(String[] args) {
        String fruta = "banana";
        char letra;

        for (int i = 0; i<=fruta.length();i++)
        {
              letra = fruta.charAt(i);
              System.out.printf("%c%n", letra);

        }
        
      
    }

}
