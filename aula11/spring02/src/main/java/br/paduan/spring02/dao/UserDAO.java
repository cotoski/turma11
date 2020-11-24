package br.paduan.spring02.dao;

import org.springframework.data.repository.CrudRepository;

import br.paduan.spring02.model.User;

//CRUD = Create, Read, Update, Delete

public interface UserDAO extends CrudRepository<User, Integer> {
    public User findByEmail(String email);
}
