package tech.ada.game.model;

import tech.ada.game.exceptions.PosicaoPreenchidaException;

public class ValidadorPosicao {

    private String campoInimigo;
    private String meuCampo;
    private String novoValor;

    public ValidadorPosicao(String[][] meuTabuleiro, String[][] tabuleiroInimigo, int linha, int coluna) {

        meuCampo = meuTabuleiro[linha][coluna];
        campoInimigo = tabuleiroInimigo[linha][coluna];


    }

    public String disparo() {

        validaCampoVazioOuJaJogado(meuCampo, campoInimigo);
        validaDisparo(meuCampo, campoInimigo);
        return novoValor;

    }

    private void validaCampoVazioOuJaJogado(String meuCampo, String campoInimigo) {

        if (campoInimigo.equals(" ") && meuCampo.equals(" ")) {
            System.out.println("Tiro na água!");
            novoValor = "-";
        } else if (meuCampo.equals("-") || meuCampo.equals("n") || meuCampo.equals("X") || meuCampo.equals("*")) {
            throw new PosicaoPreenchidaException();
        }

    }

    private void validaDisparo(String meuCampo, String campoInimigo) {

        if (campoInimigo.equals("N") && meuCampo.equals(" ")) {
            System.out.println("Tiro certeiro!");
            novoValor = "*";
        } else if (campoInimigo.equals("n") && meuCampo.equals(" ")) {
            System.out.println("Tiro certeiro!");
            novoValor = "*";
        } else if (campoInimigo.equals("N") && meuCampo.equals("N")) {
            System.out.println("Tiro certeiro!");
            novoValor = "X";
        } else if (campoInimigo.equals("X") && meuCampo.equals("N")) {
            System.out.println("Tiro certeiro!");
            novoValor = "X";
        } else if (campoInimigo.equals(" ") && meuCampo.equals("N")) {
            System.out.println("Tiro na água!");
            novoValor = "n";
        } else if (campoInimigo.equals("-") && meuCampo.equals(" ")) {
            System.out.println("Tiro na água!");
            novoValor = "-";
        }

    }

}
