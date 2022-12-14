package tech.ada.game.model;

import java.util.Scanner;

public class Jogador {

    static Scanner scanner = new Scanner(System.in);
    static String nome;

    public String getNome() {
        System.out.println("\nDigite o seu nome:");
        nome = scanner.next();
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
