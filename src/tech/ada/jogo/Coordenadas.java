package tech.ada.jogo;

import java.util.Random;

public class Coordenadas {

    static Random random = new Random();

    public static void posicionaSubmarinosJogador(char[][] tabuleiro) {

        int qtdSubmarinos = 1;

        while (qtdSubmarinos <= 10) {

            System.out.println("*************** Submarino " + qtdSubmarinos + " ***************");

            try {
                tabuleiro[Leitor.lerLinha()][Leitor.lerColuna()] = 'N';
            } catch (RuntimeException e) {
                continue;
            }

            qtdSubmarinos++;

        }

    }

    public static void posicionaSubmarinosComputador(char[][] tabuleiro) {

        int qtdSubmarinos = 1;

        while (qtdSubmarinos <= 10) {

            int linha = random.nextInt(10);
            int coluna = random.nextInt(10);

            tabuleiro[linha][coluna] = 'N';

            qtdSubmarinos++;

        }

    }

    // '*' - Tiro certeiro
    // 'X' - Tiro certeiro no tabuleiro do advers�rio, por�m tem uma navio seu na posi��o
    // 'N' - Submarino posicionado
    // 'n' - Submarino posicionado no seu tabuleiro, por�m foi �gua no tabuleiro do advers�rio
    // '-' - Tiro na �gua
    // ' ' - Sem tiro

    public static void solicitaJogadaJogador(char[][] tabuleiro1, char[][] tabuleiro2) {

        try {

            int linha = Leitor.lerLinha();
            int coluna = Leitor.lerColuna();

            if (tabuleiro2[linha][coluna] == ' ' && tabuleiro1[linha][coluna] == ' ') {
                System.out.println("Tiro na �gua!");
                tabuleiro1[linha][coluna] = '-';
            }

            if (tabuleiro2[linha][coluna] == ' ' && tabuleiro1[linha][coluna] == 'N') {
                System.out.println("Tiro na �gua!");
                tabuleiro1[linha][coluna] = 'n';
            }

            if (tabuleiro2[linha][coluna] == 'N' && tabuleiro1[linha][coluna] == ' ') {
                System.out.println("Tiro certeiro!");
                tabuleiro1[linha][coluna] = '*';
            }

            if (tabuleiro2[linha][coluna] == 'N' && tabuleiro1[linha][coluna] == 'N') {
                System.out.println("Tiro certeiro!");
                tabuleiro1[linha][coluna] = 'X';
            }

            if (tabuleiro2[linha][coluna] == '*' && tabuleiro1[linha][coluna] == 'N') {
                System.out.println("Tiro na �gua!");
                tabuleiro1[linha][coluna] = 'n';
            }

        } catch (RuntimeException e) {
            solicitaJogadaJogador(tabuleiro1, tabuleiro2);

        }

    }

    public static void solicitaJogadaComputador(char[][] tabuleiro1, char[][] tabuleiro2) {

        int linha = random.nextInt(10);
        int coluna = random.nextInt(10);

        if (tabuleiro2[linha][coluna] == ' ' && tabuleiro1[linha][coluna] == ' ') {
            System.out.println("Tiro na �gua!");
            tabuleiro1[linha][coluna] = '-';
        }

        if (tabuleiro2[linha][coluna] == ' ' && tabuleiro1[linha][coluna] == 'N') {
            System.out.println("Tiro na �gua!");
            tabuleiro1[linha][coluna] = 'n';
        }

        if (tabuleiro2[linha][coluna] == 'N' && tabuleiro1[linha][coluna] == ' ') {
            System.out.println("Tiro certeiro!");
            tabuleiro1[linha][coluna] = '*';
        }

        if (tabuleiro2[linha][coluna] == 'N' && tabuleiro1[linha][coluna] == 'N') {
            System.out.println("Tiro certeiro!");
            tabuleiro1[linha][coluna] = 'X';
        }

        if (tabuleiro2[linha][coluna] == '*' && tabuleiro1[linha][coluna] == 'N') {
            System.out.println("Tiro na �gua!");
            tabuleiro1[linha][coluna] = 'n';
        }

    }

}
