package AULA_10_23_02_26;

import java.util.Arrays;

public class Exemplo2 {

    public static void printArray(int[] vector) {
        //escrever um método que passado um array, o método imprime os valores
        
        for(int i=0;i<vector.length;i++)  //o método lenght dá o tamanho do vetor
        {
        System.out.println(vector[i]);    
        }
    }
    

    //inicialização dos vetores
    public static void main(String[] args) {
        int[] counts;
        double[] values;
        int size = 10;
    
        //criação dos vetores
        counts = new int[4];
        values = new double[size];

        //inicialização com atribuição dos valores;
        int[] a = {1,2,3,4};
        int[] b = {1,2,3,4,5};
        int[] c = {1,2,3,4,5,6,7,8,9,10};

        counts[0]=7;
        counts[1]=counts[0]*2;
        counts[2]++;   //porque popula com zero todos os vetores
        counts[3]=7-60;
    
        printArray(counts);
        printArray(b);
          
        //System.out.println(a); //identidade do vetor - todo objeto tem uma identidade - toda identidade é única
        System.out.println("Imprimindo o vetor c usando um método!");
        System.out.println(Arrays.toString(c));

    }
}

/*
Código	O que faz
int[] counts;	Só declara
counts = new int[4];	Cria o vetor
int[] numeros = {1,2,3,4};	Declara + cria + inicializa
*/