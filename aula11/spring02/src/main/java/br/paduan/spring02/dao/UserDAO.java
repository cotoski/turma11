package br.paduan.spring02.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.paduan.spring02.model.User;

//CRUD = Create, Read, Update, Delete

public interface UserDAO extends CrudRepository<User, Integer> {
    public User findByEmail(String email);
    public User findByEmailAndSenha(String email, String senha); 
    public User findByEmailOrCpf(String email, String cpf);
      

    @Query(value = "Select new User(u.nome, u.email) from User u where u.cod = :cod")
    public User buscaPorId(@Param("cod") Integer codigo);
}
