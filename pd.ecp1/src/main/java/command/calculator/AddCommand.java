package command.calculator;

import upm.jbb.IO;

public class AddCommand extends ComandoAbstract {

	
	public AddCommand(Calculator calculator) {
		super(calculator);
	}

	public void execute() {
		int value = (int) IO.getIO().readInt();
		this.calculator.add(value);
	}

	public String name() {
		return "Sumar";
	}

}
