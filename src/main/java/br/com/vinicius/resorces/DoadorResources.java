package br.com.vinicius.resorces;

import br.com.vinicius.domain.Doador;
import br.com.vinicius.services.DoadorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jersey.JerseyProperties;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by vinicius on 12/09/16.
 */

@RestController
@RequestMapping("/doador")
public class DoadorResources {

    @Autowired
    private DoadorServices services;

    @CrossOrigin
    @RequestMapping(value = "/listar",method = RequestMethod.GET)
    public ResponseEntity<List<Doador>> listar(){
        return ResponseEntity.status(HttpStatus.OK).body(services.listar());
    }

    @RequestMapping(value = "/salvar",method = RequestMethod.POST)
    public ResponseEntity<Void> salvar(@Valid @RequestBody Doador doador){
        doador = services.salvar(doador);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(doador.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @RequestMapping(value = "/apagar/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<Void> deletar(@PathVariable("id") Long id){
        services.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/atualizar/{id}",method = RequestMethod.PUT)
    public ResponseEntity<Void> atualizar(@RequestBody Doador doador, @PathVariable Long id){
        doador.setId(id);
        services.atualizar(doador);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/buscarId/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> buscarPorId(@PathVariable("id") Long id){
        Doador doador = services.buscar(id);
        services.atualizar(doador);
        CacheControl cacheControl = CacheControl.maxAge(20, TimeUnit.SECONDS);
        return ResponseEntity.status(HttpStatus.OK).cacheControl(cacheControl).body(doador);
    }





}

