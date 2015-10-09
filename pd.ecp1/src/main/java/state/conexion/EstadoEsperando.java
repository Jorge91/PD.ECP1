package state.conexion;

public class EstadoEsperando extends Estado {
	public void recibir(Conexion conexion, int i) {
		if (i == 0) {
			conexion.setEstado(new EstadoPreparado());
		} else {
			conexion.setEstado(new EstadoCerrado());
		}
	}
	
	@Override
	String getEstado() {
		return "ESPERANDO";
	}
}
