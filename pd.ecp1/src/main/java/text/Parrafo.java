package text;

import java.util.ArrayList;
import java.util.List;

public class Parrafo extends Escrito {

	public Parrafo(List<Componente> componentesList) {
		super(componentesList);
	}
	
	public Parrafo() {
		this.componentesList = new ArrayList<Componente>();
	}

	@Override
	public String dibujar(boolean mayusculas) {
		String text = "";
		for (int i = 0; i < this.componentesList.size(); i++) {
			text += this.componentesList.get(i).dibujar(mayusculas);
		}
		return text + "\n";
	}

	@Override
	public void add(Componente componente) throws UnsupportedOperationException {
		if (componente.isCaracter()) {
			this.componentesList.add(componente);
		} else {
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public boolean isCaracter() {
		return false;
	}

	@Override
	public void delete(Componente componente) throws UnsupportedOperationException {
		if (componente.isCaracter()) {
			this.componentesList.remove(componente);
		} else {
			throw new UnsupportedOperationException();
		}
	}
	
	
}
