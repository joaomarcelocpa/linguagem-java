package entidade;

	/* ATRIBUTOS ESTÁTICOS - SERVEM PARA NÃO PRECISAR DECLARAR VÁRIAS VEZES A MESMA VARIÁVEL */
public class Produto {

		public String nome;
		public double preco;
		public int quantidade;
		
		
	/* MÉTODOS - SE ASSEMELHAM AS FUNÇÕES EM C - SERVEM PARA EVITAR A REPETIÇÃO E MELHORAR ORGANIZAÇÃO*/
		public double valorTotal() {
			
			return preco * quantidade;	
		}
		
		
		public void adicionarProduto(int quantidade) {
			
			this.quantidade += quantidade;	
		}
		
		
		public void removerProduto(int quantidade) {
			
			this.quantidade -= quantidade;
		}	
		
		/* MÉTODO ESPECIAL toString*/
		public String toString() {
			
			return  nome 
					+ ", $ " 
					+ String.format("%.2f", preco)
					+ ", " 
					+ quantidade
					+ " unidades, Total: $ "
					+ String.format("%.2f", valorTotal());
						
		}
}
