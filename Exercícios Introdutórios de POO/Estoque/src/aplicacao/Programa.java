/* EXEMPLO DA AULA*/

package aplicacao;

import entidade.Produto;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		
		System.out.println("Entre com os dados:");
		
		System.out.println("Nome:");
		produto.nome = sc.nextLine(); // ARMAZENA O NOME NA OUTRA CLASSE
		
		System.out.println("Preço:");
		produto.preco = sc.nextDouble(); // ARMAZENA O PREÇO NA OUTRA CLASSE
		
		System.out.println("Quantidade:");
		produto.quantidade = sc.nextInt(); // ARMAZENA A QUANTIDADE NA OUTRA CLASSE
		
		System.out.println("Dados do produto: " + produto);
		
		
		System.out.println();
		System.out.println("Entre com o número de produtos a serem adicionados no estoque:");
		int quantidade = sc.nextInt(); // VARIÁVEL RECEBE A QUANTIDADE
		produto.adicionarProduto(quantidade); // CHAMA O MÉTODO DE ADIÇÃO
		System.out.println("Dados atualizados: " + produto);
		
		
		System.out.println();
		System.out.println("Entre com o número de produtos a serem removidos do estoque:");
		quantidade = sc.nextInt(); // VARIÁVEL RECEBE A QUANTIDADE
		produto.removerProduto(quantidade); // CHAMA O MÉTODO DE SUBTRAÇÃO
		System.out.println("Dados atualizados: " + produto);
		
		sc.close();
	}

}
