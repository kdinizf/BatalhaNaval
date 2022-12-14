package tech.ada.jogo.utils;

import java.util.Scanner;

public class Leitor {

    static Scanner scanner = new Scanner(System.in);
    static int linha;
    static int coluna;

    public static int lerLinha() {

        System.out.println("Informe a linha (0-9):");
        linha = scanner.nextInt();

        if (linha < 0 || linha > 9) {
            System.out.println("Posição inválida. Tente novamente!");
            throw new RuntimeException("Posição inválida. Tente novamente!");
        } else {
            return linha;
        }

    }

    public static int lerColuna() {

        System.out.println("Informe a coluna (0-9):");
        coluna = scanner.nextInt();

        if (coluna < 0 || coluna > 9) {
            System.out.println("Posição inválida. Tente novamente!");
            throw new RuntimeException("Posição inválida. Tente novamente!");
        } else {
            return coluna;
        }

    }

}
