package Questao3;

public class Protetor extends Personagem {

	public Protetor(double poder, double defesa) {
		super(poder, defesa);	
	}

	@Override
	public double ataca() {
		return 0;
	}

	@Override
	public double cura() {
		return 0;
	}

	@Override
	public double defende() {
		setDefesa(getDefesa()+(getDefesa()*0.5));
		return getDefesa();
	}

}
