package Questao3;

public abstract class Personagem {
	private double poder;
	private double defesa;
	
	public Personagem(double poder, double defesa){
		this.poder = poder;
		this.defesa = defesa;
	}
	public abstract double ataca();
	
	public abstract double cura();
	
	public abstract double defende();
	
	public double getPoder() {
		return poder;
	}
	public void setPoder(double poder) {
		this.poder = poder;
	}
	public double getDefesa() {
		return defesa;
	}
	public void setDefesa(double defesa) {
		this.defesa = defesa;
	}
	
	

}
