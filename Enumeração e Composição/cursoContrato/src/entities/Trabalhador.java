package entities;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

import entities.enums.NivelTrabalhador;

public class Trabalhador {
	
	private String nome;
	private NivelTrabalhador nivel;
	private double salarioBase;
	
	private Departamento departamento;
	private List<HorasContrato> contratos = new ArrayList<>();
	
	public Trabalhador(String nome, NivelTrabalhador nivel, double salarioBase, Departamento departamento) {
		
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelTrabalhador getNivel() {
		return nivel;
	}

	public void setNivel(NivelTrabalhador nivel) {
		this.nivel = nivel;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HorasContrato> getContrato() {
		return contratos;
	}
	
	
	public void adicionarContrato(HorasContrato contrato){
		
		contratos.add(contrato);	
	}
	
	public void removerContrato(HorasContrato contrato) {
		
		contratos.remove(contrato);
	}
	
	public double calcularSalario(int ano, int mes) {
	    double soma = salarioBase;
	    YearMonth anoMesSalario = YearMonth.of(ano, mes);  

	    for (HorasContrato c : contratos) {
	        LocalDate dataContrato = c.getData().toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();  
	        
	        YearMonth anoMesContrato = YearMonth.from(dataContrato);  
	        
	        
	        if (anoMesContrato.equals(anoMesSalario)) {
	            soma += c.valorTotal();  
	        }
	    }
	    
	    return soma;  
	}




 }













