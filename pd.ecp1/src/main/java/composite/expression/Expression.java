package composite.expression;

public abstract class Expression {

	abstract void add(Expression expression);
	abstract void remove(Expression expression);
	abstract boolean isComposite();
	
}
