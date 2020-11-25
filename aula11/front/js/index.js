function validarLogin(event) {
    event.preventDefault(); // evita o comportamento padrão, enviar o formulário com os dados

    let txtUser = document.getElementById("inputUser").value;
    let txtSenha = document.getElementById("inputPassord").value;

    let loginMsg = {
        email: txtUser,
        cpf: txtUser,
        senha: txtSenha
    }


    let msg = {
        method: 'POST',
        body: JSON.stringify(loginMsg),
        headers: {
            'Content-type': 'application/json'
        }
    }

    fetch("http://localhost:8080/user/login", msg) //mande para o servidor
        .then(res => tratarRetorno(res)) // qdo voltar a resposta, aciona o 'tratarRetorno'
}

function tratarRetorno(retorno) {
    if (retorno.status == 200) { //sucesso
        document.getElementById("msgRetorno").innerHTML = "Login com sucesso!";
        retorno.json().then(res => fazerLogin(res));
    } else { //falha
        document.getElementById("msgRetorno").innerHTML = "Falha no Login!";
    }
}

function fazerLogin(user) {
    // document.getElementById("divUser").innerHTML = "<b>" + user.nome + "</b> (" + user.email + ")";

    localStorage.setItem("userLogged", JSON.stringify(user));
    window.location = "interna.html";
}