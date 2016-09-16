package br.com.vinicius.domain;

import br.com.vinicius.enums.TipoSanguineo;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by vinicius on 12/09/16.
 */
@Entity
public class Doador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 15 , message = "Nome so pode ter 15 letras")
    @JsonInclude(Include.NON_NULL)
    @NotEmpty(message = "Nome e obrigátorio")
    private String nome;

    @JsonInclude(Include.NON_NULL)
    @Size(max = 30 , message = "Sonbre Nome so pode ter 15 letras")
    @NotEmpty(message = "Nome e obrigátorio")
    private String sobreNome;

    @JsonInclude(Include.NON_NULL)
    @Enumerated(EnumType.STRING)
    private TipoSanguineo tipoSangue;

    @JsonInclude(Include.NON_NULL)
    @Email(message = "Email invalido informe um valido")
    @NotEmpty(message = "Email e obriǵatorio")
    private String email;

    @JsonInclude(Include.NON_NULL)
    @CPF(message = "CPF invalido informe um valido")
    @NotEmpty(message = "CPF e obrigátorio")
    private String cpf;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @JsonInclude(Include.NON_NULL)
    @NotNull(message = "Date de nascimento é obrigatória")
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;

    @JsonInclude(Include.NON_NULL)
    @Size(min = 1 , max = 80)
    @NotEmpty(message = "Idade e obrigátoria")
    private int idade;

    @JsonInclude(Include.NON_NULL)
    @ManyToOne
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public TipoSanguineo getTipoSangue() {
        return tipoSangue;
    }

    public void setTipoSangue(TipoSanguineo tipoSangue) {
        this.tipoSangue = tipoSangue;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


    public Doador() {


    }
}

