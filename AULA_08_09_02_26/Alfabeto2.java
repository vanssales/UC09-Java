package AULA_08_09_02_26;

public class Alfabeto2 {

    public static void main(String[] args) {
        //String fruta = "banana";
        //char letra;

        for (char c = 'A'; c <= 'z'; c++) 
        {
             System.out.printf("%c ", c); 
             if(c=='Z'){
                c+=6;
             }

        }

             
             
    }

}