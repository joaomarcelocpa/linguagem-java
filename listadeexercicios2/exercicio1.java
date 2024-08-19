package listadeexercicios2;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int numero;
		
		numero = sc.nextInt();
		
		if (numero>=0) {
			
			System.out.println("NÚMERO POSITIVO");
		}
		else {
			System.out.println("NÚMERO NEGATIVO");
		}

	}
}
