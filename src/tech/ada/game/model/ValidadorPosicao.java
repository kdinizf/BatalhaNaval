package tech.ada.game.model;

import tech.ada.game.exceptions.PosicaoPreenchidaException;

public class ValidadorPosicao {

    private String campoInimigo;
    private String meuCampo;
    private String novoValor;

    public ValidadorPosicao(String[][] tabuleiroInimigo, String[][] meuTabuleiro, int linha, int coluna) {

        campoInimigo = tabuleiroInimigo[linha][coluna];
        meuCampo = meuTabuleiro[linha][coluna];

    }

    public String disparo() {

        validaCampoVazioOuJaJogado(campoInimigo, meuCampo);
        validaDisparo(campoInimigo, meuCampo);
        return novoValor;

    }

    private void validaCampoVazioOuJaJogado(String campoInimigo, String meuCampo) {

        if (campoInimigo.equals(" ") && meuCampo.equals(" ")) {
            novoValor = "-";
        } else if (meuCampo.equals("-") || meuCampo.equals("n") || meuCampo.equals("X") || meuCampo.equals("*")) {
            throw new PosicaoPreenchidaException();
        }

    }

    private void validaDisparo(String campoInimigo, String meuCampo) {

        if (campoInimigo.equals("N") && meuCampo.equals(" ")) {
            novoValor = "*";
        } else if (campoInimigo.equals("N") && meuCampo.equals("N")) {
            novoValor = "X";
        } else if (campoInimigo.equals(" ") && meuCampo.equals("N")) {
            novoValor = "n";
        }

    }

}
