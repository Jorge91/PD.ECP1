package memento.calculator;

public interface Mementable {
	Memento createMemento();
	void restoreMemento(Memento memento);
}
