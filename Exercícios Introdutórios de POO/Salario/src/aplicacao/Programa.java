/* EXERCÍCIO 2 - CAP 8*/

package aplicacao;

import java.util.Scanner;
import entidade.Calculo;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Calculo calculo = new Calculo();
		
		System.out.println("Entre com o nome do funcionário:");
		calculo.nome = sc.nextLine();
		
		System.out.println("Entre com o salario do funcionário:");
		calculo.salario = sc.nextDouble();
		
		System.out.println("Entre com o imposto do salario do funcionário:");
		calculo.imposto = sc.nextDouble();
		
		
		System.out.println("Funcionário: " + calculo.nome + ", $ " + calculo.taxacaoSalario());
		
		System.out.println("Qual a porcentagem de aumento do salario bruto?");
		calculo.taxa = sc.nextDouble();
		
		System.out.printf("Atualização dos dados do funcionário: " + calculo.nome + ", $ " + calculo.aumentoSalario());
		
		
		sc.close();
	}

}