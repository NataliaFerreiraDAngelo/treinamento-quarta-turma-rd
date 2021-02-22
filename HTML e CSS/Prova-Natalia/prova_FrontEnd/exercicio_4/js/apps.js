let crm = document.getElementById("input-crm");
let medico = document.getElementById("input-medico");
let caixas = document.getElementById("input-caixas");
let nome = document.getElementById("input-nome");
let cpf = document.getElementById("input-cpf");
let regexCpf = /^([0-9]{3}\.?[0-9]{3}\.?[0-9]{3}\-?[0-9]{2}|[0-9]{2}\.?[0-9]{3}\.?[0-9]{3}\/?[0-9]{4}\-?[0-9]{2})$/;


crm.onblur = function() {
    let valor = crm.value
    if (valor.length == 0) {
        document.querySelector(".alert-crm").style.display = "block"
        return;
    };
    document.querySelector(".alert-crm").style.display = "none"
}

medico.onblur = function() {
    let valor = medico.value
    if (valor.length == 0) {
        document.querySelector(".alert-medico").style.display = "block"
        return;
    };
    document.querySelector(".alert-medico").style.display = "none"
}

caixas.onblur = function() {
    let valor = caixas.value
    if (valor.length == 0) {
        document.querySelector(".alert-caixas").style.display = "block"
        return;
    };
    document.querySelector(".alert-caixas").style.display = "none"
}


nome.onblur = function() {
    let valor = nome.value
    if (valor.length == 0) {
        document.querySelector(".alert-nome").style.display = "block"
        return;
    };
    document.querySelector(".alert-nome").style.display = "none"
}

cpf.onblur = function() {
    if (!regexCpf.test(this.value)) {
        document.querySelector(".alert-cpf").style.display = "block";
        return;
    };
    document.querySelector(".alert-cpf").style.display = "none";
};


$(document).ready(function(){
    $('#input-crm').mask('00000000-0');
});

$(document).ready(function(){
    $('#input-cpf').mask('000.000.000-00');
});
