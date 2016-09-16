package br.com.vinicius.errors;

import br.com.vinicius.exceptions.ExisteObjetoException;
import br.com.vinicius.exceptions.NaoEncontradoException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by vinicius on 13/09/16.
 */
@ControllerAdvice
public class ResourcesExceptionHandler {

    @ExceptionHandler(NaoEncontradoException.class)
    public ResponseEntity<DetalheErros> handleNaoEncontroException(NaoEncontradoException e , HttpServletRequest request){

        DetalheErros erro = new DetalheErros();
        erro.setStatus(404L);
        erro.setTitulo("O doador não foi encontrado");
        erro.setMensagemDesenvolvedor("http://erros.lifeblood.com/404");
        erro.setTimeStamp(System.currentTimeMillis());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
    }


    @ExceptionHandler(ExisteObjetoException.class)
    public ResponseEntity<DetalheErros> handleNaoEncontroException(ExisteObjetoException e , HttpServletRequest request){

        DetalheErros erro = new DetalheErros();
        erro.setStatus(409L);
        erro.setTitulo("O doador já existe");
        erro.setMensagemDesenvolvedor("http://erros.lifeblood.com/409");
        erro.setTimeStamp(System.currentTimeMillis());

        return ResponseEntity.status(HttpStatus.CONFLICT).body(erro);
    }
}

