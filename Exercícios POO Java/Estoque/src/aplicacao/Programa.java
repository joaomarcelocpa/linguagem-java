/* EXEMPLO DA AULA*/
package aplicacao;

import entidade.Produto;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Entre com os dados:");
		
		System.out.println("Nome:");
		String nome = sc.nextLine(); // ARMAZENA O NOME NA OUTRA CLASSE
		
		System.out.println("Preço:");
		double preco = sc.nextDouble(); // ARMAZENA O PREÇO NA OUTRA CLASSE
		
		System.out.println("Quantidade:");
		int quantidade = sc.nextInt(); // ARMAZENA A QUANTIDADE NA OUTRA CLASSE
		
		
		Produto produto = new Produto(nome, preco, quantidade);
		
		
		System.out.println("Entre com o novo nome:");
		nome = sc.next();
		produto.setNome(nome);
		System.out.println("Nome atualizado: " + produto.getNome());
		
		
		
		System.out.println("Entre com o novo preço");
		preco = sc.nextDouble();
		produto.setPreco(preco);
		System.out.println("Preco atualizado: " + produto.getPreco());
		
		
		System.out.println("Dados do produto: " + produto);
		
		
		
		System.out.println("Entre com o número de produtos a serem adicionados no estoque:");
		quantidade = sc.nextInt(); // VARIÁVEL RECEBE A QUANTIDADE
		produto.adicionarProduto(quantidade); // CHAMA O MÉTODO DE ADIÇÃO
		System.out.println("Dados atualizados: " + produto);
		
		
		
		System.out.println("Entre com o número de produtos a serem removidos do estoque:");
		quantidade = sc.nextInt(); // VARIÁVEL RECEBE A QUANTIDADE
		produto.removerProduto(quantidade); // CHAMA O MÉTODO DE SUBTRAÇÃO
		System.out.println("Dados atualizados: " + produto);
		
		
		
		sc.close();
	}
}
