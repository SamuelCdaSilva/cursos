package fundamentos;

public class PrimitivoVsObjeto {

	public static void main(String[] args) {
		
		String s = new String("texto");
		s.toUpperCase();
		 
		// Wrappers são a versão objeto dos tipos primitivos!

		// TUDO EM JAVA É OBJETO, MENOS OS TIPOS PRIMITIVOS.
		int a = 123;
		System.out.println(a);
	}
}