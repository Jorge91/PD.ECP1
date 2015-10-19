package memento.calculator;

public class LoadCommand extends ComandoAbstract {

	public LoadCommand(CalculatorMementable calculator) {
		super(calculator);
	}

	public void execute() {
		((CalculatorMementable) this.calculator).load();
		}

	public String name() {
		return "Restaurar";
	}

}
