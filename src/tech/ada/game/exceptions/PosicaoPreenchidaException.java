package tech.ada.game.exceptions;

public class PosicaoPreenchidaException extends RuntimeException{

    public PosicaoPreenchidaException() {
        super("Posi��o j� preenchida. Tente novamente!\n");
    }

}
