package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {		
		double raio = 3.4;
		final double PI = 3.14159; // uma constante em java -> final antes do tipo.
// constante sempre em mai�sculo!
		
		double area = PI * raio * raio;
		
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("�rea = " + area + "m2.");
	}
}
