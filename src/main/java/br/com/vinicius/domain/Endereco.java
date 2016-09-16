package br.com.vinicius.domain;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

/**
 * Created by vinicius on 16/09/16.
 */
@Entity
public class Endereco {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Logradouro e obrigátorio")
    @Size(max = 50)
    private String logradouro;

    @NotEmpty(message = "Bairro e obrigátorio")
    @Size(max = 20)
    private String bairro;

    @NotEmpty(message = "Cidade e obrigátorio")
    @Size(max =20)
    private String cidade;

    @NotEmpty(message = "Estado e obrigátorio")
    @Size(max = 15)
    private String estado;

    @NotEmpty(message = "Complemento e obrigátorio")
    @Size(max = 15)
    private String complemento;

    @NotEmpty(message = "Cep e obrigátorio")
    @Size(max=15)
    private String cep;

    @Size(max=12)
    private String codigoIBGE;

    @Size(max=8)
    private int numero;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCodigoIBGE() {
        return codigoIBGE;
    }

    public void setCodigoIBGE(String codigoIBGE) {
        this.codigoIBGE = codigoIBGE;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Endereco() {
    }

    public Endereco(String logradouro, String bairro, String cidade, String estado, String complemento, String cep, String codigoIBGE, int numero) {
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.complemento = complemento;
        this.cep = cep;
        this.codigoIBGE = codigoIBGE;
        this.numero = numero;
    }
}

