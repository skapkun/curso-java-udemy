package entities;

public class Product {
	private String name;
	private Double valor;
	private int qtdd;
	
	
	
	public Product() { 
	}
	public Product(String name, Double valor, int qtdd) { 
		this.name = name;
		this.valor = valor;
		this.qtdd = qtdd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public int getQtdd() {
		return qtdd;
	}
	public void setQtdd(int qtdd) {
		this.qtdd = qtdd;
	} 
	public Double total() {
		return qtdd*valor; 
	}
	
 
	
}
