package br.paduan.spring02.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity  // esta classe será aramzenada no BD
@Table(name = "user") // nome da tabela no BD
@Getter @Setter @NoArgsConstructor
public class User {

    @Id // esta campo é chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 1, 2, 3, 4...
    @Column(name = "codigo")
    private int cod;

    @Column(name = "nome", length = 150, nullable = false)
    private String nome;

    @Column(name = "email", length = 100, nullable = false, unique = true)
    private String email;

    @Column(name="cpf", length = 11, nullable = false, unique = true)
    private String cpf;

    @Column(name = "senha", length = 30, nullable = false)
    private String senha;
    
    @OneToMany(mappedBy = "usuario")
    @JsonIgnoreProperties("usuario")
    private List<Anuncio> anuncios;

    public User(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

}
