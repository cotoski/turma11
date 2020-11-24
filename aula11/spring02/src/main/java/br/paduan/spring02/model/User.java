package br.paduan.spring02.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity  // esta classe será aramzenada no BD
@Table(name = "user") // nome da tabela no BD
@Getter @Setter
public class User {

    @Id // esta campo é chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 1, 2, 3, 4...
    @Column(name = "codigo")
    private int cod;

    @Column(name = "nome", length = 150, nullable = false)
    private String nome;

    @Column(name = "email", length = 100, nullable = false, unique = true)
    private String email;

    @Column(name = "senha", length = 30, nullable = false)
    private String senha;
    
}
