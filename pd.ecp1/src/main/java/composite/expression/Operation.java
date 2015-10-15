package composite.expression;

public abstract class Operation extends Expresion {
	protected Expresion firstExpression;
	protected Expresion secondExpression;
	
	boolean isComposite() {
		return true;
	}

	public Operation(Expresion firstExpression, Expresion secondExpression) {
		super();
		this.firstExpression = firstExpression;
		this.secondExpression = secondExpression;
	}


}
