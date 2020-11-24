package br.paduan.spring02.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "anuncio")
@Getter @Setter
public class Anuncio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "descricao", length = 200, nullable = false)
    private String descricao;

    @Column(name = "valor", nullable = false)
    private double valor;

    @ManyToOne
    @JoinColumn(name = "cod_user")
    @JsonIgnoreProperties("anuncios")
    private User usuario;
}
