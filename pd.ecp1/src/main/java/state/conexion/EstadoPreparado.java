package state.conexion;

public class EstadoPreparado extends Estado {
	
	public void abrir(Conexion conexion) {
		
	}
	public void cerrar(Conexion conexion) {
		conexion.setEstado(new EstadoCerrado());
	}

	public void iniciar(Conexion conexion) {

	}
	public void enviar(Conexion conexion, String msg) {
		conexion.linkEnviar(msg);
		conexion.setEstado(new EstadoEsperando());
	}
	
	public void parar(Conexion conexion) {
		conexion.setEstado(new EstadoParado());
	}
	
	@Override
	String getEstado() {
		return "PREPARADO";
	}
}
