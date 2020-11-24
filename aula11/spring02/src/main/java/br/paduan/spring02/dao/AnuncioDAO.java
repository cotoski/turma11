package br.paduan.spring02.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.paduan.spring02.model.Anuncio;

public interface AnuncioDAO extends CrudRepository<Anuncio, Integer>{
    public List<Anuncio> findByValorGreaterThan(double valor);
}
