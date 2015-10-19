package memento.calculator;

public class Originador implements Mementable {
	private int value;

	public Memento createMemento() {
		return new Memento(this.value);
	}

	public void set(int value) {
        this.value = value;
    }
	
	public void restoreMemento(Memento memento) {
		this.value = memento.getValue();
	}

	
}
