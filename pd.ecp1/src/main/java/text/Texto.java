package text;

import java.util.ArrayList;
import java.util.List;

public class Texto extends Escrito {

	public Texto(List<Componente> componentesList) {
		super(componentesList);
	}
	
	public Texto() {
		this.componentesList = new ArrayList<Componente>();
	}

	@Override
	public String dibujar(boolean mayusculas) {
		String text = "";
		for (int i = 0; i < this.componentesList.size(); i++) {
			text += this.componentesList.get(i).dibujar(mayusculas);
		}
		return text + "---o---\n";
	}

	@Override
	public void add(Componente componente) throws UnsupportedOperationException {
		if (componente.isCaracter()) {
			throw new UnsupportedOperationException();
		} else {
			this.componentesList.add(componente);
		}
	}

	@Override
	public boolean isCaracter() {
		return false;
	}

	@Override
	public void delete(Componente componente) throws UnsupportedOperationException {
		if (componente.isCaracter()) {
			throw new UnsupportedOperationException();
		} else {
			this.componentesList.remove(componente);
		}
	}
	
}
