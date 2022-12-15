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

    public boolean validaFinalDoJogo(String[][] meuTabuleiro, String[][] tabuleiroInimigo, int submarinos, String nome) {

        int qtdSubJogadorDestruiu = 0;
        int qtdSubComputadorDestruiu = 0;

        for (int i = 0; i < meuTabuleiro.length; i++) {

            for (int j = 0; j < meuTabuleiro[i].length; j++) {
                String embarcacao = meuTabuleiro[i][j];

                if (embarcacao == "X" || embarcacao == "*") {
                    qtdSubJogadorDestruiu++;
                }
            }
        }

        for (int i = 0; i < tabuleiroInimigo.length; i++) {

            for (int j = 0; j < tabuleiroInimigo[i].length; j++) {
                String embarcacao = tabuleiroInimigo[i][j];

                if (embarcacao == "X" || embarcacao == "*") {
                    qtdSubComputadorDestruiu++;
                }
            }
        }

        if (qtdSubJogadorDestruiu == submarinos) {
            System.out.println("\nTodos os navios foram destru�dos. " + nome.toUpperCase() + ", voc� venceu!!!\n");
            return true;

        } else if (qtdSubComputadorDestruiu == submarinos) {
            System.out.println("\nTodos os navios foram destru�dos. O vencedor � o Computador!\n");
            return true;

        } else {
            return false;

        }

    }

}
