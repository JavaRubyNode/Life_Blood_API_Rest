package br.com.vinicius.errors;

/**
 * Created by vinicius on 13/09/16.
 */
public class DetalheErros {

    private Long status;
    private String titulo;
    private Long timeStamp;
    private String mensagemDesenvolvedor;

    public Long getStatus() {return status;}

    public void setStatus(Long status) {this.status = status;}

    public String getTitulo() {return titulo;}

    public void setTitulo(String titulo) {this.titulo = titulo;}

    public Long getTimeStamp() {return timeStamp;}

    public void setTimeStamp(Long timeStamp) {this.timeStamp = timeStamp;}

    public String getMensagemDesenvolvedor() {return mensagemDesenvolvedor;}

    public void setMensagemDesenvolvedor(String mensagemDesenvolvedor) {this.mensagemDesenvolvedor = mensagemDesenvolvedor;}
}

