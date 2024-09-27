package ClasseBanco;

import java.util.Scanner;

public class Conta {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre com o código da conta:");
        String codigo = sc.next();
        
        System.out.println("Entre com o cpf da conta:");
        String cpf = sc.next();
        
        
        System.out.println("Conta criada com sucesso!");
        
        Programa p = new Programa(codigo, cpf, 0.0);
        
        int x = 0;
        
        while (x != 5) {
        	
        	System.out.println("Opções:");
        	System.out.println("1 - Depósito");
        	System.out.println("2 - Saque");
        	System.out.println("3 - Consultar saldo");
        	System.out.println("4 - Alterar código");
        	System.out.println("5 - Encerrar");
     
        	x = sc.nextInt();
        	
        switch (x) {
        
        
        	case 1: 
        			System.out.println("Entre com o valor a ser depositado:");
        			double valorDeposito = sc.nextDouble();
        			p.setSaldo(p.deposito(p.getSaldo(), valorDeposito));
        			
        			System.out.println("Depósito realizado com sucesso: " + p);
        			break;
        	
        	case 2: 
        			System.out.println("Entre com o valor a ser sacado:");
        			double valorSaque = sc.nextDouble();
        			p.setSaldo(p.saque(p.getSaldo(), valorSaque));
        			
        			System.out.println("Saque realizado com sucesso: " + p);
    			
        			break;
        	
        	case 3: 
        		
        			System.out.println(p);
        			break;
        			
        	case 4: 
        			System.out.println("Entre com o novo código:");
        			String novoId = sc.next();
        			p.setId(novoId);
        			
        			System.out.println("Código atualizado para: " + p.getId());
        			break;
        	case 5: 
        		
        			System.out.println("Programa encerrado");
        			break;
        
        }  	
        }
        
        sc.close();
    }
}


