package Questao3;

public class Assassino extends Personagem{

	public Assassino(double poder, double defesa) {
		super(poder, defesa);
	}

	@Override
	public double ataca() {
		setPoder(getPoder()+(getPoder()*0.5));
		return getPoder();
	}

	@Override
	public double cura() {
		return 0;
	}

	@Override
	public double defende() {
		setDefesa(getDefesa()/2);
		return getDefesa();
	}

}
