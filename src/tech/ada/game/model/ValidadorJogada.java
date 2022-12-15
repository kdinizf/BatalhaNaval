package tech.ada.game.model;

public class ValidadorJogada {

    public ValidadorJogada() {
    }

    public char validaJogadorDaVez(int jogadorDaVez) {

        // Se for par ser� Jogador
        // Se for �mpar ser� Computador
        if (jogadorDaVez % 2 == 0) {
            System.out.println("� a sua vez de bombardear!");
            return 'J';
        } else {
            System.out.println("\n� a vez do Computador bombardear!");
            return 'C';
        }

    }

    public boolean validaFinalDoJogo(String[][] tabuleiro1, String[][] tabuleiro2, int submarinos, String nome) {

        int qtdSubmarinosDestruidos1 = 0;
        int qtdSubmarinosDestruidos2 = 0;

        for (int i = 0; i < tabuleiro1.length; i++) {

            for (int j = 0; j < tabuleiro1[i].length; j++) {
                String embarcacao = tabuleiro1[i][j];

                if (embarcacao == "X" || embarcacao == "*") {
                    qtdSubmarinosDestruidos1++;
                }
            }
        }

        for (int i = 0; i < tabuleiro2.length; i++) {

            for (int j = 0; j < tabuleiro2[i].length; j++) {
                String embarcacao = tabuleiro2[i][j];

                if (embarcacao == "X" || embarcacao == "*") {
                    qtdSubmarinosDestruidos2++;
                }
            }
        }

        if (qtdSubmarinosDestruidos1 == submarinos) {
            System.out.println("\nTodos os navios foram destru�dos. " + nome.toUpperCase() + ", voc� venceu!!!\n");
            return true;

        } else if (qtdSubmarinosDestruidos2 == submarinos) {
            System.out.println("\nTodos os navios foram destru�dos. O vencedor � o Computador!\n");
            return true;

        } else {
            return false;

        }

    }

}
