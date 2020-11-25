function validaLogin(params) {
    let userTxt = localStorage.getItem("userLogged");

    if(!userTxt){
        window.location = "index.html";
    }

    let user = JSON.parse(userTxt);

    document.getElementById("dadosUser").innerHTML = `<b> ${user.nome} </b> ( ${user.email} )`;
}

function logout() {
    localStorage.removeItem("userLogged");
    window.location = "index.html";
}