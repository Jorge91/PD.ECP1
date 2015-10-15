package composite.expression;

public class Sumar extends Operation {

	public Sumar(Expresion firstExpression, Expresion secondExpression) {
		super(firstExpression, secondExpression);
	}

	@Override
	int operar() {
		return this.firstExpression.operar() + this.secondExpression.operar();
	}
	
	@Override
	public String toString() {
		return "(" + this.firstExpression.toString() + "+" + this.secondExpression.toString() + ")";
	}
	
}
