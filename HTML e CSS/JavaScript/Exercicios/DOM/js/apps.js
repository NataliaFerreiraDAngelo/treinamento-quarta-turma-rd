// Exercício 1
let paragrafo = document.getElementById("demo");
paragrafo.innerText = "Olá";

// Exercício 2
document.getElementsByTagName("P")[0].innerHTML = "Hello World!";

//Exercício 3
let teste = document.querySelector(".test");
teste.innerHTML = "testando";

//Exercício 4
let img = document.getElementById("image");
img.setAttribute("src", "estudar.jpg");

//Exercício 5
let valor = document.getElementById("myText");
valor.setAttribute("value", "Bem Vindo");

//Exercício 6
let vermelho = document.getElementById("demo2");
vermelho.style.color = 'red';

//Exercício 7
let fonte = document.getElementById("demo3");
fonte.style.fontSize = '40px';

//Exercício 8
let esconder = document.getElementById("demo4");
esconder.style.display = 'none';