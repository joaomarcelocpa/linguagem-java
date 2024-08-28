package entidade;

public class Estudante {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	
	public double notaFinal() {
		
		return nota1 + nota2 + nota3;
		
	}
	
	public String calculoAprovacao() {
		
		if (notaFinal() > 60) {	
			
			return "Nota final: "
					+ notaFinal()
					+" Passou!";	
		}
		else {
			
			double notaNecessaria = 60 - notaFinal();
			
			return "Nota final: " 
					+ notaFinal() 
					+ " Não passou! " 
					+ " Faltou: " 
					+ notaNecessaria
					+ " pontos";
			
			}
		}
	}	