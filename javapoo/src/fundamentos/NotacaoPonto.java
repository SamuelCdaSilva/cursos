package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		double Bola = 2.3;
	/* S - sempre ma�usculo */	
		String s = "Bom dia X";
		s = s.toUpperCase();
		s = s.replace("X", "Senhora");
		s = s.concat("!!!");
				
		System.out.println(s);
		
		System.out.println("samuel".toUpperCase());
					/* ou */
		String x = "samuel".toUpperCase();
		System.out.println(x);
		
		String y =  "Bom dia X"
				.replace("X", "Samukael")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		// Tipos primitivos n�o tem o operador "."
		
		int A = 3;
		System.out.println(A);
	}
	
}
