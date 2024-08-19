package listadeexercicios2;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2;
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		if (n1 % n2 == 0) {
			System.out.println("São múltiplos");
		}
		else {
			System.out.println("Não são múltiplos");
		}
	}
}

