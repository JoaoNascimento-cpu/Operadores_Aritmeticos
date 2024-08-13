package pacote1;

public class OperadoresAritmeticos {
	
	public static void main (String args[]) {
		
		operacoesAtribuicoes();
		operacoesAritmeticas();
		operacoesIncrementoDecremento();
		operadoresRelacionais();
		operacoesLogicas();
	}	
		
	private static void operacoesLogicas() {
		System.out.println("====Operaçoes Lógicas====");
		
		int num1 = 10;
		int num2 = 10;
		
		boolean estaDentro10 = num1 >= 1 && num1 <= 10; 
		System.out.println("É maior ou igual a 10:" + estaDentro10);
		
		boolean estaDentro_10 = num1 >= 1 || num1 <= 10; 
		System.out.println("É maior ou igual a 10:" + estaDentro_10);
		
		boolean naoEstaDentro_10 = num1 >= 1 || num1 <= 10; 
		System.out.println("naoEstaDentro_10:" + !estaDentro_10);
		
	}

	private static void operadoresRelacionais() {
		System.out.println("====Operações relacionais====");
		int num1 = 10;
		int num2 = 10;	
		
		boolean eMaior = num1 > num2;
		System.out.println("É maior:" + eMaior);
		
		boolean eIgual = num1 == num2;
		System.out.println("É maior:" + eIgual);
		
		boolean eDiferente = num1 != num2;
		System.out.println("É diferente:" + eDiferente);
		
		boolean eMaiorIgual = num1 >= num2;
		System.out.println("É Maior ou igual:" + eMaiorIgual);
		
		boolean estaDentro10 = num1 >= 1 && num1 <= 10; 
		System.out.println("É maior ou igual a 10:" + estaDentro10);
		
		boolean estaDentro_10 = num1 >= 1 || num1 <= 10; 
		System.out.println("É maior ou igual a 10:" + estaDentro_10);
		
		boolean naoEstaDentro_10 = num1 >= 1 || num1 <= 10; 
		System.out.println("naoEstaDentro_10:" + !estaDentro_10);
		
	}

	private static void operacoesIncrementoDecremento() {
		System.out.println("====Operações de incremento e decremento====");
		int num1 = 10;
		int num2 = 10;
		System.out.println(num1);
		num1++;
		System.out.println(num1);
		
		num1--;
		System.out.println(num1);
		
	}

	private static void operacoesAtribuicoes() {
		System.out.println("====Operações de atribuições====");
		int num1 = 10;
		int num2 = 10;
		int num3 = num1 + num2;
		System.out.println(num3);
		num3 += num3;
		System.out.println(num3);
		
	}

	public static void operacoesAritmeticas() {
		System.out.println("====Operações Aritmeticas====");
		int num1 = 10;
		int num2 = 20;
		
		int num3 = num1 + num2;
		int num4 = num1 * num2;
		int num5 = num3 * num4;
		
		System.out.println(num5);
	}
}
