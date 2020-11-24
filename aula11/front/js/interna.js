function validaLogin(params) {
    let usetTxt = localStorage.getItem("userLogged");

    if(!usetTxt){
        window.location = "index.html";
    }
}

function logout() {
    localStorage.removeItem("userLogged");
    window.location = "index.html";
}