package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {  // O JAVA N�O ANALISA O VALOR E SIM O TIPO.
		// Informa��es do funcion�rio.
		
		// Tipos num�ricos inteiros. 
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;	
				
		// Tipos num�ricos reais. 
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano.
		boolean estaDeFerias = false; // True
		
		// Tipo caractere.
		char status = 'A'; // Ativo
		
		// Dias de empresa do funcion�rio.
		System.out.println(anosDeEmpresa * 365);
		
		// N�mero de viagens.
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real.
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("F�rias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}
