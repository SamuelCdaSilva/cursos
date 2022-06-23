let valores = [8, 1, 7, 4, 2, 9]
valores.sort()
console.log(valores)

/*

Primeiro modo de mostrar um vetor na tela:

console.log(valores[0])
console.log(valores[1])
console.log(valores[2])
console.log(valores[3])
console.log(valores[4])
console.log(valores[5])

*/


/*

Segundo modo de mostrar um vetor na tela:

for (let pos=0; pos < valores.length; pos++) {
    console.log('A posição '+pos+' tem o valor '+valores[pos])
}

*/


/*

Terceiro modo de mostrar um vetor na tela: (MANEIRA SIMPLIFICADA E ESTRUTURADA EXCLUSIVAMENTE PARA O FOR NESTA OCASIÃO EM VETORES!)

for (let pos in valores) {
    console.log('A posição '+pos+' tem o valor '+valores[pos])
}

*/
