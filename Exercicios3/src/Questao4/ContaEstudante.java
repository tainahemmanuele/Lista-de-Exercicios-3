package Questao4;

public class ContaEstudante extends Conta {

	public ContaEstudante(String nome, double renda, double rendaTitular) {
		super(nome, renda, rendaTitular);
	}

	public double depositaDinheiro(double dinheiro){
		return super.depositaDinheiro(dinheiro);
	}
	public double sacaDinheiro(double dinheiro){
		return super.sacaDinheiro(dinheiro);
	}
	
	@Override
	public double projecaoLucro(int meses) {
		for (int i =0 ; i < meses; i++){
			setSaldo(getSaldo()+(getSaldo()*0.02));
			}
			return getSaldo();
	}

	@Override
	public double emprestimo() {
		setFinanciamento(getRendaTitular()/2);
		return getFinanciamento();
	}

}
