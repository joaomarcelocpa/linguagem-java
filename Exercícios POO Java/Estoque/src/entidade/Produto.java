package entidade;


	/* ATRIBUTOS ESTÁTICOS - SERVEM PARA NÃO PRECISAR DECLARAR VÁRIAS VEZES A MESMA VARIÁVEL */
	public class Produto {

		private String nome;
		private double preco;
		private int quantidade;
		
		

	/* CONSTRUTOR*/  /* SOBRECARGA - MAIS DE UMA VERSÃO PARA CADA OPERAÇÃO */
		
		public Produto(String nome, double preco, int quantidade) {
			
			this.nome = nome;
			this.preco = preco;
			this.quantidade = quantidade;
		}
		
		public Produto(String nome, double preco) {
			
			this.nome = nome;
			this.preco = preco;
		}
		
		
	/* GETTERS E SETTERS*/
		
		public void setNome(String nome) {
			
			this.nome = nome;	
		}
		
		public String getNome() {
			
			return nome;
		}
		
		public void setPreco(double preco) {
			
			this.preco = preco;
			
		}
		
		public double getPreco() {
			
			return preco;
			
		}
		
		public int getQuantidade() {
			
			return quantidade;
		}
		

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
