package tech.ada.game.exceptions;

public class ValorInvalidoException extends RuntimeException {

    public ValorInvalidoException() {
        super("Valor inv�lido. Tente novamente!\n");
    }

}
