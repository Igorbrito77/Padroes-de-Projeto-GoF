package iterator;

public class Product {
	
	private String nome;
	private double valor;
	
	public Product(String nome , double valor) {
		this.nome = nome;
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}
	public String getNome() {
		return nome;
	}

}
