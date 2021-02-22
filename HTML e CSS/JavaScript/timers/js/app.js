function getElem(selector) {
    return document.querySelector(selector);
}

let btnIr = getElem(".btn-ir-down");
let msgAguarde = getElem(".aguarde");
let btnDownload = getElem(".btn-down");
let segundoElem = getElem(".segundos");
let segundos = segundoElem.innerText;


btnIr.addEventListener("click", function() {
    this.style.display = "none";
    msgAguarde.style.display = "block";
    segundos--;
    let intervalo = setInterval(function() {
        segundoElem.innerText = segundos--;
        if (segundos < 0) {
            clearInterval(intervalo);          
            msgAguarde.style.display = "none";
            btnDownload.style.display = "inline-block";
        }
    }, 1000);
})