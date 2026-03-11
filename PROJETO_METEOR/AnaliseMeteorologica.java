/*
Nome: Vanessa Alessandra 
Ajudado pela IA CLOUDE
*/

package PROJETO_METEOR;

public class AnaliseMeteorologica {

    //O método 1 calcula a média ponderada da temperatura e vê se está em um intervalo válido
    public static double calcularMediaPonderadaTemperatura (double maxTemp,double minTemp)
    {
        //verificar se a temperatura está em um intervalo válido
        if (maxTemp >-50 && maxTemp <60)
        {
            //System.out.println("Temperatura válida!");
        }
        else
        {
            //System.out.println("Temperatura inválida.");
        }

        double mediaPondTemp = (maxTemp * 0.7) + (minTemp * 0.3);
        return mediaPondTemp;
    }

    // O método 2 classifica o clima
    public static String classificarClima (double tempMedia, double umidadeMedia)
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

    // Impressao de relatorio, conforme solicitado
    public static void gerarRelatorio(double[][] temperaturas, int [][] umidades){

        // imprime o cabeçalho da tabela
        System.out.println("CIDADE | T.MAX | T. MIN | T.MED | UMIDADE | CLIMA");

       
        for(int i=0; i < temperaturas.length; i++)
        {
            // pega temperatura maxima e minima da cidade
            // percorre todas as cidades
            //System.out.println("Umidades lenght colunas:"+temperaturas[i].length); //-> linha de teste apenas

            double max = temperaturas [i][0];
            double min = temperaturas [i][1];

            // calcula a media ponderada da temperatura
            double media = calcularMediaPonderadaTemperatura(max, min);

            // variavel para somar as umidades
            double soma = 0;   // ALTERADO PARA DOUBLE

            //System.out.println("Umidades lenght linhas:"+umidades.length); -> linha de teste apenas
            //System.out.println("Umidades lenght colunas:"+umidades[i].length); -> linha de teste apenas
            
            // percorre as 3 umidades da cidade (manha, tarde, noite)
            for (int j=0; j< umidades[i].length; j++)
            {
                soma = soma + umidades [i][j];
            }


            // calcula a media da umidade
            double umidadeMedia = soma / umidades[i].length;

            // classifica o clima da cidade
            String clima = classificarClima(media, umidadeMedia);

            // imprime os dados da cidade na tabela
            System.out.printf("%d      | %.2f | %.2f  | %.2f    | %.1f | %s\n",
                    (i+1), max, min, media, umidadeMedia, clima); // UMIDADE COM 1 CASA
        }

        // identifica a cidade com maior amplitude termica
        int cidade = identificarCidadeComMaiorAmplitudeTermica (temperaturas);

        // imprime o resultado
        System.out.println("\n Cidade com maior amplitude térmica: " + (cidade + 1));
    }

    //------------------Método Principal-----------------------//
    public static void main (String[] args){

        // Temperaturas: [máxima, mínima] para 5 cidades
        double[][] temperaturas = {
            {32.5, 22.1},  // Cidade 1
            {28.3, 18.7},  // Cidade 2
            {35.8, 24.9},  // Cidade 3
            {30.2, 20.5},  // Cidade 4
            {25.7, 15.3}   // Cidade 5
        };

        // Umidades: [manhã, tarde, noite] para 5 cidades
        int[][] umidades = {
            {85, 60, 75},  // Cidade 1
            {78, 55, 70},  // Cidade 2
            {90, 65, 80},  // Cidade 3
            {82, 58, 72},  // Cidade 4
            {75, 50, 68}   // Cidade 5
        };

        gerarRelatorio(temperaturas, umidades);

    }    
  
}