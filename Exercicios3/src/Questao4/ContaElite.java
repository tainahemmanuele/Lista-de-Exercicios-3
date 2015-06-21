package Questao4;

public class ContaElite extends Conta{

	public ContaElite(String nome, double renda, double rendaTitular) {
		super(nome, renda, rendaTitular);
	}

	@Override
	public double projecaoLucro(int meses) {
		for (int i =0 ; i < meses; i++){
			setSaldo(getSaldo()+(getSaldo()*0.15));
			}
			return getSaldo();
	}

	@Override
	public double emprestimo() {
		setFinanciamento(getSaldo()+getRendaTitular()+(0.1*(0.1* projecaoLucro(5))));
		return getFinanciamento();
	}

}
