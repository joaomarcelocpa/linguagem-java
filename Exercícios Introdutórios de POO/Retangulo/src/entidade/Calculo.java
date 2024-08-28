package entidade;

public class Calculo {
	
	public double altura;
	public double largura;
	
	public double calcularArea() {
		
		return altura * largura;
		
	}
	
	public double calcularPerimetro() {
		
		return 2 * (altura  + largura);
		
	}
	
	public double calcularDiagonal() {
		
		return Math.sqrt((largura * largura) + (altura * altura));
			
	}
	

}
