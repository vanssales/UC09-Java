package AULA_03_26_01_26;

import java.util.Scanner;

public class EstimadorTempoViagem {
    //38-    Estimador de Tempo de Viagem: Calcule tempo de viagem a partir de distância e velocidade.

    public static void calcularTempoViagem(double distancia, double velocidade)
    {

        if (velocidade<=0) 
        {
           System.out.println("Coloque uma velocidade maior que zero!");
        }
        else
        {   
        System.out.println("Calculando o tempo de viagem!");
        System.out.println("Tempo= " + (distancia/velocidade) +" hora(s)10");
        }
    }

    //t=Δs/v​  tempo = distancia/velocidade
  
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        System.out.println("Qual a distância a ser percorrida (EM KM):");
        double distancia = in.nextDouble();

        System.out.println("Qual a velocidade do veículo:");
        double velocidade = in.nextDouble();

        calcularTempoViagem(distancia, velocidade);

        in.close();
    }
}