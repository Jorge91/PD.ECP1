package state.conexion;


public class Conexion {
    private Estado estado;

    private Link link;

    public Conexion(Link link) {
        assert link != null;
        this.link = link;
        this.estado = new EstadoCerrado();
    }

    public Link getLink() {
        return link;
    }

    public String getEstado() {
        return this.estado.getEstado();
    }

    public void linkEnviar(String msg) {
    	this.link.enviar(msg);
    }
    
    public void linkRecibir(int respuesta) {
    	this.link.recibir(respuesta);
    }
    
    public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public void abrir()  {
    	estado.abrir(this);
		
    }

    public void cerrar()  {
    	estado.cerrar(this);
		
    }

    public void parar()  {
        estado.parar(this);
    }

    public void iniciar()  {
    	estado.iniciar(this);
		
    }

    public void enviar(String msg)  {
    	estado.enviar(this, msg);
		
    }

    public void recibir(int respuesta)  {
    	estado.recibir(this, respuesta);
		
    }

}