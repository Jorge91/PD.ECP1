package memento.calculator;

public class ResetCommand extends ComandoAbstract {

	public ResetCommand(Calculator calculator) {
		super(calculator);
	}

	public void execute() {
		this.calculator.reset();;
		
	}

	public String name() {
		return "Reset";
	}

}
