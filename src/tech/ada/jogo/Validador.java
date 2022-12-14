package tech.ada.jogo;

public class Validador {

    public static char validaJogadorDaVez(int jogadorDaVez) {

        // Se for par será Jogador
        // Se for ímpar será Computador
        if (jogadorDaVez % 2 == 0) {
            System.out.println();
            System.out.println("É a sua vez de bombardear!");
            System.out.println();
            return 'J';
        } else {
            System.out.println();
            System.out.println("É a vez do Computador bombardear!");
            System.out.println();
            return 'C';
        }

    }

    public static boolean validaFinalDoJogo(char[][] tabuleiro1, char[][] tabuleiro2) {

        int qtdSubmarinosAfundados1 = 0;
        int qtdSubmarinosAfundados2 = 0;

        for (int i = 0; i < tabuleiro1.length; i++) {

            for (int j = 0; j < tabuleiro1[i].length; j++) {
                char submarinos = tabuleiro1[i][j];

                if (submarinos == 'X' || submarinos == '*') {
                    qtdSubmarinosAfundados1++;
                }
            }
        }

        for (int i = 0; i < tabuleiro2.length; i++) {

            for (int j = 0; j < tabuleiro2[i].length; j++) {
                char submarinos = tabuleiro2[i][j];

                if (submarinos == 'X' || submarinos == '*') {
                    qtdSubmarinosAfundados2++;
                }
            }
        }

        if (qtdSubmarinosAfundados1 == 2) {
            System.out.println();
            System.out.println("Todos os navios foram destruídos. O vencedor é o JOGADOR!");
            return true;

        } else if (qtdSubmarinosAfundados2 == 2) {
            System.out.println();
            System.out.println("Todos os navios foram destruídos. O vencedor é o Computador!");
            return true;

        } else {
            return false;

        }

    }

}
