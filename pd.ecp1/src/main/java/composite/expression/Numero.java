package composite.expression;

public class Numero  extends Expresion {

	private int value;
	
	public Numero(int value) {
		super();
		this.value = value;
	}

	@Override
	boolean isComposite() {
		return false;
	}

	@Override
	int operar() {
		return value;
	}

	@Override
	public String toString() {
		return Integer.toString(value);
	}
	
	

}
