$(document).ready(function(){
    $(".owl-carousel").owlCarousel({
        loop:true,
        margin:10,
        autoWidth: true,
        nav: true
    });
  });


let menu = document.querySelectorAll(".menu");
let qtd = menu.length;
for (let i = 1; i < qtd; i++) {
    menu[i].innerHTML = "Item nav " + [i];
}


