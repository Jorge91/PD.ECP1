package memento.calculator;

import upm.jbb.IO;

public class SubtractCommand extends ComandoAbstract {

	public SubtractCommand(Calculator calculator) {
		super(calculator);
	}

	public void execute() {
		int value = (int) IO.getIO().readInt();
		this.calculator.subtract(value);
		
	}

	public String name() {
		return "Restar";
	}

}
