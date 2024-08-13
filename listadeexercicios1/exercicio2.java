package listadeexercicios1;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 

		float raio, resultado;
		float pi = 3.1415f;
		
		System.out.println("Entre com o valor do raio do círculo:");
		
		raio = sc.nextFloat();
		
		resultado = pi * raio * raio ;
		
		System.out.println("Resultado = " + resultado);
		
		sc.close();
		
	}
}