package listadeexercicios2;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o código e a quantidade do produto:");
		
		int codigo = sc.nextInt();
		double quantidade = sc.nextDouble();
		
		double preco = 0;
		
		if (codigo == 1) {
			
			preco = quantidade * 4;			
		}
		
		else if (codigo == 2) {			
			preco = quantidade * 4.5;

		}
		
		else if (codigo == 3) {
			
			preco = quantidade * 5;
		
		}
		
		else if (codigo == 4) {	
			preco = quantidade * 2;	
		}
		
		else if (codigo == 5) {	
			preco = quantidade * 1.5;	
		}
		
		System.out.printf("Valor da conta: R$ %.2f", preco);
		
		sc.close();
	} 
}
