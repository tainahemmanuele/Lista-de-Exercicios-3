package Questao2;

public class Limpeza extends Produto{

	public Limpeza(String nome, int quantidade, double preco) {
		super(nome, quantidade, preco);
	}


	@Override
	public double calculaDesconto() {
		setValorTotal(getPreco()*getQuantidade());
		if (getQuantidade()>=4){
			setValorTotal ( getValorTotal() - (0.1*(getQuantidade()-4)*getValorTotal()));
			return getValorTotal();
		}
		return getValorTotal();
	}

}
