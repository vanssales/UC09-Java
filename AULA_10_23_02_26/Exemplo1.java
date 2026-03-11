package AULA_10_23_02_26;

public class Exemplo1 {

    /*public static void countdown(int n) {
     
    }*/

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

        counts[0]=7;
        counts[1]=counts[0]*2;
        counts[2]++;   //porque popula com zero todos os vetores
        counts[3]=7-60;
    
        /*int i=0;
        while(i<4){
            System.out.println(counts[i]);
            i++;
        }*/

        for(int i=0;i<4;i++)
        {
        System.out.println(counts[i]);    
        }

        System.out.println(a); //identidade do vetor - todo objeto tem uma identidade - toda identidade é única

    }
}

/*
Código	O que faz
int[] counts;	Só declara
counts = new int[4];	Cria o vetor
int[] numeros = {1,2,3,4};	Declara + cria + inicializa
*/