package aplicacao;

import java.util.Scanner;

import entidade.Calculadora;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Entre com a cotação do dólar:");
		double cotacao = sc.nextDouble();
		
		
		System.out.println("Entre com o valor em dolares a ser comprado:");
		double quantidade = sc.nextDouble();
		
		
		System.out.printf("Valor a ser pago: %,2f%n", Calculadora.conversaoDolar(cotacao, quantidade));
		
		
		sc.close();
	}

}
