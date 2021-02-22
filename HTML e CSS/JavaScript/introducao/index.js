var titulo = document.getElementById("alterar");

titulo.style.color = "blue";

titulo.innerHTML = "Boa Tarde !!!!";

function createButton(){
    let btn = document.createElement("BUTTON");
    btn.setAttribute("class", "createButton");
    btn.innerHTML =  "Botão";
    document.body.appendChild(btn);
}


