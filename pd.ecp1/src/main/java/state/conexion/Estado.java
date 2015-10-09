package state.conexion;


abstract public class Estado {
	
	private String errorMessage = "Acción no permitida... ";
	
	public static String CERRADO = "CERRADO";
	public static String PARADO = "PARADO";
	public static String PREPARADO = "PREPARADO";
	public static String ESPERANDO = "ESPERANDO";
	
	abstract String getEstado();
	
	public void abrir(Conexion conexion) {
		throw new UnsupportedOperationException(errorMessage);
	}
	public void cerrar(Conexion conexion) {
		throw new UnsupportedOperationException(errorMessage);
	}
	public void parar(Conexion conexion) {
		throw new UnsupportedOperationException(errorMessage);
	}
	public void iniciar(Conexion conexion) {
		throw new UnsupportedOperationException(errorMessage);
	}
	public void enviar(Conexion conexion, String msg) {
		throw new UnsupportedOperationException(errorMessage);
	}
	public void recibir(Conexion conexion, int i) {
		throw new UnsupportedOperationException(errorMessage);
	}
	
}