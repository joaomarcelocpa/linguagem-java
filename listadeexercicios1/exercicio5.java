package listadeexercicios1;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int codigo1, codigo2, npecas1, npecas2, preco1, preco2, total;
		
		System.out.println("Entre com o codigo da peça 1:");
		codigo1 = sc.nextInt();
		
		System.out.println("Entre com o numeros de peças 1:");
		npecas1 = sc.nextInt();
		
		System.out.println("Entre com o preço da peça 1:");
		preco1 = sc.nextInt();
		
		System.out.println("Entre com o codigo da peça 2:");
		codigo2 = sc.nextInt();
		
		System.out.println("Entre com o numeros de peças 2:");
		npecas2 = sc.nextInt();
		
		System.out.println("Entre com o preço da peça 2:");
		preco2 = sc.nextInt();
		
		total = preco1 + preco2;
		
		
		System.out.println("Total a pagar = $" + total);

	}

}
