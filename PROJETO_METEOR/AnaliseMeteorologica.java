package PROJETO_METEOR;

public class AnaliseMeteorologica {

    //O método 1 calcula a média ponderada da temperatura e vê se está em um intervalo válido
    public static double calcularMediaPonderadaTemperatura (double maxTemp,double minTemp)
    {
        //verificar se a temperatura está em um intervalo válido
        if (maxTemp >-50 && maxTemp <60)
        {
            System.out.println("Temperatura válida!");
        }
        else
        {
            System.out.println("Temperatura inválida.");
        }
    

    double mediaPondTemp = (maxTemp * 0.7) + (minTemp * 0.3);
    return mediaPondTemp;
    }

    // O método 2 classifica o clima
    public static String classificarClima (double tempMedia, int umidadeMedia)
    {

        if(tempMedia > 30 && umidadeMedia > 75)
        {
            return "Muito quente e úmido";
        }

        if (tempMedia >=20 && tempMedia <=25 && umidadeMedia >=50 && umidadeMedia <= 70)
        {
            return "Confortável";
        }

        if (tempMedia < 15 && umidadeMedia <50) {
            return "Frio e Seco";
        }

    return "Temperatura Moderada";
    }

    //O método 3 identifica a cidade com maior diferença de temperatura entre a mínima e a máxima
    public static int identificarCidadeComMaiorAmplitudeTermica(double[][] temperaturas)
    {
        int indiceMaior=0;
        double maiorAmplitude = 0;

        for (int i = 0; i < temperaturas.length; i++){
            double max = temperaturas [i][0];
            double min = temperaturas [i][1];

            double amplitude = max - min;

            if (amplitude > maiorAmplitude){
                maiorAmplitude = amplitude;
                indiceMaior = i;
            }
        }
        return indiceMaior;
    }

    //Impressao de relatorio, conforme solicitado
    public static void gerarRelatorio(double[][] temperaturas, int [][] umidades){

        System.out.println("CIDADE | T.MAX | T. MIN | T.MED | UMIDADE | CLIMA");

        for(int i=0; i < temperaturas.length; i++)
        {
        double max = temperaturas [i][0];
        double min = temperaturas [i][1];
        
        double media = calcularMediaPonderadaTemperatura(max, min);

        int soma = 0;
        
        for (int j=0; j< umidades[i].length; j++)
        {
            soma= soma + umidades [i][j];
        }

        int umidadeMedia = soma / umidades[i].length;
        String clima = classificarClima(media, umidadeMedia);
        System.out.printf("%d | %.2f | %.2f | %.2f | %d | %s\n",(i+1), max, min, media, umidadeMedia, clima);
    }

    int cidade = identificarCidadeComMaiorAmplitudeTermica (temperaturas);
    System.out.println("\n Cidade com maior amplitude térmica: " + (cidade + 1));
}

//------------------Método Principal-----------------------//
public static void main (String[] args){


    double [][] temperaturas = 
        {
        {3.5,22.1},
        {28.3,18.7},
        {35.8,24.9},
        {30.2,20.5},
        {25.7,15.3}
        };

    int [][] umidades = 
        {
        {85, 60, 75},
        {78, 55, 70},
        {90, 65, 80},
        {82, 58, 72},
        {75, 50, 68}
        };

    gerarRelatorio(temperaturas, umidades);

    }

}