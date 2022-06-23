function contar() {

    var ini = window.document.getElementById('txti')
    var fim = window.document.getElementById('txtf')
    var passo = window.document.getElementById('txtp')
    var res = window.document.getElementById('res')

    var i = Number(ini.value)
    var f = Number(fim.value)
    var p = Number(passo.value)

    //var fi = Number(ini.value) 
    //var ff = Number(fim.value) 
    //var fp = Number(passo.value)

        if (ini.value.length == 0 || fim.value.leght == 0 || passo.value.length == 0) { // leght- é o comprimento dos elementos dentro do input, quantidade de caracteres.
            window.alert('ERRO - Por favor preencha todos os campos!')
            res.innerHTML = ('Impossível contar!')    
        } if (p <= 0 ) {
            p = 1
            window.alert('Passo inválido! Você não pode partir do passo 0, pois deste modo você não chegará no fim desejado.')
        } else {
            res.innerHTML = ('Contando...<br>' )
            if (i < f) {
                // Contagem crescente
                for(var c = i; c <= f; c += p) {
                    res.innerHTML += c+" \u{1F606} " 
                }    
            } else {
                // Contagem regressiva
                for(var c = i; c >= f; c -= p) {
                    res.innerHTML += c+" \u{1F606} "     
                }
            }
            res.innerHTML += '\u{1F3C1}'
        } /* FINAL DO PRIMEIRO ELSE */
} /* FIM DA FUNCTION */