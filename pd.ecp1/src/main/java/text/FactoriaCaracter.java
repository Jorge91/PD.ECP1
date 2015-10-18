package text;

import java.util.HashMap;

public class FactoriaCaracter {

	private static FactoriaCaracter factoriaCaracter;
	private HashMap<Character, Caracter> hashMap; 
	
	private FactoriaCaracter() {
		this.hashMap = new HashMap<>();
	}
	
	public static FactoriaCaracter getFactoria() {
		if (factoriaCaracter == null) {
			factoriaCaracter = new FactoriaCaracter();
		}
		return factoriaCaracter;
	}
	
	public Caracter get(char caracter) {
		if (!hashMap.containsKey(caracter)) {
			this.hashMap.put(caracter,  new Caracter(caracter));
		}
		return this.hashMap.get(caracter);	
	}
	
	
}
