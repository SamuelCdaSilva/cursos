function carregar() { 
    var msg = window.document.getElementById('msg')
    var img = window.document.getElementById('imagem')
    var data = new Date()
    var hora = data.getHours()
    msg.innerHTML = 'Agora são ' +hora+ ' horas.'
    if (hora >= 0 && hora <= 12) {
        img.src = 'imagens014/Manhã (menor).png'
        window.document.body.style.background = '#d1d0bc'
    } else if (hora > 12 && hora <= 19) {
        img.src = 'imagens014/Tarde (menor).png'
        window.document.body.style.background = '#c27654'
    } else if (hora >= 20 && hora < 24) {
        img.src = 'imagens014/Noite (menor).png'
        window.document.body.style.background = '#161c2c'
    } else if (hora > 24) {
        msg.innerText = 'BURROOOOOOOO!'
    }

    } //CHAVE DE FINALIZAÇÃO

    