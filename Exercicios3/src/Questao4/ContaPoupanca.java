package Questao4;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(String nome, double renda, double rendaTitular) {
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
			setSaldo(getSaldo()+(getSaldo()*0.3));
			}
			return getSaldo();
	}

	@Override
	public double emprestimo() {
		return getFinanciamento();
	}

}
