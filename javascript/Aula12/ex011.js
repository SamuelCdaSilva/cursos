var idade = 67
console.log(`Você tem ${idade} anos.`)
if (idade < 16) {
    console.log('não pode votar')
} else if (idade < 18 || idade > 65) {
    console.log('voto opcional')
} else  { 
    console.log('Voto obrigatório')
} 

