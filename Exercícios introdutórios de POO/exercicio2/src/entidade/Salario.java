package entidade;

public class Salario {

		public String nome;
		public double salario;
		public double porcentagem;
		public double taxa;
		
		
		public double reducaoSalario() {
			
			return salario - taxa;
			
		}
		
	
		public double aumentoSalario() {
			
			double salarioAumentado = salario * (1 + porcentagem/100);

			return salarioAumentado - taxa;
			
			
		}
}
