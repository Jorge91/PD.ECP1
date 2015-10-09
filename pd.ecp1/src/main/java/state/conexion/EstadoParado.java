package state.conexion;

public class EstadoParado extends Estado {
	public void parar(Conexion conexion) {
		
	}
	public void iniciar(Conexion conexion) {
		conexion.setEstado(new EstadoPreparado());
	}
	
	@Override
	String getEstado() {
		return "PARADO";
	}
}
