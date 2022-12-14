package tech.ada.game.model;

public class Validador {

    public static char validaJogadorDaVez(int jogadorDaVez) {

        // Se for par ser· Jogador
        // Se for Ìmpar ser· Computador
        if (jogadorDaVez % 2 == 0) {
            System.out.println("\n… a sua vez de bombardear!\n");
            return 'J';
        } else {
            System.out.println("\n… a vez do Computador bombardear!\n");
            return 'C';
        }

    }

    public static boolean validaFinalDoJogo(char[][] tabuleiro1, char[][] tabuleiro2, int submarinos, String nome) {

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
            System.out.println("\nTodos os navios foram destruÌdos. " + nome + ", vocÍ venceu!!!\n");
            return true;

        } else if (qtdSubmarinosDestruidos2 == submarinos) {
            System.out.println("\nTodos os navios foram destruÌdos. O vencedor È o Computador!\n");
            return true;

        } else {
            return false;

        }

    }

}
