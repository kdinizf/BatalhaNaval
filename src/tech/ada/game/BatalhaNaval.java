package tech.ada.game;

import tech.ada.game.model.Coordenadas;
import tech.ada.game.model.Jogador;
import tech.ada.game.model.ValidadorJogada;
import tech.ada.game.utils.Tabuleiro;

import java.util.Scanner;

public class BatalhaNaval {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Coordenadas coordenadas = new Coordenadas();
        ValidadorJogada validadorJogada = new ValidadorJogada();
        Jogador jogador = new Jogador();

        String[][] tabuleiroJogador = new String[10][10];
        String[][] tabuleiroComputador = new String[10][10];

        int submarinos;
        String resposta = "S";

        do {

            System.out.println("\n#############################################");
            System.out.println("############### BATALHA NAVAL ###############");
            System.out.println("#############################################");

            jogador.setNome();
            Tabuleiro tabuleiro = new Tabuleiro(jogador.getNome());

            System.out.println("\n              Iniciando partida!             \n");

            // Iniciando tabuleiros
            tabuleiro.iniciaTabuleiro(tabuleiroJogador);
            tabuleiro.iniciaTabuleiro(tabuleiroComputador);

            // Imprimindo tabuleiro vazio
            tabuleiro.imprimeTabuleiroJogador(tabuleiroJogador);

            System.out.println("\nPosicione os seus submarinos!");
            System.out.println("Informe a quantidade que deseja posicionar:");
            submarinos = scanner.nextInt();
            System.out.println();
            coordenadas.posicionaSubmarinosJogador(tabuleiroJogador, submarinos);
            System.out.println();
            tabuleiro.imprimeTabuleiroJogador(tabuleiroJogador);

            coordenadas.posicionaSubmarinosComputador(tabuleiroComputador, submarinos);
            System.out.println("\nComputador já posicionou seus Submarinos!\n");
            //tabuleiro.imprimeTabuleiroComputador(tabuleiroComputador);

            // Iniciando o Jogo
            int jogadorDaVez = 0;
            while (true) {

                char jogadorDaVezJOuC = validadorJogada.validaJogadorDaVez(jogadorDaVez);

                if (jogadorDaVezJOuC == 'J') {
                    coordenadas.solicitaJogadaJogador(tabuleiroJogador, tabuleiroComputador);
                    System.out.println();
                    tabuleiro.imprimeTabuleiroJogador(tabuleiroJogador); // Imprimir tabuleiro somente quando for a vez do jogador
                }

                if (jogadorDaVezJOuC == 'C') {
                    coordenadas.solicitaJogadaComputador(tabuleiroComputador, tabuleiroJogador);
                    System.out.println();
                    //tabuleiro.imprimeTabuleiroComputador(tabuleiroComputador);
                }

                jogadorDaVez++;

                boolean finalJogo = validadorJogada.validaFinalDoJogo(tabuleiroJogador, tabuleiroComputador, submarinos, jogador.getNome());

                if (finalJogo) {
                    tabuleiro.imprimeTabuleiroJogador(tabuleiroJogador);
                    System.out.println("\n#############################################\n");
                    tabuleiro.imprimeTabuleiroComputador(tabuleiroComputador);
                    break;
                }

            }

            System.out.println("\nDeseja iniciar nova partida (S/N)?");
            resposta = scanner.next();

        }

        while (resposta.equalsIgnoreCase("S"));
        System.out.println("Jogo Encerrado!");

    }

}
