package Aula_09_13_02_26;

//import java.util.Scanner;

public class Strings2 {
       
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "a";

        int diff = s1.compareTo(s2);

        if (diff < 0)
        {
            System.out.println("menor");
        }
        else 
            if (diff>0)
            {
            System.out.println("maior");
            }
            else
            {
            System.out.println("iguais");
            }     
        }
    }
