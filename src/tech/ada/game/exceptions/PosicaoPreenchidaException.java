package tech.ada.game.exceptions;

public class PosicaoPreenchidaException extends RuntimeException{

    public PosicaoPreenchidaException() {
        super("Posição já preenchida. Tente novamente!\n");
    }

}
