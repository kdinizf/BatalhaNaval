package tech.ada.game.model;

import java.util.Scanner;

public class Jogador {

    private String nome;

    public Jogador() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite o seu nome:");
        nome = scanner.next();
    }

}
