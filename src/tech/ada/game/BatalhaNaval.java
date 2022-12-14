package tech.ada.game;

import tech.ada.game.model.Coordenadas;
import tech.ada.game.model.Jogador;
import tech.ada.game.model.Validador;
import tech.ada.game.utils.Tabuleiro;

import java.util.Scanner;

public class BatalhaNaval {

    static char[][] tabuleiroJogador = new char[10][10];
    static char[][] tabuleiroComputador = new char[10][10];
    static int submarinos;
    static String nome;

    public static void main(String[] args) {

        String resposta = "S";
        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("Digite o seu nome:");
            nome = scanner.next();
            System.out.println("\n#############################################");
            System.out.println("############### BATALHA NAVAL ###############");
            System.out.println("#############################################");
            System.out.println("\n              Iniciando partida!             \n");

            // Iniciando tabuleiros
            Tabuleiro.iniciaTabuleiro(tabuleiroJogador);
            Tabuleiro.iniciaTabuleiro(tabuleiroComputador);

            // Imprimindo tabuleiro vazio
            Tabuleiro.imprimeTabuleiroJogador(tabuleiroJogador);

            System.out.println("\nPosicione os seus submarinos!");
            System.out.println("Informe a quantidade que deseja posicionar:");
            submarinos = scanner.nextInt();
            System.out.println();
            Coordenadas.posicionaSubmarinosJogador(tabuleiroJogador, submarinos);
            System.out.println();
            Tabuleiro.imprimeTabuleiroJogador(tabuleiroJogador);
            System.out.println();

            Coordenadas.posicionaSubmarinosComputador(tabuleiroComputador, submarinos);
            System.out.println("Computador já posicionou seus Submarinos!\n");
            Tabuleiro.imprimeTabuleiroComputador(tabuleiroComputador);

            // Iniciando o Jogo
            int jogadorDaVez = 0;
            while (true) {

                char jogadorDaVezJOuC = Validador.validaJogadorDaVez(jogadorDaVez);

                if (jogadorDaVezJOuC == 'J') {
                    Coordenadas.solicitaJogadaJogador(tabuleiroJogador, tabuleiroComputador);
                    System.out.println();
                    Tabuleiro.imprimeTabuleiroJogador(tabuleiroJogador); // Imprimir tabuleiro somente quando for a vez do jogador
                }

                if (jogadorDaVezJOuC == 'C') {
                    Coordenadas.solicitaJogadaComputador(tabuleiroComputador, tabuleiroJogador);
                    System.out.println();
                    Tabuleiro.imprimeTabuleiroComputador(tabuleiroComputador);
                }

                jogadorDaVez++;

                boolean finalJogo = Validador.validaFinalDoJogo(tabuleiroJogador, tabuleiroComputador, submarinos);

                if (finalJogo) {
                    Tabuleiro.imprimeTabuleiroJogador(tabuleiroJogador);
                    System.out.println("\n#############################################\n");
                    Tabuleiro.imprimeTabuleiroComputador(tabuleiroComputador);
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
