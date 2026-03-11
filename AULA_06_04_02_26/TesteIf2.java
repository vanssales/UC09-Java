package AULA_06_04_02_26;

public class TesteIf2{
       
    public static void main(String[] args) {

        int x=0;
        int y=0;

        if ( x == 0)
        {
            System.out.println("se x for zero");

            if (y==0)
            {
            System.out.println("se x=0 e y=0");
            }

        }

        if (( x == 0) && (y==0))
        {
        System.out.println("se x=0 e y=0");
        }

    }
}
