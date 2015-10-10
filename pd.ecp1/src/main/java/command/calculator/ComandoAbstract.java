package command.calculator;

public abstract class ComandoAbstract implements ICommand {

	protected Calculator calculator;
	
	public ComandoAbstract(Calculator calculator) {
		this.calculator = calculator;
	}
}
