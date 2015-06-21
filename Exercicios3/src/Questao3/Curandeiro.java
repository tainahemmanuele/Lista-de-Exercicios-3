package Questao3;

public class Curandeiro extends Personagem {

	public Curandeiro(double poder, double defesa) {
		super(poder, defesa);
	}

	@Override
	public double ataca() {
		setPoder(getPoder()/2);
		return getPoder();
	}

	@Override
	public double cura() {
		setPoder(getPoder()+(getPoder()*0.4));
		return getPoder();
	}

	@Override
	public double defende() {
		return 0;
	}

}
