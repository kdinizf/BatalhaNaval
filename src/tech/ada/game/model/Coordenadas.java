package tech.ada.game.model;

import tech.ada.game.exceptions.PosicaoPreenchidaException;
import tech.ada.game.exceptions.ValorInvalidoException;
import tech.ada.game.utils.Leitor;

import java.util.Random;

public class Coordenadas {

    Random random = new Random();
    Leitor leitor = new Leitor();

    public Coordenadas() {
    }

    public void posicionaSubmarinosJogador(String[][] tabuleiro, int submarinos) {

        int qtdSubmarinos = 1;
        while (qtdSubmarinos <= submarinos) {

            System.out.println("*************** Submarino " + qtdSubmarinos + " ***************");

            int linha = leitor.lerLinha();
            int coluna = leitor.lerColuna();

            try {

                if (tabuleiro[linha][coluna].equals("N")) {
                    throw new PosicaoPreenchidaException();
                }

                tabuleiro[linha][coluna] = "N";

            } catch (ValorInvalidoException | PosicaoPreenchidaException e) {
                System.out.println(e.getMessage());
                continue;
            }

            qtdSubmarinos++;

        }

    }

    public void posicionaSubmarinosComputador(String[][] tabuleiro, int submarinos) {

        int qtdSubmarinos = 1;

        while (qtdSubmarinos <= submarinos) {

            try {
                int linha = random.nextInt(10);
                int coluna = random.nextInt(10);

                if (tabuleiro[linha][coluna].equals("N")) {
                    throw new PosicaoPreenchidaException();
                }

                tabuleiro[linha][coluna] = "N";

            } catch (PosicaoPreenchidaException e) {
                continue;

            }

            qtdSubmarinos++;

        }

    }

    public void solicitaJogadaJogador(String[][] meuTabuleiro, String[][] tabuleiroInimigo) {

        try {

            int linha = leitor.lerLinha();
            int coluna = leitor.lerColuna();

            ValidadorPosicao validadorPosicao = new ValidadorPosicao(tabuleiroInimigo, meuTabuleiro, linha, coluna);
            meuTabuleiro[linha][coluna] = validadorPosicao.disparo();

        } catch (ValorInvalidoException | PosicaoPreenchidaException e) {
            System.out.println(e.getMessage());
            solicitaJogadaJogador(meuTabuleiro, tabuleiroInimigo);

        }

    }

    public void solicitaJogadaComputador(String[][] meuTabuleiro, String[][] tabuleiroInimigo) {

        try {
            int linha = random.nextInt(10);
            int coluna = random.nextInt(10);

            ValidadorPosicao validadorPosicao = new ValidadorPosicao(tabuleiroInimigo, meuTabuleiro, linha, coluna);
            meuTabuleiro[linha][coluna] = validadorPosicao.disparo();

        } catch (PosicaoPreenchidaException e) {
            solicitaJogadaComputador(meuTabuleiro, tabuleiroInimigo);

        }

    }

}
