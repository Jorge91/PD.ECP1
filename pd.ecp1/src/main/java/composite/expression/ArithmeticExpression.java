package composite.expression;

public class ArithmeticExpression extends Expression {
	private Expression firstExpression;
	private Expression secondExpression;
	private Operation operation;
	
	public ArithmeticExpression(Expression firstExpression, Expression secondExpression, Operation operation) {
		super();
		this.firstExpression = firstExpression;
		this.secondExpression = secondExpression;
		this.operation = operation;
	}

	@Override
	void add(Expression expression) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void remove(Expression expression) {
		// TODO Auto-generated method stub
		
	}

	@Override
	boolean isComposite() {
		return true;
	}

	
	
	
	
}
