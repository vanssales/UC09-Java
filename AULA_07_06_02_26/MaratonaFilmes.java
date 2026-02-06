package AULA_07_06_02_26;

public class MaratonaFilmes {

    public static void exibirCabecalho() {
        System.out.println("\t\t =============================================== \n");
        System.out.printf("\t\t\t GERENCIADOR DE MARATONA DE FILMES  \n");
        System.out.println("\t\t =============================================== \n");
    }

    public static void main(String[] args) {
        String nomeUsuario = "Vanessa Alessandra de Sales da Silva";
        int quantFilmes = 3;
        double duracao = 2.5;

        exibirCabecalho();

        boolean planejamentoValido = isValida(quantFilmes);
        double tempoTotal = calcularTempoTotal(quantFilmes, duracao);
        String classificacao = classificarMaratona(tempoTotal);
        
        System.out.println("Informacoes da Maratona:");
        System.out.println("Usuario: " + nomeUsuario);
        System.out.println("Filmes planejados: " + quantFilmes);
        System.out.println("Duracao media por filme: " + duracao + " horas \n\n");
        System.out.println("Calculos:");
        System.out.printf("Tempo total: %.2f horas %n", tempoTotal);
        System.out.println("Classificacao: " + classificacao);
        System.out.println("Validacao: Planejamento valido? " + planejamentoValido);
        System.out.println("========================================");
    }

    // Calcular o tempo total
    public static double calcularTempoTotal(int filmes, double duracao) {
        return filmes * duracao;
    }

    // Classificar a maratona
    public static String classificarMaratona(double horas) {
        if (horas <= 4) {
            return "Maratona Leve";
        } else if (horas <= 8) {
            return "Maratona Moderada";
        } else {
            return "Maratona Epica!";
        }
    }

    // Verificar se a quantidade de filmes é válida 
    public static boolean isValida(int qtdfilmes) {
        return qtdfilmes > 0;
    }
}
