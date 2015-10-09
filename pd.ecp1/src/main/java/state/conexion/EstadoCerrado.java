package state.conexion;

public class EstadoCerrado extends Estado {

	@Override
	public void abrir(Conexion conexion) {
		conexion.setEstado(new EstadoPreparado());
	}

	@Override
	public void cerrar(Conexion conexion) {
		
	}

	@Override
	String getEstado() {
		return "CERRADO";
	}


}
