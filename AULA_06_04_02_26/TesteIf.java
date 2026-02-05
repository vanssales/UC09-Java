package AULA_06_04_02_26;

public class TesteIf{
       
    public static void main(String[] args) {

        int x=0;

        if ( x == 0)
        {
            System.out.println("Passei pelo if linha 13");

        }
        else
        {
           System.out.println("Passei pelo else linha 18"); 

           if (x==0)
           {
           System.out.println("Passei pelo if linha 22"); 
           } 
           else
           {
           System.out.println("Passei pelo if linha 26");  
           }

        }
    }
}
