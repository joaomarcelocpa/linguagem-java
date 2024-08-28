/* EXERCÍCIO 1 - CAP 8*/

package aplicacao;

import java.util.Scanner;

import entidade.Calculo;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Calculo calculo = new Calculo();
		
		
		System.out.println("Entre com as medidas de altura e largura:");
		calculo.altura = sc.nextDouble();
		calculo.largura = sc.nextDouble();
		
		
		System.out.println("Área do retângulo: " + calculo.calcularArea());
		System.out.println("Perímetro do retângulo: " + calculo.calcularPerimetro());
		System.out.println("Diagonal do retângulo: " + calculo.calcularDiagonal());
		
		
		
		sc.close();
	}
}
