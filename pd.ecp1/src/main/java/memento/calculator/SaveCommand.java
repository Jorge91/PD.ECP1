package memento.calculator;

import upm.jbb.IO;

public class SaveCommand extends ComandoAbstract {

	public SaveCommand(Calculator calculator) {
		super(calculator);
	}

	public void execute() {
		
		
	}

	public String name() {
		return "Guardar";
	}

}
