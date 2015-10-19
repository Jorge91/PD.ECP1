package memento.calculator;

public class CalculatorMementable extends Calculator {
	Originador originator;
	Memento memento;
	
	
	public CalculatorMementable() {
		super();
		this.originator = new Originador();
	}

	public void save(int value) {
		this.originator.set(value);
		memento = this.originator.createMemento();
	}
	
	public void load() {
		this.setTotal(memento.getValue()); 
	}
	
}
