package tech.ada.game.exceptions;

public class ValorInvalidoException extends RuntimeException {

    public ValorInvalidoException() {
        super("Valor inválido. Tente novamente!\n");
    }

}
