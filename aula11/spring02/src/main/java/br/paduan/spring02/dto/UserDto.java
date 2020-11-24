package br.paduan.spring02.dto;

import br.paduan.spring02.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class UserDto {
    private String nome;
    private String email;
    private String cpf;

    public UserDto(User user) {
        this.nome = user.getNome();
        this.email = user.getEmail();
        this.cpf = user.getCpf();
    }

}
