package co.edu.uniquindio.prestamo_objetos.model;



public class Empresa {

	//astributos de la clase
	private String nombre;
	private String nit;
	private Prestamo prestamo1;
	private Prestamo prestamo2;
	private Prestamo prestamo3;
	private Empleado empleado1;
	private Empleado empleado2;
	private Empleado empleado3;
	private Cliente cliente1;
	private Cliente cliente2;
	private Cliente cliente3;
	private Objeto objeto1;
	private Objeto objeto2;
	private Objeto objeto3;


	//constructor

	public Empresa(String nombre, String nit) {
		super();
		this.nombre = nombre;
		this.nit = nit;
	}

	//geters and setters

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNit() {
		return nit;
	}
	public void setNit(String nit) {
		this.nit = nit;
	}
	public Prestamo getPrestamo1() {
		return prestamo1;
	}
	public void setPrestamo1(Prestamo prestamo1) {
		this.prestamo1 = prestamo1;
	}
	public Prestamo getPrestamo2() {
		return prestamo2;
	}
	public void setPrestamo2(Prestamo prestamo2) {
		this.prestamo2 = prestamo2;
	}
	public Prestamo getPrestamo3() {
		return prestamo3;
	}
	public void setPrestamo3(Prestamo prestamo3) {
		this.prestamo3 = prestamo3;
	}
	public Empleado getEmpleado1() {
		return empleado1;
	}
	public void setEmpleado1(Empleado empleado1) {
		this.empleado1 = empleado1;
	}
	public Empleado getEmpleado2() {
		return empleado2;
	}
	public void setEmpleado2(Empleado empleado2) {
		this.empleado2 = empleado2;
	}
	public Empleado getEmpleado3() {
		return empleado3;
	}
	public void setEmpleado3(Empleado empleado3) {
		this.empleado3 = empleado3;
	}
	public Cliente getCliente1() {
		return cliente1;
	}
	public void setCliente1(Cliente cliente1) {
		this.cliente1 = cliente1;
	}
	public Cliente getCliente2() {
		return cliente2;
	}
	public void setCliente2(Cliente cliente2) {
		this.cliente2 = cliente2;
	}
	public Cliente getCliente3() {
		return cliente3;
	}
	public void setCliente3(Cliente cliente3) {
		this.cliente3 = cliente3;
	}
	public Objeto getObjeto1() {
		return objeto1;
	}
	public void setObjeto1(Objeto objeto1) {
		this.objeto1 = objeto1;
	}
	public Objeto getObjeto2() {
		return objeto2;
	}
	public void setObjeto2(Objeto objeto2) {
		this.objeto2 = objeto2;
	}
	public Objeto getObjeto3() {
		return objeto3;
	}
	public void setObjeto3(Objeto objeto3) {
		this.objeto3 = objeto3;
	}

	//toString

	public String toString() {
		return "Empresa [nombre=" + nombre + ", nit=" + nit + ", prestamo1=" + prestamo1 + ", prestamo2=" + prestamo2
				+ ", prestamo3=" + prestamo3 + ", empleado1=" + empleado1 + ", empleado2=" + empleado2 + ", empleado3="
				+ empleado3 + ", cliente1=" + cliente1 + ", cliente2=" + cliente2 + ", cliente3=" + cliente3
				+ ", objeto1=" + objeto1 + ", objeto2=" + objeto2 + ", objeto3=" + objeto3 + "]";
	}

	/**
	 * Metod agregarEmpleados
	 * Responsable: andres taborda
	 * ejercicio: 1
	 *
	 * @param nombre
	 * @param codigo
	 * @param correo
	 * @param aniosExperiencia
	 *
	 * @return
	 *
	 */

	public String agregarEmpleados(String nombre, String codigo, String correo, int aniosExperiencia){

		if(empleado1 == null){
			empleado1 = new Empleado(nombre, codigo , correo , aniosExperiencia);

			return "Empleado 1 creado con exito";
		}else{
			if(empleado2 == null){
				empleado2 = new Empleado(nombre, codigo , correo , aniosExperiencia);

				return "Empleado 2 creado con exito";
			}else{
				if(empleado3 == null){
					empleado3 = new Empleado(nombre, codigo , correo , aniosExperiencia);

					return "Empleado 3 creado con exito";
				}else{
					return "Ya existen los 3 empleados posibles creados";
				}
			}
		}

	}


	public String agregarClientes (String documento, String nombre, String genero, String ciudadResidencia,TipoDocumento tipoDocumento){

		if(cliente1 == null){
			cliente1 = new Cliente(documento, nombre, genero, ciudadResidencia,tipoDocumento);

			return "Cliente 1 creado con exito";
		}else{
			if(cliente2 == null){
				cliente2 = new Cliente(documento, nombre, genero, ciudadResidencia,tipoDocumento);

				return "Cliente 2 creado con exito";
			}else{


					return "Ya existen los 2 clientes posibles a crear";
				}
			}
		}

	}













