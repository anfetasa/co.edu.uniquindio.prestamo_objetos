package co.edu.uniquindio.prestamo_objetos.model;

public class DetallePrestamo {
	private int unidadesPrestadas;
	private double sobTotal;
	private String codigoPrestamo;
	private String codigoObjeto;

	//contructor

	public DetallePrestamo(int unidadesPrestadas, double sobTotal, String codigoPrestamo, String codigoObjeto) {
		super();
		this.unidadesPrestadas = unidadesPrestadas;
		this.sobTotal = sobTotal;
		this.codigoPrestamo = codigoPrestamo;
		this.codigoObjeto = codigoObjeto;
	}

	//getters and setters

	public int getUnidadesPrestadas() {
		return unidadesPrestadas;
	}

	public void setUnidadesPrestadas(int unidadesPrestadas) {
		this.unidadesPrestadas = unidadesPrestadas;
	}

	public double getSobTotal() {
		return sobTotal;
	}

	public void setSobTotal(double sobTotal) {
		this.sobTotal = sobTotal;
	}

	public String getCodigoPrestamo() {
		return codigoPrestamo;
	}

	public void setCodigoPrestamo(String codigoPrestamo) {
		this.codigoPrestamo = codigoPrestamo;
	}

	public String getCodigoObjeto() {
		return codigoObjeto;
	}

	public void setCodigoObjeto(String codigoObjeto) {
		this.codigoObjeto = codigoObjeto;
	}

	//toString


	public String toString() {
		return "DetallePrestamo [unidadesPrestadas=" + unidadesPrestadas + ", sobTotal=" + sobTotal
				+ ", codigoPrestamo=" + codigoPrestamo + ", codigoObjeto=" + codigoObjeto + "]";
	}




}
