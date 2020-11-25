function validaLogin(){

    let userTxt = localStorage.getItem("userLogged");

    if(!userTxt){
        window.location = "index.html";
    }

    let jsonUser = JSON.parse(userTxt);

    document.getElementById("user").innerHTML = `${jsonUser.nome} ( ${jsonUser.racf} )` ;
    document.getElementById("imgUser").innerHTML = `<img src ="${jsonUser.linkFoto}">`;
    
    obterAgencias();
}

function obterAgencias(){
    fetch("http://localhost:8080/agencia/all")
    .then(res => res.json())
    .then(result => preencheAgencias(result));
}

function preencheAgencias(resposta){
    console.log(resposta);
    let agencias = '';

    for (let index = 0; index < resposta.length; index++) {
        agencias = agencias + `<option value = ${resposta[index].id}> ${resposta[index].nome} </option>`;
    }

    document.getElementById("sel_agencias").innerHTML = agencias;
}

function preencheRespostaAgendamento(resposta) {
    console.log(resposta);
    let agendas = '<table class = "table table-sm"> <tr> <th>agencia</th> <th>cliente</th> <th>data</th> <th>hora</th> </tr>';

    for (let index = 0; index < resposta.length; index++) {
        agendas = agendas + `<tr> <td> ${resposta[index].agencia.nome} </td> 
                                  <td> ${resposta[index].nome} </td> 
                                  <td> ${resposta[index].dataAgendamento} </td>
                                  <td> ${resposta[index].horaAgendamento} </td> </tr>`;
    }

    agendas = agendas + '</table>';

    document.getElementById("tableResposta").innerHTML = agendas;
}