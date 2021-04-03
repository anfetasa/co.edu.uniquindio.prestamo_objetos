package co.edu.uniquindio.prestamo_objetos.model;

public class Cliente {

	// Atributos de la clase
	private String documento;
	private String nombre;
	private String genero;
	private String ciudadResidencia;
	private TipoDocumento tipoDocumento;


	//contructor

	public Cliente(String documento, String nombre, String genero, String ciudadResidencia,
			TipoDocumento tipoDocumento) {
		super();
		this.documento = documento;
		this.nombre = nombre;
		this.genero = genero;
		this.ciudadResidencia = ciudadResidencia;
		this.tipoDocumento = tipoDocumento;
	}

	//Getters and setters
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCiudadResidencia() {
		return ciudadResidencia;
	}
	public void setCiudadResidencia(String ciudadResidencia) {
		this.ciudadResidencia = ciudadResidencia;
	}
	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	//ToString
	public String toString() {
		return "Cliente [documento=" + documento + ", nombre=" + nombre + ", genero=" + genero + ", ciudadResidencia="
				+ ciudadResidencia + ", tipoDocumento=" + tipoDocumento + "]";
	}








}
