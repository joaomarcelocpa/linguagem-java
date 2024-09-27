package entidade;

public class Conta {
	
	/*ATRIBUTOS ESTÁTICOS*/
	private String numeroDaConta;
	private String nome;
	private double saldo;
	private double deposito;
	private double saque;
	
	
	/*CONSTRUTOR*/
	
	public Conta (String numeroDaConta, String nome, double saldoInicial) {
		
		this.numeroDaConta = numeroDaConta;
		this.nome = nome;
		this.saldo = saldoInicial;
		this.deposito = 0.0;
		this.saque = 0.0;
		
	}
	
	
	/*GETTERS E SETTERS*/
		
		public String getNome() {
			
			return nome;
			
		}
	
		public void setNome(String nome) {
			
			this.nome = nome;
				
		}
		
		public double getSaldo() {
			
		return saldo;
		
		}

		public double getDeposito() {
			
		return deposito;
		
		}

		public void setDeposito(double deposito) {
			
			if (deposito > 0) {
	            this.deposito = deposito;
	        } 
			else {
	            System.out.println("O valor do depósito deve ser positivo.");
	        }
		}

		public double getSaque() {
			
		return saque;
		
		}

		
		public void setSaque(double saque) {
			
		this.saque = saque;
		
	}
	
	
	/*MÉTODOS*/
	
	public void depositarValor(double deposito) {
		
		 this.saldo += deposito;
		
	}

	public void sacarValor(double saque) {
		
		this.saldo -= saque + 5.00;
		
	}
	
	public String toString() {
		
		return 	"Conta: "
				+ numeroDaConta 
				+ ", Titular: " 
				+ nome
				+ ", Saldo: $" 
				+ String.format("%.2f", saldo);
	}	
}
