package co.edu.uniquindio.prestamo_objetos.model;

import java.io.Console;

import javax.swing.JOptionPane;

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
	private Objeto objeto1;
	private Objeto objeto2;
	private Objeto objeto3;
	private DetallePrestamo detallePrestamo1;
	private DetallePrestamo detallePrestamo2;
	private DetallePrestamo detallePrestamo3;
	private DetallePrestamo detallePrestamo4;
	private DetallePrestamo detallePrestamo5;
	private DetallePrestamo detallePrestamo6;

	private double dineroRecaudado = 0;






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

	public DetallePrestamo getDetallePrestamo1() {
		return detallePrestamo1;
	}

	public void setDetallePrestamo1(DetallePrestamo detallePrestamo1) {
		this.detallePrestamo1 = detallePrestamo1;
	}

	public DetallePrestamo getDetallePrestamo2() {
		return detallePrestamo2;
	}

	public void setDetallePrestamo2(DetallePrestamo detallePrestamo2) {
		this.detallePrestamo2 = detallePrestamo2;
	}

	public DetallePrestamo getDetallePrestamo3() {
		return detallePrestamo3;
	}

	public void setDetallePrestamo3(DetallePrestamo detallePrestamo3) {
		this.detallePrestamo3 = detallePrestamo3;
	}

	public DetallePrestamo getDetallePrestamo4() {
		return detallePrestamo4;
	}

	public void setDetallePrestamo4(DetallePrestamo detallePrestamo4) {
		this.detallePrestamo4 = detallePrestamo4;
	}

	public DetallePrestamo getDetallePrestamo5() {
		return detallePrestamo5;
	}

	public void setDetallePrestamo5(DetallePrestamo detallePrestamo5) {
		this.detallePrestamo5 = detallePrestamo5;
	}

	public DetallePrestamo getDetallePrestamo6() {
		return detallePrestamo6;
	}

	public void setDetallePrestamo6(DetallePrestamo detallePrestamo6) {
		this.detallePrestamo6 = detallePrestamo6;
	}
	public double getDineroRecaudado() {
		return dineroRecaudado;
	}

	public void setDineroRecaudado(double dineroRecaudado) {
		this.dineroRecaudado = dineroRecaudado;
	}

	//toString

	public String toString() {
		return "Empresa [nombre=" + nombre + ", nit=" + nit + ", prestamo1=" + prestamo1 + ", prestamo2=" + prestamo2
				+ ", prestamo3=" + prestamo3 + ", empleado1=" + empleado1 + ", empleado2=" + empleado2 + ", empleado3="
				+ empleado3 + ", cliente1=" + cliente1 + ", cliente2=" + cliente2 + ", objeto1=" + objeto1
				+ ", objeto2=" + objeto2 + ", objeto3=" + objeto3 + ", detallePrestamo1=" + detallePrestamo1
				+ ", detallePrestamo2=" + detallePrestamo2 + ", detallePrestamo3=" + detallePrestamo3
				+ ", detallePrestamo4=" + detallePrestamo4 + ", detallePrestamo5=" + detallePrestamo5
				+ ", detallePrestamo6=" + detallePrestamo6 + "]";
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


	/**
	 * Metod: agregarClientes
	 * Responsable: Juan Giraldo
	 * Ejercicio 2
	 *
	 *
	 * @param documento
	 * @param nombre
	 * @param genero
	 * @param ciudadResidencia
	 * @param tipoDocumento
	 * @return
	 */


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



	/**
	 * Metod: crearObjeto
	 * Responsable: Juan Giraldo
	 * Ejercicio 3.1
	 *
	 * @param nombre
	 * @param codigo
	 * @param unidadesDisponibles
	 * @param estado
	 * @param precioAlquiler
	 * @return
	 */
	public String crearObjeto (String nombre, String codigo, int unidadesDisponibles, double precioAlquiler){

		if(objeto1 == null){

			if(unidadesDisponibles > 0){
				objeto1 = new Objeto(nombre, codigo, unidadesDisponibles, "DISPONIBLE",precioAlquiler);
			}
			else{
				objeto1 = new Objeto(nombre, codigo, unidadesDisponibles, "NO DISPONIBLE",precioAlquiler);
			}

			return "Objeto 1 creado con exito";
		}else{
			if(objeto2 == null){
				if(unidadesDisponibles > 0){
					objeto2 = new Objeto(nombre, codigo, unidadesDisponibles, "DISPONIBLE",precioAlquiler);
				}
				else{
					objeto2 = new Objeto(nombre, codigo, unidadesDisponibles, "NO DISPONIBLE",precioAlquiler);
				}

				return "Objeto 2 creado con exito";
			}else{
				if (objeto3 == null){

					if(unidadesDisponibles > 0){
						objeto3 = new Objeto(nombre, codigo, unidadesDisponibles, "DISPONIBLE",precioAlquiler);
					}
					else{
						objeto3 = new Objeto(nombre, codigo, unidadesDisponibles, "NO DISPONIBLE",precioAlquiler);
					}

					return "Objeto 3 creado con exito";


				}else{
					return "Ya existen los 3 objetos posibles a crear";
				}

			  }
		   }
		}


	/**
	 * Metod: obtenerObjeto
	 * Responsable: Juan Giraldo
	 * Ejercicio 3.2
	 * @param codigo
	 * @return retorna un objeto el cual se obtiene por medio del codigo
	 */

     public Objeto obtenerObjeto(String codigo) {

		Objeto objeto = null;

		if( objeto1 != null && objeto1.getCodigo().equalsIgnoreCase(codigo)){
			objeto = objeto1;
			return objeto;
		}
		if(objeto2 != null && objeto2.getCodigo().equalsIgnoreCase(codigo)){
			objeto = objeto2;
			return objeto;
		}
		if( objeto3 != null && objeto3.getCodigo().equalsIgnoreCase(codigo)){
			objeto = objeto3;
			return objeto;
		}

		return objeto;

	}


   /**
    * Metod: reemplazarObjeto
    * Responsable: Juan Giraldo
    * Ejercicio 3.5
    * @param nuevoNombre
    * @param codigo
    * @param nuevaUnidadesDisponibles
    * @param nuevoEstado
    * @param nuevoPrecioAlquiler
    * @return
    */

	public String reemplazarObjeto(String nuevoNombre, String codigo, int nuevaUnidadesDisponibles,
			 double nuevoPrecioAlquiler) {



		Objeto objetoEncontrado = obtenerObjeto(codigo);

		if(objetoEncontrado == null){
			return "El Objeto no existe";
		}else{
			objetoEncontrado.setNombre(nuevoNombre);
			objetoEncontrado.setUnidadesDisponibles(nuevaUnidadesDisponibles);
		    objetoEncontrado.setPrecioAlquiler(nuevoPrecioAlquiler);

			return "El objeto fue reemplazado";
		}

	}

     /**
      * metodo que sirve para consultar en cuantos prestamos esta un objeto
      *
      * @param nombreObjeto
      * @return
      */
	public int consultarObjetoEnPrestamos(String nombreObjeto){



    int cantPrestamos=0;



    if(prestamo1 != null ) {

      if(prestamo1.encontrarObjetoNombrado(nombreObjeto)){

    	  cantPrestamos= cantPrestamos+1;
      }

    }

    if(prestamo2 != null ) {

        if(prestamo2.encontrarObjetoNombrado(nombreObjeto)){

      	  cantPrestamos= cantPrestamos+1;
        }

      }

    if(prestamo3 != null ) {

        if(prestamo3.encontrarObjetoNombrado(nombreObjeto)){

      	  cantPrestamos= cantPrestamos+1;
        }

      }


    return cantPrestamos;


    }

	 /**
	    * Metod: crearPrestamo
	    * Responsable: Andres Taborda
	    * Ejercicio 4.1
	    * @param codigo
	    * @param diasSolicitados
	    * @param codigoCliente
	    * @param codigoEmpleado
	    * @param unidadesPrestadas
	    * @param codigoObjeto
	    * @return
	    */

		public String crearPrestamo(String codigo, int diasSolicitados, String codigoCliente, String codigoEmpleado, int unidadesPrestadas, String codigoObjeto){


			Objeto objeto = obtenerObjeto(codigoObjeto);
			int unidadesDisponibles = objeto.getUnidadesDisponibles();
			if(unidadesDisponibles >= unidadesPrestadas){
	
				if(prestamo1== null){
					prestamo1 = new Prestamo(codigo, diasSolicitados, 0, codigoCliente, codigoEmpleado);
	
					return "Prestamo 1 creado con exito";
	
				}else{
					if(prestamo2 == null){
						prestamo2 = new Prestamo(codigo, diasSolicitados, 0, codigoCliente, codigoEmpleado);
	
						return "Prestamo 2 creado con exito";
					}else{
						if(prestamo3 == null){
							prestamo3 = new Prestamo(codigo, diasSolicitados, 0, codigoCliente, codigoEmpleado);
	
							return "Prestamo 3 creado con exito";
						}else{
							return "Ya existen los 3 prestamos posibles creados";
						}
					}
				}
			}else{
	
				return null;
			}
		}
	
		 /**
			* Metod: detallePrestamo
			* Responsable: Andres Taborda
			* @param codigoPrestamo
			* @param codigoObjeto
			* @param unidadesPrestadas
			* @return
			*/
		public String detallePrestamo(String codigoPrestamo, String codigoObjeto, int unidadesPrestadas){
	
			String msg = "";
			Objeto objeto = obtenerObjeto(codigoObjeto);
			double sobTotal = objeto.getPrecioAlquiler();
			int diasSolicitados;
			int unidadesDisponibles = objeto.getUnidadesDisponibles();
			try{
				if(prestamo1 != null && prestamo1.getCodigo().equalsIgnoreCase(codigoPrestamo)){
					if(detallePrestamo1 == null){
						diasSolicitados = prestamo1.getDiasSolicitados();
						msg = crearDetallePrestamo(unidadesPrestadas, unidadesDisponibles, sobTotal, codigoPrestamo, codigoObjeto);
						if(unidadesDisponibles >= unidadesPrestadas){
	
							detallePrestamo1 = new DetallePrestamo(unidadesPrestadas, sobTotal, codigoPrestamo, codigoObjeto);
							prestamo1.setValor(sobTotal);
							calcularValor(diasSolicitados);
						}
						return msg;
	
					}else{
						if(detallePrestamo2 == null){
	
							diasSolicitados = prestamo1.getDiasSolicitados();
							msg = crearDetallePrestamo(unidadesPrestadas, unidadesDisponibles, sobTotal, codigoPrestamo, codigoObjeto);
							if(unidadesDisponibles >= unidadesPrestadas){
	
								detallePrestamo2 = new DetallePrestamo(unidadesPrestadas, sobTotal, codigoPrestamo, codigoObjeto);
								prestamo1.setValor(sobTotal);
								calcularValor(diasSolicitados);
							}
							return msg;
						}else{
							return "No se pueden adicionar mas objetos al prestamo";
						}
					}
				}else{
					if(prestamo2 != null && prestamo2.getCodigo().equalsIgnoreCase(codigoPrestamo)){
						if(detallePrestamo3 == null){
	
	
							diasSolicitados = prestamo2.getDiasSolicitados();
							msg = crearDetallePrestamo(unidadesPrestadas, unidadesDisponibles, sobTotal, codigoPrestamo, codigoObjeto);
							if(unidadesDisponibles >= unidadesPrestadas){
	
								detallePrestamo3 = new DetallePrestamo(unidadesPrestadas, sobTotal, codigoPrestamo, codigoObjeto);
								prestamo2.setValor(sobTotal);
								calcularValor(diasSolicitados);
							}
	
							return msg;
	
						}else{
							if(detallePrestamo4 == null){
	
	
								diasSolicitados = prestamo2.getDiasSolicitados();
								msg = crearDetallePrestamo(unidadesPrestadas, unidadesDisponibles, sobTotal, codigoPrestamo, codigoObjeto);
								if(unidadesDisponibles >= unidadesPrestadas){
	
									detallePrestamo4 = new DetallePrestamo(unidadesPrestadas, sobTotal, codigoPrestamo, codigoObjeto);
									prestamo3.setValor(sobTotal);
									calcularValor(diasSolicitados);
								}
	
								return msg;
							}else{
								return "No se pueden adicionar mas objetos al prestamo";
							}
						}
					}else{
						if(prestamo3 != null && prestamo3.getCodigo().equalsIgnoreCase(codigoPrestamo)){
							if(detallePrestamo5 == null){
	
	
								diasSolicitados = prestamo3.getDiasSolicitados();
								msg = crearDetallePrestamo(unidadesPrestadas, unidadesDisponibles, sobTotal, codigoPrestamo, codigoObjeto);
								if(unidadesDisponibles >= unidadesPrestadas){
	
									detallePrestamo5 = new DetallePrestamo(unidadesPrestadas, sobTotal, codigoPrestamo, codigoObjeto);
									prestamo3.setValor(sobTotal);
									calcularValor(diasSolicitados);
								}
	
								return msg;
	
							}else{
								if(detallePrestamo6 == null){
	
	
									diasSolicitados = prestamo3.getDiasSolicitados();
									msg = crearDetallePrestamo(unidadesPrestadas, unidadesDisponibles, sobTotal, codigoPrestamo, codigoObjeto);
									if(unidadesDisponibles >= unidadesPrestadas){
	
										detallePrestamo6 = new DetallePrestamo(unidadesPrestadas, sobTotal, codigoPrestamo, codigoObjeto);
										prestamo3.setValor(sobTotal);
										calcularValor(diasSolicitados);
									}
	
									return msg;
								}else{
									return "No se pueden adicionar mas objetos al prestamo";
								}
							}
						}
					}
					return "No se puede realizar la operacion";
				}
	
			}catch(Exception e){
				return ("error al crear intente de nuevo " + e);
			}
		}
		 /**
			* Metod: crearDetallePrestamo
			* Responsable: Andres Taborda
			* @param unidadesPrestadas
			* @param unidadesDisponibles
			* @param sobTotal
			* @param codigoPrestamo
			* @param codigoObjeto
			* @return
			*/
	
		public String crearDetallePrestamo(int unidadesPrestadas, int unidadesDisponibles, double sobTotal, String codigoPrestamo, String codigoObjeto){
	
	
			if(unidadesDisponibles >= unidadesPrestadas){
	
	
				unidadesDisponibles -= unidadesPrestadas;
	
				if(objeto1 != null){
	
					if(objeto1.getCodigo().equalsIgnoreCase(codigoObjeto)){
	
	
	
						if(unidadesDisponibles == 0){
	
							objeto1.setEstado("NO DISPONIBLE");
	
						}
	
						objeto1.setUnidadesDisponibles(unidadesDisponibles);
					}
				}
				if (objeto2 != null){
					if(objeto2.getCodigo().equalsIgnoreCase(codigoObjeto)){
	
						if(unidadesDisponibles == 0){
							objeto2.setEstado("NO DISPONIBLE");
						}
						objeto2.setUnidadesDisponibles(unidadesDisponibles);
					}
				}
	
				if(objeto3 != null){
					if( objeto3.getCodigo().equalsIgnoreCase(codigoObjeto)){
						if(unidadesDisponibles == 0){
							objeto3.setEstado("NO DISPONIBLE");
						}
						objeto3.setUnidadesDisponibles(unidadesDisponibles);
					}
				}
				return "Agregado Correctamente";
			}else{
	
				return "No hay las unidades del producto suficientes para el prestamo";
			}
	
		}
	
		/**
			* Metod: consultarDetallePrestamo
			* Responsable: Andres Taborda
			* @param codigoPrestamo
			* @return
			*/
		public void consultarDetallePrestamo( String codigoPrestamo){
	
			DetallePrestamo detallePrestamo = null;
			if( detallePrestamo1 != null && detallePrestamo1.getCodigoPrestamo().equalsIgnoreCase(codigoPrestamo)){
	
				detallePrestamo = detallePrestamo1;
				JOptionPane.showMessageDialog(null, detallePrestamo);
			}
			if( detallePrestamo2 != null && detallePrestamo2.getCodigoPrestamo().equalsIgnoreCase(codigoPrestamo)){
	
				detallePrestamo = detallePrestamo2;
				JOptionPane.showMessageDialog(null, detallePrestamo);
			}
			if( detallePrestamo3 != null && detallePrestamo3.getCodigoPrestamo().equalsIgnoreCase(codigoPrestamo)){
	
				detallePrestamo = detallePrestamo3;
				JOptionPane.showMessageDialog(null, detallePrestamo);
			}
			if( detallePrestamo4 != null && detallePrestamo4.getCodigoPrestamo().equalsIgnoreCase(codigoPrestamo)){
	
				detallePrestamo = detallePrestamo4;
				JOptionPane.showMessageDialog(null, detallePrestamo);
			}
			if( detallePrestamo5 != null && detallePrestamo5.getCodigoPrestamo().equalsIgnoreCase(codigoPrestamo)){
	
				detallePrestamo = detallePrestamo5;
				JOptionPane.showMessageDialog(null, detallePrestamo);
			}
			if( detallePrestamo6 != null && detallePrestamo6.getCodigoPrestamo().equalsIgnoreCase(codigoPrestamo)){
	
				detallePrestamo = detallePrestamo6;
				JOptionPane.showMessageDialog(null, detallePrestamo);
			}
	
	
		}
		/**
			* Metod: consultarPrestamo
			* Responsable: Andres Taborda
			* @param codigoPrestamo
			* @return
			*/
		public Prestamo consultarPrestamo(String codigoPrestamo){
	
	
			Prestamo prestamo= null;
	
			if( prestamo1 != null && prestamo1.getCodigo().equalsIgnoreCase(codigoPrestamo)){
	
				consultarDetallePrestamo(codigoPrestamo);
	
				prestamo = prestamo1;
				return prestamo;
			}
			if( prestamo2 != null && prestamo2.getCodigo().equalsIgnoreCase(codigoPrestamo)){
	
				consultarDetallePrestamo(codigoPrestamo);
				prestamo = prestamo2;
				return prestamo;
			}
			if( prestamo3 != null && prestamo3.getCodigo().equalsIgnoreCase(codigoPrestamo)){
	
				consultarDetallePrestamo(codigoPrestamo);
				prestamo = prestamo3;
				return prestamo;
			}
			return prestamo;
		}
		/**
			* Metod: calcularValor
			* Responsable: Andres Taborda
			* @param diasTrasncurridos
			* @return
			*/
		public void calcularValor(int diasTrasncurridos){
			int dias = 0;
			double alquiler = 0;
			double valor = 0;
			if(prestamo1 != null){
				dias = 0;
				alquiler = 0;
				valor = 0;
				dias = prestamo1.getDiasSolicitados();
				alquiler = prestamo1.getValor();
				if (detallePrestamo2 != null){
					valor = detallePrestamo1.getSobTotal() +  detallePrestamo2.getSobTotal();
				}else{
					valor = detallePrestamo1.getSobTotal();
				}
				if ( diasTrasncurridos > dias){
					valor = valor + (( (70 * valor) / 100) * (diasTrasncurridos-1)) ;
	
				}
				prestamo1.setValor(valor);
				calcularDineroReacudado();
	
			}
			if(prestamo2 != null){
				dias = 0;
				alquiler = 0;
				valor = 0;
				dias = prestamo2.getDiasSolicitados();
				alquiler = prestamo1.getValor();
				if (detallePrestamo4 != null){
					valor = detallePrestamo3.getSobTotal() +  detallePrestamo4.getSobTotal();
				}else{
					valor = detallePrestamo3.getSobTotal();
				}
				if ( diasTrasncurridos > dias){
	
					valor = valor + (( (70 * valor) / 100) * (diasTrasncurridos-1)) ;
	
				}
				prestamo2.setValor(valor);
				calcularDineroReacudado();
	
			}
			if(prestamo3 != null){
				dias = 0;
				alquiler = 0;
				valor = 0;
				dias = prestamo3.getDiasSolicitados();
				alquiler = prestamo1.getValor();
				if (detallePrestamo6 != null){
					valor = detallePrestamo6.getSobTotal() +  detallePrestamo5.getSobTotal();
				}else{
					valor = detallePrestamo5.getSobTotal();
				}
				if ( diasTrasncurridos > dias){
					valor = valor + (( (70 * valor) / 100) * (diasTrasncurridos-1)) ;
	
				}
				prestamo3.setValor(valor);
				calcularDineroReacudado();
	
			}
		}
		/**
			* Metod: entregar
			* Responsable: Andres Taborda
			* @param codigoPrestamo
			* @param diasTrasncurridos
			* @return
			*/
		public String entregar(String codigoPrestamo, int diasTrasncurridos){
			int opcion;
			double costo;
			if(prestamo1.getCodigo().equalsIgnoreCase(codigoPrestamo)){
				calcularValor(diasTrasncurridos);
	
				costo = prestamo1.getValor();
				JOptionPane.showMessageDialog(null, "El valor del prestamo es: " + costo);
	
				opcion = metodosImpresiones.leerEnteroVentana("Ingrese 1 para confirmar la entrega 2 para rechazar");
	
				switch (opcion) {
				case 1:
					prestamo1 = null;
					detallePrestamo1 = null;
					detallePrestamo2 = null;
					return "eliminado con exito";
				case 2:
					return "Su prestamo sigue pendiente";
	
				default:
	
	
					return "El prestamo no existe";
				}
			}else{
				if(prestamo2.getCodigo().equalsIgnoreCase(codigoPrestamo)){
					calcularValor(diasTrasncurridos);
	
					costo = prestamo2.getValor();
					JOptionPane.showMessageDialog(null, "El valor del prestamo es: " + costo);
	
					opcion = metodosImpresiones.leerEnteroVentana("Ingrese 1 para confirmar la entrega 2 para rechazar");
	
					switch (opcion) {
					case 1:
						prestamo2 = null;
						detallePrestamo3 = null;
						detallePrestamo4 = null;
						return "eliminado con exito";
					case 2:
						return "Su prestamo sigue pendiente";
	
					default:
	
	
						return "El prestamo no existe";
					}
				}else{
					if(prestamo3.getCodigo().equalsIgnoreCase(codigoPrestamo)){
						calcularValor(diasTrasncurridos);
	
						costo = prestamo3.getValor();
						JOptionPane.showMessageDialog(null, "El valor del prestamo es: $" + costo);
	
						opcion = metodosImpresiones.leerEnteroVentana("Ingrese 1 para confirmar la entrega 2 para rechazar");
	
						switch (opcion) {
						case 1:
							prestamo3 = null;
							detallePrestamo5 = null;
							detallePrestamo6 = null;
							return "eliminado con exito";
	
						case 2:
							return "Su prestamo sigue pendiente";
	
						default:
	
							return "El prestamo no existe";
	
						}
					}else{
						return "El prestamo no existe";
					}
				}
			}
	
		}
		/**
			* Metod: cantidadPrestamosEmpleado
			* Responsable: Andres Taborda
			* @param codigoEmpleado
			* @return
			*/
		public int cantidadPrestamosEmpleado(String codigoEmpleado){
			int cont = 0;
			if(prestamo1 != null && prestamo1.getCodigoEmpleado().equalsIgnoreCase(codigoEmpleado)){
				cont++;
	
	
	
			}else{
				if(prestamo2 != null && prestamo2.getCodigoEmpleado().equalsIgnoreCase(codigoEmpleado)){
					cont++;
	
	
	
				}else{
					if(prestamo3 != null && prestamo3.getCodigoEmpleado().equalsIgnoreCase(codigoEmpleado)){
						cont++;
	
	
	
					}else{
						return cont;
					}
				}
			}
	
			return cont;
		}
		/**
			* Metod: empleadoUnidadesPrestadas
			* Responsable: Andres Taborda
			* @return
			*/
		public String empleadoUnidadesPrestadas(){
	
			int uniPrestadasPrestamo1 = 0;
			int uniPrestadasPrestamo2 = 0;
			int uniPrestadasPrestamo3 = 0;
			String codigoEmpleado;
			try{
				if(detallePrestamo2 != null){
					uniPrestadasPrestamo1 =  detallePrestamo1.getUnidadesPrestadas() + detallePrestamo2.getUnidadesPrestadas();
				}
				else{
					if(detallePrestamo1 != null){
					uniPrestadasPrestamo1 = detallePrestamo1.getUnidadesPrestadas();
					}
				}
			}catch (Exception e) {
				return "1";
			}
	
			try{
				if(detallePrestamo4 != null){
					uniPrestadasPrestamo2 =  detallePrestamo3.getUnidadesPrestadas() + detallePrestamo4.getUnidadesPrestadas();
				}else{
					if(detallePrestamo3 != null){
						uniPrestadasPrestamo2 = detallePrestamo3.getUnidadesPrestadas();
					}
				}
			}catch (Exception e) {
				return "2";
			}
	
			try{
				if(detallePrestamo6 != null){
	
					uniPrestadasPrestamo3 =  detallePrestamo5.getUnidadesPrestadas() + detallePrestamo6.getUnidadesPrestadas();
				}else{
					if(detallePrestamo5 != null){
						uniPrestadasPrestamo3 = detallePrestamo5.getUnidadesPrestadas();
					}
				}
			}
			catch(Exception e){
	
				return "3";
			}
	
	
			if (uniPrestadasPrestamo1 > uniPrestadasPrestamo2) {
				if (uniPrestadasPrestamo1 > uniPrestadasPrestamo3) {
					codigoEmpleado = prestamo1.getCodigoEmpleado();
					Empleado empleado = obtenerEmpleado(codigoEmpleado);
					String msg = "El empleado con mas unidades prestadas es: " + empleado + " y tiene una cantidad de: " + uniPrestadasPrestamo1+ " unidades prestadas ";
					return msg;
				} else {
					codigoEmpleado = prestamo3.getCodigoEmpleado();
					Empleado empleado = obtenerEmpleado(codigoEmpleado);
					String msg = "El empleado con mas unidades prestadas es: " + empleado + " y tiene una cantidad de: " + uniPrestadasPrestamo3+ " unidades prestadas ";
					return msg;
				}
			} else if (uniPrestadasPrestamo2 > uniPrestadasPrestamo3) {
				codigoEmpleado = prestamo2.getCodigoEmpleado();
				Empleado empleado = obtenerEmpleado(codigoEmpleado);
				String msg = "El empleado con mas unidades prestadas es: " + empleado + " y tiene una cantidad de: " + uniPrestadasPrestamo2+ " unidades prestadas ";
				return msg;
			} else {
				codigoEmpleado = prestamo3.getCodigoEmpleado();
				Empleado empleado = obtenerEmpleado(codigoEmpleado);
				String msg = "El empleado con mas unidades prestadas es: " + empleado + " y tiene una cantidad de: " + uniPrestadasPrestamo3+ " unidades prestadas ";
				return msg;
			}
	
		}
		/**
			* Metod: obtenerEmpleado
			* Responsable: Andres Taborda
			* @param codigoEmpleado
			* @return
			*/
		public Empleado obtenerEmpleado(String codigoEmpleado){
			if(empleado1 != null && empleado1.getCodigo().equalsIgnoreCase(codigoEmpleado)){
				return empleado1;
			}else{
				if(empleado2 != null && empleado2.getCodigo().equalsIgnoreCase(codigoEmpleado)){
					return empleado2;
				}else{
					if(empleado3 != null && empleado3.getCodigo().equalsIgnoreCase(codigoEmpleado)){
						return empleado3;
					}else{
						return null;
					}
				}
			}
	
	
		}
		/**
			* Metod void: calcularDineroReacudado
			* Responsable: Andres Taborda
			*/
	
		public void calcularDineroReacudado(){
	
			if(prestamo1 != null){
				dineroRecaudado += prestamo1.getValor();
			}
			if(prestamo2 != null){
				dineroRecaudado += prestamo2.getValor();
			}
			if(prestamo3 != null){
				dineroRecaudado += prestamo3.getValor();
			}
	
		
		}
	
		
}




	















