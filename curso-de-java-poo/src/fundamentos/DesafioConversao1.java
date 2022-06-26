package fundamentos;

import java.util.Locale;
import javax.swing.*;
//import java.util.Scanner;

public class DesafioConversao1 {

    public static void main(String[] args) {

        Locale.setDefault(new Locale("pt", "BR"));
        String valor1 = JOptionPane.showInputDialog("Digite um valor: ");
        String valor2 = JOptionPane.showInputDialog("Digite outro número: ");
        String valor3 = JOptionPane.showInputDialog("Digite outro número: ");

        double Salario1 = Double.parseDouble(valor1);
        double Salario2 = Double.parseDouble(valor2);
        double Salario3 = Double.parseDouble(valor3);

        double soma = Salario1 + Salario2 + Salario3;
        double media = soma/3;

        System.out.println("A média é: " + media);

    }


}
