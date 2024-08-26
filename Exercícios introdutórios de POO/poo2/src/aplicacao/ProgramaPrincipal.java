package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Produto;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		System.out.println("Entre com os dados");
		
		System.out.print("Nome:");
		produto.nome = sc.nextLine();
		
		System.out.print("Preço:");
		produto.preco = sc.nextDouble();
		
		System.out.print("Quantidade:");
		produto.quantidade = sc.nextInt();
		
		System.out.println();
		System.out.println("Dados do produto:" + produto);
		
		
		System.out.println();
		System.out.println("Entre com o número de produtos a serem adicionados ao estoque:");
		int quantidade = sc.nextInt();
		produto.adicionarProduto(quantidade);
		
		
		System.out.println();
		System.out.println("Dados atualizados do produto:" + produto);
		
		
		System.out.println();
		System.out.println("Entre com o número de produtos a serem removidos do estoque:");
		quantidade = sc.nextInt();
		produto.removerProduto(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados do produto:" + produto);
		
		sc.close();
	}

}
