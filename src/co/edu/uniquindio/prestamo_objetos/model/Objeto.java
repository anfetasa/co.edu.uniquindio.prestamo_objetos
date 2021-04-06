package co.edu.uniquindio.prestamo_objetos.model;



public class Objeto {

	//atributos de la clase

	private String nombre;
	private String codigo;
	private int unidadesDisponibles;
	private String estado;
	private double precioAlquiler;

	//constructor

	public Objeto(String nombre, String codigo, int unidadesDisponibles, String estado, double precioAlquiler) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.unidadesDisponibles = unidadesDisponibles;
		this.estado = estado;
		this.precioAlquiler = precioAlquiler;
	}

	//getters and setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getUnidadesDisponibles() {
		return unidadesDisponibles;
	}

	public void setUnidadesDisponibles(int unidadesDisponibles) {
		this.unidadesDisponibles = unidadesDisponibles;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public double getPrecioAlquiler() {
		return precioAlquiler;
	}

	public void setPrecioAlquiler(double precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}



	//ToString

	public String toString() {
		return "Objeto [nombre=" + nombre + ", codigo=" + codigo + ", unidadesDisponibles=" + unidadesDisponibles
				+ ", estado=" + estado + ", precioAlquiler=" + precioAlquiler + "]";
	}



}
