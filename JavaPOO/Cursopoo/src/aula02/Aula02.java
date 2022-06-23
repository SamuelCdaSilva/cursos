package aula02;

public class Aula02 {
    public static void main(String[] args) {

        // Primeira Caneta
        // Instânciamento
        Caneta c1 =  new Caneta();
        
        // Chamada de atributos
        c1.modelo = "BIC";
        c1.cor = "Azul";
        c1.ponta = 0.5;
        c1.carga = 100;

        // Chamada de métodos
        c1.tampar();
        c1.status();
        c1.rabiscar();

        // Segunda Caneta
        // Instânciamento
        Caneta c2 = new Caneta();

        // Chamada de atributos
        c2.modelo = "Pilot";
        c2.cor = "Preta";
        c2.ponta = 0.25;
        c2.carga = 100;

        // Chamada de métodos
        c2.destampar();
        c2.status();
        c2.rabiscar();


    }
}
