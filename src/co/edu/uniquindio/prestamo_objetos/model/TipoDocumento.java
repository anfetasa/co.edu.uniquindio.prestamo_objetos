package co.edu.uniquindio.prestamo_objetos.model;

public enum TipoDocumento {
	CEDULA(0), PASAPORTE(1), CEDULA_EXTRANGERA(2);

	/*
	 *Atributo de la enumeracion
	 *
	 */
	private int numTipo;

	/*
	 * constructor de la enumeracion
	 * @param numTipo
	 *
	 */
	private TipoDocumento(int numTipo) {
		this.numTipo = numTipo;
	}

	/*
	 * get de la enumeracion
	 *
	 * @return
	 */
	public int getNumTipo() {
		return numTipo;
	}
}
