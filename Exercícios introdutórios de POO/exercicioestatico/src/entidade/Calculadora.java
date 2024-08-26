package entidade;

public class Calculadora {
	
	
	public static double conversao(double valor, double cotacao) {
		
		return valor * cotacao;
	}
	
	
	public static double imposto(double valor) {
		
		return valor * (1 + 0.06);
	}
}
