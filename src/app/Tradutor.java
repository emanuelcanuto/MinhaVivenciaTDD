package app;

public class Tradutor {

	Dicionario dicionario = new Dicionario();

	public String traduz(String palavrasEmPortugues) {
		String[] palavrasEmPortuguesArray = palavrasEmPortugues.split(" ");
		return traduzPalavraPorPalavra(palavrasEmPortuguesArray);
	}

	public String traduzPalavraPorPalavra(String[] palavrasEmPortuguesArray) {
		String palavrasTraduzidas = new String();
		for (int i = 0; i < palavrasEmPortuguesArray.length; i++) {
			palavrasTraduzidas += dicionario.pesquisar(palavrasEmPortuguesArray[i]) + " ";
		}
		return palavrasTraduzidas.trim();
	}
}