package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o número de elementos do vetor:");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for (int i=0; i<n; i++) {
			
			System.out.printf("Entre com o %d número:", i+1);
			vetor[i] = sc.nextDouble();
			
			
		}
			
			System.out.println("Números negativos:");
			
		for (int i=0; i<n; i++) {
			
			
			if (vetor[i]<0) {
				
				System.out.println(vetor[i]);
				
			}
		}			
		
		sc.close();
	}
}
