package Classe;

public class Banco {
	private String nome;
	private int conta;
	private double saldo;
	
	public Banco() {}
	public Banco(String nome, int conta, double saldo) {
		super();
		this.nome = nome;
		this.conta = conta;
		this.saldo = saldo;
	}
	
	public String setNome(String nome) {
		return this.nome = nome;
	}
	public Double setSaldo(double saldo) {
		return this.saldo =saldo;
	}
	
	public int setConta(int conta) {
		return this.conta = conta;
	}
	public double AdicionarSaldo(double saldo) {
		return this.saldo += saldo;
	}
	public double ReomverSaldo(double saldo) {
		return this.saldo -= saldo + 5.00;
	}
	
	@Override
	public String toString() {
		return "nome " + nome + ", conta " + conta + ", saldo R$ " + saldo;
	}
	
	

}
