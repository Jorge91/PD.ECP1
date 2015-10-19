package memento.calculator;

public class SaveCommand extends ComandoAbstract {

	public SaveCommand(CalculatorMementable calculator) {
		super(calculator);
	}

	public void execute() {
		((CalculatorMementable) this.calculator).save(this.calculator.getTotal());	
	}

	public String name() {
		return "Guardar";
	}

}
