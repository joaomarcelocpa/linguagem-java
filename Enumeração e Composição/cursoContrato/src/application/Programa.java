package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Departamento;
import entities.HorasContrato;
import entities.Trabalhador;
import entities.enums.NivelTrabalhador;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.printf("Entre com o nome do departamento:");
		String nomeDepartamento = sc.nextLine();
		
		System.out.println("Entre com os dados do trabalhador:");
		
		System.out.println("Nome:");
		String nomeTrabalhador = sc.nextLine();
		
		System.out.println("Nível:");
		String nivelTrabalhador = sc.nextLine();
		
		System.out.println("Salário base:");
		double salarioBase = sc.nextDouble();
		
		
		Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelTrabalhador.valueOf(nivelTrabalhador), salarioBase, new Departamento(nomeDepartamento));
		
		
		
		System.out.println("Quantos contratos o trabalhador tem?");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			
			System.out.println("Entre com os dados do " + i +   " contrato:");
			
			System.out.print("Data (DD/MM/YYYY): ");
			Date diaContrato = sdf.parse(sc.next());
			
			System.out.println("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			
			System.out.println("Duração (em horas)");
			int horas = sc.nextInt();
			
			
			HorasContrato contrato = new HorasContrato(diaContrato, valorPorHora, horas);	
			trabalhador.adicionarContrato(contrato);
			
		
		}
		
		System.out.println();
		
		System.out.println("Entre com o mês e ano para calcular o salário:");
		String mesAno = sc.next();
		
		int mes = Integer.parseInt(mesAno.substring(0, 2));
		int ano = Integer.parseInt(mesAno.substring(3)); 
		
		System.out.println("Nome: " + trabalhador.getNome());
		System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
		System.out.println("Salário em " + mesAno + ": " + String.format("%.2f", trabalhador.calcularSalario(ano, mes)));
		
		
		sc.close();
	}

}
