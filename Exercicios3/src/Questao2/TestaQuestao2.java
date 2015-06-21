package Questao2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestaQuestao2 {

	@Test
	public void testProduto() {
		
		Produto detergente =  new Limpeza("Ype",7, 3.50);
		Produto tapioca = new Alimento("Sinha Maria",5,2.40);
		
		detergente.calculaDesconto();
		tapioca.contemGluten("Nao");
		tapioca.calculaDesconto();
		System.out.println(tapioca.calculaDesconto());
		
		tapioca.contemGluten("Sim");
		tapioca.calculaDesconto();
		
		System.out.println(detergente.calculaDesconto());
		System.out.println(tapioca.calculaDesconto());
		
		tapioca.contemGluten("Nao");
		tapioca.calculaDesconto();
		
		
	}

}
