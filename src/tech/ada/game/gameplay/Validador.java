package tech.ada.game.gameplay;

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

    public static boolean validaFinalDoJogo(char[][] tabuleiro1, char[][] tabuleiro2, int submarinos) {

        int qtdSubmarinosDestruidos1 = 0;
        int qtdSubmarinosDestruidos2 = 0;

        for (int i = 0; i < tabuleiro1.length; i++) {

            for (int j = 0; j < tabuleiro1[i].length; j++) {
                char embarcacao = tabuleiro1[i][j];

                if (embarcacao == 'X' || embarcacao == '*') {
                    qtdSubmarinosDestruidos1++;
                }
            }
        }

        for (int i = 0; i < tabuleiro2.length; i++) {

            for (int j = 0; j < tabuleiro2[i].length; j++) {
                char embarcacao = tabuleiro2[i][j];

                if (embarcacao == 'X' || embarcacao == '*') {
                    qtdSubmarinosDestruidos2++;
                }
            }
        }

        if (qtdSubmarinosDestruidos1 == submarinos) {
            System.out.println();
            System.out.println("Todos os navios foram destruídos. O vencedor é o JOGADOR!");
            System.out.println();
            return true;

        } else if (qtdSubmarinosDestruidos2 == submarinos) {
            System.out.println();
            System.out.println("Todos os navios foram destruídos. O vencedor é o Computador!");
            System.out.println();
            return true;

        } else {
            return false;

        }

    }

}
