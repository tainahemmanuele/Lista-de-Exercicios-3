package Questao2;

public class Alimento extends Produto{


	
	public Alimento(String nome, int quantidade, double preco) {
		super(nome, quantidade, preco);
		// TODO Auto-generated constructor stub
	}



	public boolean contemGluten(String contem){
		if (contem.equals("Sim")){
			setCondicao(true);
			return isCondicao();
		}
			else{
				setCondicao(false);
				return isCondicao();
			}
		}
	
	@Override
	public double calculaDesconto() {
		setValorTotal(getPreco()*getQuantidade());
		if(isCondicao() == true ){
			setValorTotal( getValorTotal() - (0.5*getPreco()*getQuantidade()));
			return getValorTotal();
		}
		return getValorTotal();
	}

}
