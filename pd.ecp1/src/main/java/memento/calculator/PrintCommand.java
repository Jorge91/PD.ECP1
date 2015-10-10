package memento.calculator;

import upm.jbb.IO;

public class PrintCommand extends ComandoAbstract {

	public PrintCommand(Calculator calculator) {
		super(calculator);
	}

	public void execute() {
		int value = this.calculator.getTotal();
		IO.getIO().println(value);
		
	}

	public String name() {
		return "Imprimir";
	}

}
