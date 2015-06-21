package Questao1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestaQuestao1 {

	@Test
	public void testSala() {
		Sala santuario = new Santuario();
		System.out.println(santuario.mensagem());
		
		Sala camara = new CamaraDeGas();
		System.out.println(camara.mensagem());
		
	}

}
