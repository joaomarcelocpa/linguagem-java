/* EXERCÍCIO 3 - CAP 8*/

package aplicacao;

import java.util.Scanner;

import entidade.Estudante;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Estudante estudante = new Estudante();
		
		System.out.println("Entre com o nome do aluno:");
		estudante.nome = sc.nextLine();
		
		System.out.println("Entre com a nota do primeiro trimestre:");
		estudante.nota1 = sc.nextDouble();
		
		System.out.println("Entre com a nota do segundo trimestre:");
		estudante.nota2 = sc.nextDouble();
		
		System.out.println("Entre com a nota do terceiro trimestre:");
		estudante.nota3 = sc.nextDouble();
		
		
		
		System.out.println("");
		
		System.out.println(estudante.calculoAprovacao());
		
		
		sc.close();
	}

}
