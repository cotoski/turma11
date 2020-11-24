package br.paduan.spring02.dto;

import br.paduan.spring02.model.User;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserDto {
    private String nome;
    private String email;

    public UserDto(User user) {
        this.nome = user.getNome();
        this.email = user.getEmail();
    }

}
