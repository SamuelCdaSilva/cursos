package fundamentos;


public class TipoString {

    public static void main(String[] args) {
        System.out.println("Ola Pessoal".charAt(7));
        String s = "Boa Tarde"; // String é um objeto imutável!
        s = s.toUpperCase();
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("BOA"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.endsWith("TARDE"));
        System.out.println(s.length());
        System.out.println(s.equals("BOA TARDE"));
        System.out.println(s.equalsIgnoreCase("bOa tArDe"));

        var nome = "Samuel";
        var sobrenome = "cardoso";
        var idade = 19;
        var salario = 100.00;

        String maisUmaFrase = "\n\nNome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario;
        System.out.println(maisUmaFrase);

        System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario);

        System.out.printf("\n\nO Senhor %s %s, tem %d anos de idade e recebe do trabalho R$%.2f", nome, sobrenome, idade, salario); // igual na linguagem C

        String frase = String.format("\n\nO Senhor %s %s, tem %d anos de idade e recebe do trabalho R$%.2f\n", nome, sobrenome, idade, salario);
        System.out.println(frase);

        System.out.println("Frase Qualquer".contains("Qual"));
        System.out.println("Frase Qualquer".indexOf("Qual"));
        System.out.println("Frase Qualquer".substring(6)); // não inclui o caracter 6
        System.out.println("Frase Qualquer".substring(6, 10)); // não inclui o caracter 6 e 10
    }
}
