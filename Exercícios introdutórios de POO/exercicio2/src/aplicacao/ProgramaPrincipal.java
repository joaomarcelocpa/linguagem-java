package aplicacao;

import java.util.Scanner;

import entidade.Salario;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Salario aumento = new Salario();
		
		System.out.println("Entre com o nome do funcionário");
		aumento.nome = sc.nextLine();
		
		System.out.println("Entre com o salario do funcionário");
		aumento.salario = sc.nextDouble();
		
		System.out.println("Entre com a taxação do salario");
		aumento.taxa = sc.nextDouble();
		
		
		System.out.println(aumento.nome + ", $" + aumento.reducaoSalario());
		
		
		System.out.println("Entre com o aumento do salario");
		aumento.porcentagem = sc.nextDouble();
		
		System.out.printf(aumento.nome + ", " + " $ %.2f%n", aumento.aumentoSalario());
		
	
		sc.close();
	}

}
