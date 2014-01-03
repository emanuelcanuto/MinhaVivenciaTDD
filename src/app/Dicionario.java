package app;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
	public Map<String, String> dicionario = new HashMap<String, String>();

	public Dicionario() {
		dicionario.put("Vermelho", "Red");
		dicionario.put("Verde", "Green");
		dicionario.put("Branco", "White");
		dicionario.put("Cavalo", "Horse");
		dicionario.put("e", "and");
		dicionario.put("Forte", "Strong");
	}
	
	public String pesquisar(String palavraEmPortugues) {
			return dicionario.get(palavraEmPortugues) == null ? "Essa palavra eu não conheço! Você quis dizer: WTF???" : dicionario.get(palavraEmPortugues);
	}
}