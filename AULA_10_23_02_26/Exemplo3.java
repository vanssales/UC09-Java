package AULA_10_23_02_26;

import java.util.Arrays;

public class Exemplo3 {

    public static void printArray(int[][] vector) {
        for(int i = 0; i < vector.length; i++) {
            for(int j = 0; j < vector[i].length; j++) {
                System.out.print(vector[i][j]);
                System.out.print(" ");
            }
            System.out.println();    
        }
    }

    public static void main(String[] args) {
        int[][] counts;
        //double[][] values;
        int[][] a;
        int[][] b;
        //int size = 10;
    
        counts = new int[][] {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20}
        };

        //values = new double[size][size];

        a = new int [][] { 
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        b = new int [][] { 
            {1,2,3,4},
            {1,2,3,4},
            {1,2,3,4},
            {1,2,3,4}
        };

        printArray(counts);

        System.out.println("Imprimindo o vetor b usando Arrays.toString():");
        for(int i = 0; i < b.length; i++) {
            System.out.println(Arrays.toString(b[i])); // usando toString corretamente
        }
    }
}