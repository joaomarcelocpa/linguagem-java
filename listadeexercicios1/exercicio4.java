package listadeexercicios1;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int codigo, nhora, vhora, salario;
		
		System.out.println("Entre com o codigo do funcionario:");
		codigo = sc.nextInt();
		
		System.out.println("Entre com o valor da hora do funcionario:");
		nhora = sc.nextInt();
		
		System.out.println("Entre com o numero de horas mensais trabalhadas:");
		vhora = sc.nextInt();
		
		
		salario = nhora * vhora;
		
		System.out.printf("Número: %d Salário: $ %d,00", codigo, salario);

	}
}
