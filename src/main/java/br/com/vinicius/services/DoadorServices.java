package br.com.vinicius.services;

import br.com.vinicius.domain.Doador;
import br.com.vinicius.exceptions.NaoEncontradoException;
import br.com.vinicius.repository.DoadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by vinicius on 12/09/16.
 */

@Service
public class DoadorServices {

    @Autowired
    private DoadorRepository dao;


    public Doador salvar(Doador doador){
        doador.setId(null);
        return dao.save(doador);
    }

    public void deletar(Long id){

        try{dao.delete(id);}
        catch (EmptyResultDataAccessException e )
        {throw new NaoEncontradoException("O dodador nao pode ser encontrado");}

    }

    public void atualizar(Doador doador){
        verificarExistencia(doador);
        dao.save(doador);
    }

    public Doador buscar(Long id){
        Doador doar = dao.findOne(id);
        if (doar == null){throw new NaoEncontradoException("O dodador nao pode ser encontrado");}
        return doar;
    }

    public void verificarExistencia(Doador doador){buscar(doador.getId());}

    public List<Doador> listar(){return dao.findAll();}
}

