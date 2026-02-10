package AULA_08_09_02_26;

public class Loops6 {

     public static void sequence(int n){
        while (n!=1)
        {
            System.out.println(n);
            if(n%2==0)
                {
                    n=n / 2;
                }
                else
                {
                    n=(n*3)+1;
                }
         }


        }

    public static void main(String[] args) {
        //int num = 10;
        sequence(3);
        System.out.println("Sistema Finalizado");
    }

}



