package text;

import java.util.ArrayList;
import java.util.List;

public abstract class Escrito extends Componente {
	protected List<Componente> componentesList;

	public Escrito(List<Componente> componentesList) {
		super();
		this.componentesList = componentesList;
	}
	
	public Escrito() {
		this.componentesList = new ArrayList<Componente>();
	}
	
	
}
