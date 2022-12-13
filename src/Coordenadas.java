import java.util.Random;
import java.util.Scanner;

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

    public static void solicitaJogadaJogador(char[][] tabuleiro1, char[][] tabuleiro2) {

        int linha = Leitor.lerLinha();
        int coluna = Leitor.lerColuna();

        if (tabuleiro2[linha][coluna] == ' ' && tabuleiro1[linha][coluna] == ' ') {
            System.out.println("Tiro na água!");
            tabuleiro1[linha][coluna] = '-';
        }

        if (tabuleiro2[linha][coluna] == ' ' && tabuleiro1[linha][coluna] == 'N') {
            System.out.println("Tiro na água!");
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

    }

    public static void solicitaJogadaComputador(char[][] tabuleiro1, char[][] tabuleiro2) {

        int linha = random.nextInt(10);
        int coluna = random.nextInt(10);

        if (tabuleiro2[linha][coluna] == ' ' && tabuleiro1[linha][coluna] == ' ') {
            System.out.println("Tiro na água!");
            tabuleiro1[linha][coluna] = '-';
        }

        if (tabuleiro2[linha][coluna] == '*' && tabuleiro1[linha][coluna] == ' ') {
            System.out.println("Tiro na água!");
            tabuleiro1[linha][coluna] = '-';
        }

        if (tabuleiro2[linha][coluna] == ' ' && tabuleiro1[linha][coluna] == 'N') {
            System.out.println("Tiro na água!");
            tabuleiro1[linha][coluna] = 'n';
        }

        if (tabuleiro2[linha][coluna] == '*' && tabuleiro1[linha][coluna] == 'N') {
            System.out.println("Tiro na água!");
            tabuleiro1[linha][coluna] = 'n';
        }

        if (tabuleiro2[linha][coluna] == 'N' && tabuleiro1[linha][coluna] == ' ') {
            System.out.println("Tiro certeiro!");
            tabuleiro1[linha][coluna] = '*';
        }

        if (tabuleiro2[linha][coluna] == 'n' && tabuleiro1[linha][coluna] == ' ') {
            System.out.println("Tiro certeiro!");
            tabuleiro1[linha][coluna] = '*';
        }

        if (tabuleiro2[linha][coluna] == 'N' && tabuleiro1[linha][coluna] == 'N') {
            System.out.println("Tiro certeiro!");
            tabuleiro1[linha][coluna] = 'X';
        }

        if (tabuleiro2[linha][coluna] == 'n' && tabuleiro1[linha][coluna] == 'N') {
            System.out.println("Tiro certeiro!");
            tabuleiro1[linha][coluna] = 'X';
        }

    }

}
