package Questao4;

public abstract class Conta {
	private double saldo;
	private String nome;
	private double renda;
	private double rendaTitular;
	private double financiamento;
	
	public Conta(String nome, double renda, double rendaTitular){
		this.nome = nome;
		this.saldo = 0;
		this.rendaTitular = rendaTitular;
		this.financiamento = 0;
	}

	public double depositaDinheiro(double dinheiro){
		saldo += dinheiro;
	    return saldo;
	}
	
	public double sacaDinheiro(double dinheiro){
		saldo -= dinheiro;
		return saldo;
	}
	
	public abstract double projecaoLucro(int meses);
	
	public abstract double emprestimo();

	public double getSaldo() {
		return saldo;
	}

	public String getNome() {
		return nome;
	}

	public double getRenda() {
		return renda;
	}

	public double getRendaTitular() {
		return rendaTitular;
	}

	public double getFinanciamento() {
		return financiamento;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setFinanciamento(double financiamento) {
		this.financiamento = financiamento;
	}
	
	
	
	
}
