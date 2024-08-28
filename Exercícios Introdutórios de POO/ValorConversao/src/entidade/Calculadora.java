package entidade;

public class Calculadora {
	
	public double cotacao;
	public double quantidade;
	
	public static final double taxa = 1.06;
	
	public static double conversaoDolar(double cotacao, double quantidade) {
		
		return cotacao * quantidade * taxa;
		
	}
	
}
