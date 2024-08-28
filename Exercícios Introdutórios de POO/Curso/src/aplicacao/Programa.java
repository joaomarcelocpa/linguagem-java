/* EXEMPLO DA AULA*/

package aplicacao;

import java.util.Scanner;
import entidade.Triangulo;


public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Entre com as medidas do triangulo x:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Entre com as medidas do triangulo y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
			
		double areaX = x.calcularArea();
		double areaY = y.calcularArea();
		
		
		System.out.printf("Area do triangulo X: %.2f%n", areaX);
		System.out.printf("Area do triangulo Y: %.2f%n", areaY);
		
		sc.close();
	}
}