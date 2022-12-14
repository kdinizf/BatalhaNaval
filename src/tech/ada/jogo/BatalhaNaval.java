package tech.ada.jogo;

public class BatalhaNaval {

    static char[][] tabuleiroJogador = new char[10][10];
    static char[][] tabuleiroComputador = new char[10][10];

    public static void main(String[] args) {

        System.out.println("#############################################");
        System.out.println("############### BATALHA NAVAL ###############");
        System.out.println("#############################################");
        System.out.println();

        // Iniciando tabuleiros
        Tabuleiro.iniciaTabuleiro(tabuleiroJogador);
        Tabuleiro.iniciaTabuleiro(tabuleiroComputador);

        // Imprimindo tabuleiro vazio
        Tabuleiro.imprimeTabuleiroJogador(tabuleiroJogador);

        System.out.println();
        System.out.println("Posicione os seus submarinos!");
        System.out.println();
        Coordenadas.posicionaSubmarinosJogador(tabuleiroJogador);
        Tabuleiro.imprimeTabuleiroJogador(tabuleiroJogador);
        System.out.println();

        Coordenadas.posicionaSubmarinosComputador(tabuleiroComputador);
        System.out.println("Computador já posicionou seus Submarinos!");
        System.out.println();
        //Tabuleiro.imprimeTabuleiroComputador(tabuleiroComputador);

        // Iniciando o Jogo
        int jogadorDaVez = 0;
        while (true) {

            char jogadorDaVezJOuC = Validador.validaJogadorDaVez(jogadorDaVez);

            if (jogadorDaVezJOuC == 'J') {
                Coordenadas.solicitaJogadaJogador(tabuleiroJogador, tabuleiroComputador);
                Tabuleiro.imprimeTabuleiroJogador(tabuleiroJogador); // Imprimir tabuleiro somente quando for a vez do jogador
            }

            if (jogadorDaVezJOuC == 'C') {
                Coordenadas.solicitaJogadaComputador(tabuleiroComputador, tabuleiroJogador);
            }

            //Tabuleiro.imprimeTabuleiroComputador(tabuleiroComputador);

            jogadorDaVez++;

            boolean finalJogo = Validador.validaFinalDoJogo(tabuleiroJogador, tabuleiroComputador);

            if (finalJogo) {
                break;
            }

        }


    }

}
