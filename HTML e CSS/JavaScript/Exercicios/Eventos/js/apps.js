//Exercício 2
let botao = document.getElementById("btn");

botao.onclick = function(){
    alert("Olá");
};

//Exercício 3
let fundoVerde = document.getElementById("verde");

fundoVerde.onclick = function(){
    let tela = document.getElementById("tela");
    tela.style.backgroundColor = "green";
};

//Exercício 4
let textoImagem = document.getElementById("imagem");

textoImagem.onmouseover = function(){
    console.log("estou vendo a imagem")
};

//Exercício 5
let clickImagem = document.getElementById("imagemClick");

clickImagem.addEventListener("click", function(){
    console.log("estou clicando na imagem")
});

//Exercício 6
let clickTela = document.getElementById("tela");

function clicarHtml() {
   clickTela.style.backgroundColor = "red";
}

clickTela.addEventListener("click", clicarHtml);

//Exercício 7
clickTela.removeEventListener("click", clicarHtml);

//Exercício 8