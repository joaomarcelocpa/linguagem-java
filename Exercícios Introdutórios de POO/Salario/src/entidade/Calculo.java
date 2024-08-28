package entidade;

public class Calculo {
	
	public String nome;
	public double salario;
	public double imposto;
	public double taxa;
	
	
	public double taxacaoSalario() {
		
		return salario - imposto;
		
	}
	
	public double aumentoSalario() {
		
		double atualizacao = salario * ( 1 + taxa / 100);
		
		return atualizacao - imposto;
		
	}
	
}