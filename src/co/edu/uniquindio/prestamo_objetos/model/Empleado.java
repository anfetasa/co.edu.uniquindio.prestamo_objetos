package co.edu.uniquindio.prestamo_objetos.model;

public class Empleado {

	//Atributos de la clase
	private String nombre;
	private String codigo;
	private String correo;
	private int aniosExperiencia;


	//Constructor
	public Empleado(String nombre, String codigo, String correo, int aniosExperiencia) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.correo = correo;
		this.aniosExperiencia = aniosExperiencia;
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

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	//ToString

	public String toString() {
		return "Empleado [nombre=" + nombre + ", codigo=" + codigo + ", correo=" + correo + ", aniosExperiencia="
				+ aniosExperiencia + "]";
	}

	public String adios(){
		return "adios";
	}




}
