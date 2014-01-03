package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import app.Tradutor;

public class TradutorTest {

	@Test
	public void traduzUmPalavra() {
		Tradutor tradutor = new Tradutor();
		assertEquals("Red", tradutor.traduz("Vermelho"));
	}
	
	@Test
	public void traduzDuasPalavras() {
		Tradutor tradutor = new Tradutor();
		assertEquals("Red Green", tradutor.traduz("Vermelho Verde"));
	}
	
	@Test
	public void traduzFrase() {
		Tradutor tradutor = new Tradutor();
		assertEquals("Horse White and Strong", tradutor.traduz("Cavalo Branco e Forte"));
	}
	
	@Test
	public void naoTraduzPalavrasDesconhecidas() {
		Tradutor tradutor = new Tradutor();
		assertEquals("Essa palavra eu não conheço! Você quis dizer: WTF???", tradutor.traduz("MhangUhausnh"));
	}
	
	@Test
	public void traduzCadaPalavra() {
		Tradutor tradutor = new Tradutor();
		String[] palavras = {"Branco","Vermelho"};
		assertEquals("White Red", tradutor.traduzPalavraPorPalavra(palavras));
	}

}
