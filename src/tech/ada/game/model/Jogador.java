package tech.ada.game.model;

public class Jogador {

    String nome;

    public String getNome() {
        System.out.println("Digite o seu nome:");
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
