package tech.ada.game.utils;

import tech.ada.game.exceptions.ValorInvalidoException;

import java.util.Scanner;

public class Leitor {

    private Scanner scanner = new Scanner(System.in);

    public Leitor() {
    }

    public int lerLinha() {

        System.out.println("Informe a linha (0-9):");
        int linha = scanner.nextInt();

        if (linha < 0 || linha > 9) {
            throw new ValorInvalidoException();
        } else {
            return linha;
        }

    }

    public int lerColuna() {

        System.out.println("Informe a coluna (0-9):");
        int coluna = scanner.nextInt();

        if (coluna < 0 || coluna > 9) {
            throw new ValorInvalidoException();
        } else {
            return coluna;
        }

    }

}
