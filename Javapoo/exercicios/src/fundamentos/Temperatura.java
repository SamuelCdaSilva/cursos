/*
 * Converter temperatura Fahrenheit para Celsius.
 */

package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		double tempF = 86;
		final double ajuste = 32;
		final double fator = 5/9.0;
		double res = (tempF - ajuste) * fator;
		System.out.println(" O Resultado é " + res + " °C"); // Para fazer a bolinha de graus "°", basta pressionar ALT + 0 + 1 + 7 + 6 e soltar o ALT.
		
		tempF = 17;
		res = (tempF - ajuste) * fator;
		System.out.println(" O Resultado é " + res + " °C");
	}
	
	/* - como eu faria:
		double tempF = 50;
		double res = (tempF - 32) * 5/9;
		System.out.println(" O Resultado é "+ res +" °C");
	*/
}