package memento.calculator;

import memento.calculator.PrintCommand;
import memento.calculator.ResetCommand;
import memento.calculator.SubtractCommand;
import upm.jbb.IO;
import memento.calculator.AddCommand;


public class MainCalculatorMementable {
    private CommandManager commandManager;

    public MainCalculatorMementable() {
        CalculatorMementable calculator = new CalculatorMementable();
        this.commandManager = new CommandManager();
        this.commandManager.add(new AddCommand(calculator));
        this.commandManager.add(new SubtractCommand(calculator));
        this.commandManager.add(new ResetCommand(calculator));
        this.commandManager.add(new PrintCommand(calculator));
        this.commandManager.add(new SaveCommand(calculator));
        this.commandManager.add(new LoadCommand(calculator));
    }

    public void execute() {
        String key = (String) IO.getIO().select(this.commandManager.keys());
        this.commandManager.execute(key);
    }

    public static void main(String[] args) {
        IO.getIO().addView(new MainCalculatorMementable());
    }
}
