package main.java.list.OperacoesBasicas;

public class ItemRuan {
	
	String nome; 
	double preco; 
	int quantidade;
	
	
	public ItemRuan(String nome, double preco, int quantidade) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	@Override
	public String toString() {
		return "Item{" +
				"nome='" + nome + '\'' +
				", preco=" + preco +
				", quantidade=" + quantidade +
				'}';
	}

	
	
	

	
	
	
	
	
	

}
