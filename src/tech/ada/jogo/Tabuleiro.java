package tech.ada.jogo;

public class Tabuleiro {

    public static void iniciaTabuleiro(char[][] tabuleiro) {

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = ' ';
            }
        }

    }

    public static void imprimeTabuleiroJogador(char[][] tabuleiro) {

        System.out.println("  -----------------------------------------");
        System.out.println("                    JOGADOR                ");
        System.out.println("  -----------------------------------------");
        System.out.println("    0   1   2   3   4   5   6   7   8   9");
        System.out.println("  -----------------------------------------");
        for (int i = 0; i < tabuleiro.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print("| " + tabuleiro[i][j] + " ");
            }
            System.out.println("|");
            System.out.println("  -----------------------------------------");
        }

    }

    public static void imprimeTabuleiroComputador(char[][] tabuleiro) {

        System.out.println("  -----------------------------------------");
        System.out.println("                 COMPUTADOR                ");
        System.out.println("  -----------------------------------------");
        System.out.println("    0   1   2   3   4   5   6   7   8   9");
        System.out.println("  -----------------------------------------");
        for (int i = 0; i < tabuleiro.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print("| " + tabuleiro[i][j] + " ");
            }
            System.out.println("|");
            System.out.println("  -----------------------------------------");
        }

    }

}
