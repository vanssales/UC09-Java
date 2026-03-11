/*package AULA_02;*/

/*

    Converte centimetros para pés e polegadas

    adicionar a conversão de polegadas para pés.
    Formula: pes = polega
        
 */
    import java.util.Scanner;

    public class converter {
    
        static final double CM_PARA_POLEGADAS = 2.54;
        static final double POL_PARA_PES = 12.0;
    
        public static void main(String[] args) {
    
            Scanner in = new Scanner(System.in);
    
            System.out.println("Digite um valor EXATO em cm:");
            double cm = in.nextDouble();
    
            double polegadas = cm / CM_PARA_POLEGADAS; 
            double pes = polegadas / POL_PARA_PES;

            //certo
            System.out.printf("%10.2f cm = %10.2f pol = %10.2f pés \n",cm, polegadas, pes);

            //errado - troca a ordem
            System.out.printf("%6.2f cm = %6.2f pol = %610.2f pés \n",pes, cm, polegadas);
        }
    }
    