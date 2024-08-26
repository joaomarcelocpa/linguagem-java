package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import util.Calculadora;

public class Programa {
	

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		double raio;
		
		System.out.printf("Entre com valor do raio:");
		raio = sc.nextDouble();
		
		
		double c = Calculadora.circunferencia(raio);
		
		double v = Calculadora.volume(raio);
		
		System.out.printf("Circunferência: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Pi: %.2f%n", Calculadora.pi);
		
		
		sc.close();
	}

}
