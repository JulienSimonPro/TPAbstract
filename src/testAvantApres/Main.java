package testAvantApres;

import avant.Paire;
import apres.GPaire;

public class Main {

	public static void main(String[] args) {
		generique();
		nonGenerique();
	}

	private static void nonGenerique() {
		Paire p = new Paire("abc", "xyz");
		@SuppressWarnings("unused")
		String x = (String) p.getPremier();
//		Double y = (Double) p.getSecond();
	}

	private static void generique() {
		GPaire<String> p = new GPaire<>("abc", "xyz");
		@SuppressWarnings("unused")
		String x = p.getPremier();
//		Double y = p.getSecond();
	}

}
