package Questao2;

public abstract class Produto {
	private String nome;
	private int quantidade;
	private double preco;
	private double valorTotal;
	private boolean condicao ;
	
	public Produto(String nome, int quantidade, double preco){
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	

	public abstract double calculaDesconto();

	public boolean contemGluten(String contem){
		if (contem.equals("Sim")){
			condicao = true;
			return condicao;
		}
			else{
		    condicao = false;
			return condicao;
			}
		}


	public boolean isCondicao() {
		return condicao;
	}


	public void setCondicao(boolean condicao) {
		this.condicao = condicao;
	}


	public String getNome() {
		return nome;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public double getPreco() {
		return preco;
	}


	public double getValorTotal() {
		return valorTotal;
	}


	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
}
