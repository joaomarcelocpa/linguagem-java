package aplicacao;

import java.util.Scanner;

import entidade.Produto;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Entre com o número de elementos:");
		int n = sc.nextInt();
		
		Produto[] vetor = new Produto[n];
		
		double soma = 0;
		
		for (int i = 0; i<n; i++ ) {
			
			System.out.println("Entre com o nome:");
			String nome = sc.next();
			
			System.out.println("Entre com o preco:");
			double preco = sc.nextDouble();
			
			vetor[i] = new Produto(nome, preco); // INSTANCIA O VETOR
			
			soma += vetor[i].getPreco(); // FAÇA A SOMA DAS POSIÇÕES DO VETOR
		}
			
		
			double media = Produto.mediaPrecos(soma, n); // CHAMA O MÉTODO QUE CALCULA A MÉDIA
					
			System.out.printf("Média dos preços: %.2f%n", media);
		
		
			sc.close();
	}	
}
