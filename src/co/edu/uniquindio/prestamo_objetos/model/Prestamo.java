package co.edu.uniquindio.prestamo_objetos.model;

public class Prestamo {

	//atributos de la clase
	private String codigo;
	private int diasSolicitados;
	private double valor;
	private String codigoCliente;
	private String codigoEmpleado;


	//constructor

	public Prestamo(String codigo, int diasSolicitados, double valor, String codigoCliente,
			String codigoEmpleado) {
		super();
		this.codigo = codigo;
		this.diasSolicitados = diasSolicitados;
		this.valor = valor;
		this.codigoCliente = codigoCliente;
		this.codigoEmpleado = codigoEmpleado;
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
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getCodigoEmpleado() {
		return codigoEmpleado;
	}

	public void setCodigoEmpleado(String codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}


	//toString
	public String toString() {
		return "Prestamo [codigo=" + codigo + ", diasSolicitados=" + diasSolicitados + ", valor=" + valor
				+ ", codigoCliente=" + codigoCliente + ", codigoEmpleado=" + codigoEmpleado + "]";
	}









}
