package tech.ada.game.utils;

import tech.ada.game.model.Jogador;

public class Tabuleiro {

    private String nome;

    public Tabuleiro(String nome) {
        this.nome = nome;
    }

    public void iniciaTabuleiro(String[][] tabuleiro) {

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = " ";
            }
        }

    }

    public void imprimeTabuleiroJogador(String[][] tabuleiro) {

        System.out.println("  -----------------------------------------");
        System.out.println("                    " + nome.toUpperCase());
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

    public void imprimeTabuleiroComputador(String[][] tabuleiro) {

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
