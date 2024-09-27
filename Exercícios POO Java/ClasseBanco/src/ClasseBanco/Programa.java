package ClasseBanco;

public class Programa {
	
	/*ATRIBUTOS*/
	private String id;
	private String cpf;
	private double saldo; 
	private double limite;
	
	
	
	/*CONSTRUTORES*/
	public Programa(String id, String cpf, double saldo) {
	
		this.id = id;
		this.cpf = cpf;
		this.saldo = saldo;
		this.limite = -100.0;
	}
	
	
	/*GETTERS E SETTERS*/
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	
	/*MÉTODOS*/
	public double saque(double saldo, double valor) {
		
		if ((saldo - valor)  < limite)  {
			
			System.out.println("Saldo insuficiente para saque!");
			
			return saldo;
		}
		else {
			
			return saldo - valor;
		}
	
	}
	
	public double deposito(double saldo, double valor) {
		
		if (saldo < 0) {	
			
			return saldo + (valor * 0.97);
		}
		else {
			
			return saldo + valor;
		}
	}
	
	
	public String toString() {
		
		
		return "Código da conta:" + getId() +  ", " + "Valor na conta:  " + getSaldo();
		
		
	}
}




