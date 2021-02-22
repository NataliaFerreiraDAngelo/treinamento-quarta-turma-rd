let campo = document.getElementById("input_id");

//CLICK
// campo.onclick = function() {
//     console.log("onclick");
// }
//CLICK
function funcaoClick() {
    console.log("click");
}
campo.addEventListener("click", funcaoClick)

campo.removeEventListener("click", funcaoClick)

function addToCart(elem) {
    
    elem.innerText = "Comprou";
}

function funcaoOnChange(elem) {
    let elemMsg = document.getElementById("msg-validacao");
    let qtd = elem.value.length;
    if (qtd < 3) {
        elemMsg.setAttribute("class", "error");
        elemMsg.innerText = "O campo de ter mais de 3 caracteres";
        return;
    } 
    elemMsg.setAttribute("class", "success");
    elemMsg.innerText = "Campo Validado";
}

// campo.addEventListener("change", function() {
//     console.log("mudou");
// })

// campo.onmouseover = function() {
//     console.log("onmouseover");
// }

// campo.addEventListener("mouseover", function() {
//     console.log("onmouseover");
// })

// campo.onmouseout = function() {
//     console.log("onmouseout");
// }

// campo.addEventListener("mouseout", function() {
//     console.log("onmouseout");
// })

// campo.onkeydown = function() {
//     console.log("digitou!!");
// }

// campo.addEventListener("keydown", function() {
//     console.log("digitou!!");
// })

document.querySelector("#link").addEventListener("click", function(event){
    event.preventDefault();
    alert("meu evento")

// o link não vai mais para o Google
});

campo.addEventListener('keypress', function(event) {
    let tecla = event.keyCode;
    if (tecla == 32) { 
        alert("Você apertou space!!");
    }
});