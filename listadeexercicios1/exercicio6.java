package listadeexercicios1;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		float a, b, c;
		float areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo; 
		
		System.out.println("Entre com o valor de A:");
		a = sc.nextFloat();
		
		System.out.println("Entre com o valor de B:");
		b = sc.nextFloat();
		
		System.out.println("Entre com o valor de C:");
		c = sc.nextFloat();

		
		areaTriangulo = a * c / 2;
		System.out.println("Area do triangulo = " + areaTriangulo);
		
		areaCirculo = c * c * 3.1415f;
		System.out.println("Area do circulo = " + areaCirculo);
		
		areaTrapezio = (a+b) * c / 2;
		System.out.println("Area do trapezio = " + areaTrapezio);
		
		areaQuadrado = b * b;
		System.out.println("Area do quadrado = " + areaQuadrado);
		
		areaRetangulo = a * b;
		System.out.println("Area do retangulo = " + areaRetangulo);
	}

}
