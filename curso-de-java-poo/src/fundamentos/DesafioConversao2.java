package fundamentos;

import java.util.Scanner;
public class DesafioConversao2 {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um valor? ");
        String valor1 = leitura.nextLine().replace(",", ".");

        System.out.println("Digite um valor? ");
        String valor2 = leitura.nextLine().replace(",", ".");

        System.out.println("Digite um valor? ");
        String valor3 = leitura.nextLine().replace(",", ".");

        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor3);

        double media = (salario1 + salario2 + salario3) / 3;

        System.out.println("A média dos salários é " + media);

        leitura.close();
    }
}
