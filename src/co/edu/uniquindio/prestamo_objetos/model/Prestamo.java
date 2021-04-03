package co.edu.uniquindio.prestamo_objetos.model;

public class Prestamo {

	//atributos de la clase
	private String codigo;
	private int diasSolicitados;
	private int diasTranscurridos;
	private double valor;

	//constructor

	public Prestamo(String codigo, int diasSolicitados, int diasTranscurridos, double valor) {
		super();
		this.codigo = codigo;
		this.diasSolicitados = diasSolicitados;
		this.diasTranscurridos = diasTranscurridos;
		this.valor = valor;
	}

	//getters and setters

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getDiasSolicitados() {
		return diasSolicitados;
	}

	public void setDiasSolicitados(int diasSolicitados) {
		this.diasSolicitados = diasSolicitados;
	}

	public int getDiasTranscurridos() {
		return diasTranscurridos;
	}

	public void setDiasTranscurridos(int diasTranscurridos) {
		this.diasTranscurridos = diasTranscurridos;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	//ToString

	public String toString() {
		return "Prestamo [codigo=" + codigo + ", diasSolicitados=" + diasSolicitados + ", diasTranscurridos="
				+ diasTranscurridos + ", valor=" + valor + "]";
	}




}
