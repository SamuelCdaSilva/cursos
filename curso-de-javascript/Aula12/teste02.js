var agora = new Date ()
var hora = agora.getHours()
if (hora <= 6 && hora >= 0) {
    console.log ('Boa madrugada meuu!!')
} else if (hora >= 7 && hora <= 11) {
    console.log ('Bom diaaa rapaizzz!!')
} else if (hora == 12) { 
    console.log ('AlMOÇOOOOOOOOO!')
} else if (hora >= 13 && hora <= 18) {
    console.log ('Boa tarde malandroo!!')
} else if (hora >= 19 && hora <= 23) {
    console.log ('Boa noite fiote!!!')
}