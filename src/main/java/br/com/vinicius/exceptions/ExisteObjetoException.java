package br.com.vinicius.exceptions;

/**
 * Created by vinicius on 16/09/16.
 */
public class ExisteObjetoException extends RuntimeException {

    private static final long serivalVersionUID = 869300553614629710L;

    public ExisteObjetoException(String mensagem) {
        super(mensagem);
    }

    public ExisteObjetoException(String mensagem, Throwable causa) {super(mensagem, causa);}
}
