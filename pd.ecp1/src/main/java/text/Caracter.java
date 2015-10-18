package text;


public class Caracter extends Componente {

	private char value;

	@Override
	public String dibujar(boolean mayusculas) {
		return String.valueOf(mayusculas ? Character.toUpperCase(this.value) : this.value);
	}

	@Override
	public void add(Componente componente) throws UnsupportedOperationException {
		
	}

	@Override
	public boolean isCaracter() {
		return true;
	}

	public Caracter(char value) {
		super();
		this.value = value;
	}

	public char getValue() {
		return value;
	}

	public void setValue(char value) {
		this.value = value;
	}

	@Override
	public void delete(Componente componente) throws UnsupportedOperationException {
		
	}
	
	
	
}
