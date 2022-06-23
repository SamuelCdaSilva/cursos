let a = 7;
let b = 94;

// Variável já criada, se colocar o let (ou var) vou estar criando outra variável. Aqui estou pegando duas variáveis existentes e modificando-as!

a = 94; 
b = 7;

console.log(a);
console.log(b);

/*
    Modos como o professor mostrou:

    let temp = a; 
    a = b;
    b = temp;


    [a, b] = [b, a]
*/