package entities;
 


public class ContaBanco {
	private int numeroDaConta; 
	private String nome; 
	private double saldo; 
	
	public ContaBanco () {
		
	}
	
	public ContaBanco (int numeroDaConta, String nome){
		this.numeroDaConta = numeroDaConta;
		this.nome = nome;
	 
	}
		
	public ContaBanco (int numeroDaConta, String nome, double saldo){
		this.numeroDaConta = numeroDaConta;
		this.nome = nome;
		this.saldo = saldo; 
	}
	
	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public double getSaldo() {
		return saldo; 
	}
	
	public void deposito (double saldo) {
		this.saldo += saldo;
		this.saldo -= 5.00; 
	}
	
	public void saque (double saque) {
		this.saldo -= saque; 
	}
	
	public String toString () {
		return "Account " + numeroDaConta + ", Holder: " + nome + ", Balance: $ " + saldo;
	}
	

}
