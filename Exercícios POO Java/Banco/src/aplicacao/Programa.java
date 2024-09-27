package aplicacao;

import java.util.Scanner;

import entidade.Conta;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o número da conta:");
		String numeroDaConta = sc.nextLine();
		
		System.out.println("Entre com o nome da titular:");
		String nome = sc.nextLine();
		
			double saldoInicial = 0.0;
		
		System.out.println("Possui deposito inicial: (sim/nao) ");
		String inicial = sc.nextLine();
		
		if (inicial.equalsIgnoreCase("sim")) {
			
			System.out.println("Entre com o depósito inicial:");
			saldoInicial = sc.nextDouble();
		}
		
		else {
			
			System.out.println("Valor inicial zerado");
		}
		
		Conta conta = new Conta(numeroDaConta, nome, saldoInicial);
		
		System.out.println("Conta criada com sucesso!");
		
		
		int x = 0;
		
		while (x != 5) {
		
			System.out.println("Entre com uma opção:");
            System.out.println("1 - Depósito");
            System.out.println("2 - Saque");
            System.out.println("3 - Consultar saldo");
            System.out.println("4 - Alterar nome");
            System.out.println("5 - Encerrar");
		
		 x = sc.nextInt();
		
		switch (x) {
		
		case 1: 
			System.out.println("Entre com o valor do depósito:");
			double deposito = sc.nextDouble();
			
			conta.depositarValor(deposito);
			
			System.out.println("Saldo atual: " + conta);
			break;
			
				
		case 2: 
			System.out.println("Entre com o valor do saque:");
			double saque = sc.nextDouble();
			
			conta.sacarValor(saque);
			
			System.out.println("Saldo atual: " + conta);
			break;
			
			
		case 3: 	
			System.out.println("Saldo atual: " + conta);
			
			break;
			
			
		case 4: 
			System.out.println("Digite o novo nome: ");
			nome = sc.next();
			conta.setNome(nome);
			System.out.println("Nome atualizado: " + conta.getNome());
			
			break;
			
		case 5: 
			System.out.println("Programa encerrado!");
		
			break;
			}
		}	
		
		sc.close();
	}
}



