package listadeexercicios1;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int x, y, resultado;
		
		System.out.println("Entre com dois números:");
		
		x = sc.nextInt();
		y = sc.nextInt(); 
		
		
		resultado = x + y;
		
		System.out.println("SOMA = " + resultado);
		

	}

}
