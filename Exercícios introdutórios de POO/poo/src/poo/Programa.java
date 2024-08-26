package poo;

import java.util.Scanner;
import entities.Triângulo;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triângulo x, y;
		
		x = new Triângulo();
		y = new Triângulo();
		
		System.out.println("Entre com as medidas do triângulo x: ");
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Entre com as medidas do triângulo y: ");
		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Área do triângulo X: %.4f%n", areaX);
		System.out.printf("Área do triângulo Y: %.4f%n", areaY);
		
		sc.close();
	}
}
