package listadeexercicios2;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		
		int duracao;
		
		if (horaInicial < horaFinal) {
			
			duracao = horaFinal - horaInicial;
		}
		else {	
			duracao = 24 - horaFinal + horaInicial;
		}

		System.out.println("O jogo durou " + duracao + " horas");

	}

}
