package br.com.vinicius.exceptions;

/**
 * Created by vinicius on 16/09/16.
 */
public class NaoEncontradoException extends RuntimeException {

    private static final long serialVersionUID = 1869300553614629710L;

    public NaoEncontradoException(String mensagem){super(mensagem);}

    public NaoEncontradoException( String mensagem , Throwable causa){ super(mensagem,causa);}
}
