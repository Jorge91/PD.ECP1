package text;

public abstract class Componente {

	public abstract String dibujar(boolean mayusculas);
	public abstract void add(Componente componente) throws UnsupportedOperationException;
	public abstract void delete(Componente componente) throws UnsupportedOperationException;
	public abstract boolean isCaracter();
}
