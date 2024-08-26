package aplicacao;

import java.util.Scanner;

import entidade.Calculo;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Calculo retangulo = new Calculo();
		
		System.out.println("Entre com o valor da largura:");
		retangulo.largura = sc.nextDouble();
		
		
		System.out.println("Entre com o valor da altura:");
		retangulo.altura = sc.nextDouble();
		
		System.out.printf("ÁREA = %.2f%n", retangulo.area());
		System.out.printf("PERÍMETRO = %.2f%n", retangulo.perimetro());
		System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonal());
		
		
		sc.close();
	}

}