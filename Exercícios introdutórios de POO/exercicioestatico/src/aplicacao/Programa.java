package aplicacao;

import java.util.Scanner;
import entidade.Calculadora;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre com a cotação do dolar:");
		double cotacao = sc.nextDouble();
		
		System.out.println("Entre com o valor a ser comprado:");
		double valor = sc.nextDouble();
		
		
		double convertido = Calculadora.conversao(valor, cotacao);
		
		double resultado = Calculadora.imposto(convertido);
		
		
		System.out.printf("Valor final: %.2f%n", resultado);
		
		
		sc.close();

	}
}