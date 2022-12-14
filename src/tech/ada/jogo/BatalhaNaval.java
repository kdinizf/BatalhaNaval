package tech.ada.jogo;

import tech.ada.jogo.utils.Tabuleiro;

import java.util.Scanner;

public class BatalhaNaval {

    static char[][] tabuleiroJogador = new char[10][10];
    static char[][] tabuleiroComputador = new char[10][10];
    static int submarinos;

    public static void main(String[] args) {

        String resposta = "S";
        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("#############################################");
            System.out.println("############### BATALHA NAVAL ###############");
            System.out.println("#############################################");
            System.out.println();
            System.out.println("              Iniciando partida!             ");
            System.out.println();

            // Iniciando tabuleiros
            Tabuleiro.iniciaTabuleiro(tabuleiroJogador);
            Tabuleiro.iniciaTabuleiro(tabuleiroComputador);

            // Imprimindo tabuleiro vazio
            Tabuleiro.imprimeTabuleiroJogador(tabuleiroJogador);

            System.out.println();
            System.out.println("Posicione os seus submarinos!");
            System.out.println("Informe a quantidade que deseja posicionar:");
            submarinos = scanner.nextInt();
            System.out.println();
            Coordenadas.posicionaSubmarinosJogador(tabuleiroJogador, submarinos);
            System.out.println();
            Tabuleiro.imprimeTabuleiroJogador(tabuleiroJogador);
            System.out.println();

            Coordenadas.posicionaSubmarinosComputador(tabuleiroComputador, submarinos);
            System.out.println("Computador j� posicionou seus Submarinos!");
            System.out.println();
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
                    System.out.println();
                    System.out.println("#############################################");
                    System.out.println();
                    Tabuleiro.imprimeTabuleiroComputador(tabuleiroComputador);
                    break;
                }

            }

            System.out.println();
            System.out.println("Deseja iniciar nova partida (S/N)?");
            resposta = scanner.next();

        }

        while (resposta.equalsIgnoreCase("S"));
        System.out.println("Jogo Encerrado!");


    }

}
