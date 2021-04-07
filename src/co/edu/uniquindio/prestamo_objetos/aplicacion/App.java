package co.edu.uniquindio.prestamo_objetos.aplicacion;
import co.edu.uniquindio.prestamo_objetos.model.metodosImpresiones;


import java.time.temporal.JulianFields;

import javax.swing.JOptionPane;

import co.edu.uniquindio.prestamo_objetos.model.Cliente;
import co.edu.uniquindio.prestamo_objetos.model.DetallePrestamo;
import co.edu.uniquindio.prestamo_objetos.model.Empleado;
import co.edu.uniquindio.prestamo_objetos.model.Empresa;
import co.edu.uniquindio.prestamo_objetos.model.Objeto;
import co.edu.uniquindio.prestamo_objetos.model.Prestamo;
import co.edu.uniquindio.prestamo_objetos.model.TipoDocumento;

public class App {


	//metodo main

	public static void main(String[] args) {


		int opcion = 0;


		TipoDocumento tipoDocuemento= null;

		Empresa empresa = new Empresa("Empresa uni", "123");


		do{
			mostrarMenu();
			opcion = metodosImpresiones.leerEnteroVentana("Ingrese la opcion");

			//opcion de casos

			String mensaje;
			switch (opcion) {


			/*
			 * Responsable: Andres Taborda
			 * Ejercicio 1 : crear 3 empleados
			 * */
			case 1:


				String nombreEmpleado = metodosImpresiones.leerStringVentana("Ingrese el nombre del empleado");
				String codigoEmpleado = metodosImpresiones.leerStringVentana("Ingrese el codigo del empleado");
				String correoEmpleado = metodosImpresiones.leerStringVentana("Ingrese el correo del empleado");
				int aniosExperienciaEmpleado = metodosImpresiones.leerEnteroVentana("Ingrese los años de experiencia del empleado");

				String empleado = empresa.agregarEmpleados(nombreEmpleado, codigoEmpleado, correoEmpleado, aniosExperienciaEmpleado);

				JOptionPane.showMessageDialog(null, empleado);

				break;
            /*
             * Responsable: Juan Giraldo
             * Ejercicio 2 : crear 2 clientes
             */
			case 2:


				String documentoCliente = metodosImpresiones.leerStringVentana("Ingrese el documento del cliente");
				String nombreCliente = metodosImpresiones.leerStringVentana("Ingrese el nombre del cliente");
				String generoCliente = metodosImpresiones.leerStringVentana("Ingrese el genero del cliente");
				String ciudadResidenciaCliente = metodosImpresiones.leerStringVentana("Ingrese la ciudad de residencia del cliente");
			    int valorTipo = metodosImpresiones.leerEnteroVentana("Ingrese el tipo de documento: \n 0- Cedula\n 1- Pasaporte\n 2- Cedula Extrangera ");


			    TipoDocumento tipoDocumento = verificarDocumentoIngresado(valorTipo);

			    String cliente = empresa.agregarClientes(documentoCliente,nombreCliente,generoCliente,ciudadResidenciaCliente,tipoDocumento);

				JOptionPane.showMessageDialog(null, cliente);

				break;

			case 3:

				String nombre = metodosImpresiones.leerStringVentana("Ingrese el nombre del objeto");
				String codigo= metodosImpresiones.leerStringVentana("Ingrese el codigo del objeto");
				int unidadesDisponibles = metodosImpresiones.leerEnteroVentana("Ingrese las unidades disponibles del objeto");
			    double precioAlquiler = metodosImpresiones.leerDoubleVentana("Ingrese el precio del alquiler del objeto:");


			    String objeto = empresa.crearObjeto(nombre, codigo, unidadesDisponibles,precioAlquiler);

				JOptionPane.showMessageDialog(null, objeto);

				break;

			case 4:

				//buscar un objeto

				codigo = metodosImpresiones.leerStringVentana("Ingrese el codigo del objeto a buscar: ");

			    Objeto encontrado = empresa.obtenerObjeto(codigo);
				if(encontrado == null){
					JOptionPane.showMessageDialog(null, "El objeto con codigo :" +codigo+ " no existe");

				}else{
					JOptionPane.showMessageDialog(null, "La informacion del objeto es :" +encontrado.toString());
				}


				break;

			case 7:

				//reemplazarObjeto

				codigo = metodosImpresiones.leerStringVentana("Ingrese el codigo del objeto a reemplazar: ");

				String nuevoNombre = metodosImpresiones.leerStringVentana("Ingrese el nombre del objeto:");

				int nuevaUnidadesDisponibles = metodosImpresiones.leerEnteroVentana("Ingrese las unidades disponibles del objeto");
				String nuevoEstado = metodosImpresiones.leerStringVentana("Ingrese el el estado del objeto:\n -Disponible\n -No Disponible");

				double nuevoPrecioAlquiler = metodosImpresiones.leerDoubleVentana("Ingrese el precio del alquiler del objeto");


				mensaje = empresa.reemplazarObjeto(nuevoNombre, codigo,nuevaUnidadesDisponibles,
						 nuevoEstado, nuevoPrecioAlquiler);

				JOptionPane.showMessageDialog(null, mensaje);

			case 8:

				String codigoPrestamo = metodosImpresiones.leerStringVentana("Ingrese el codigo del prestamo");
				int diasSolicitados = metodosImpresiones.leerEnteroVentana("Ingrese la cantidad de dias solicitados del prestamo");
				String documentoEmpleado = metodosImpresiones.leerStringVentana("Ingrese el documento del empleado que esta realizando el prestamo");
				String documentoCliente1 = metodosImpresiones.leerStringVentana("Ingrese el documento del cliente al que se le realiza el prestamo");
				String codigoObjeto = metodosImpresiones.leerStringVentana("Ingrese el codigo del objeto que desee");
				int unidadesPrestadas = metodosImpresiones.leerEnteroVentana("Ingrese la cantidad de unidades solicitadas del objeto");
				String mensaje1 = empresa.crearPrestamo(codigoPrestamo, diasSolicitados, documentoCliente1, documentoEmpleado, unidadesPrestadas, codigoObjeto);

				if(mensaje1 != null){
					String mensaje2 = empresa.detallePrestamo(codigoPrestamo, codigoObjeto, unidadesPrestadas);

					JOptionPane.showMessageDialog(null, mensaje1);
					JOptionPane.showMessageDialog(null, mensaje2);
				}else{
					JOptionPane.showMessageDialog(null, "Existencias insuficientes");
				}



				break;
			case 9:

				String codigoPrestamo2 = metodosImpresiones.leerStringVentana("Ingrese el codigo del prestamo al que le desea agregar mas obbjetos");
				String codigoObjeto1 = metodosImpresiones.leerStringVentana("Ingrese el codigo del obejto para agregar");
				int unidadesPrestadas1 = metodosImpresiones.leerEnteroVentana("Ingrese las unidades que desdea del objeto");
				String mensaje3 = empresa.detallePrestamo(codigoPrestamo2, codigoObjeto1, unidadesPrestadas1);
				JOptionPane.showMessageDialog(null, mensaje3);

				break;
			case 10:

				String codigoPrestamoo = metodosImpresiones.leerStringVentana("Ingrese el codigo del prestamo");
				int diasTranscurridos = metodosImpresiones.leerEnteroVentana("Inrese los dias transcurridos desde que se solicito el prestamo");

				String men = empresa.entregar(codigoPrestamoo, diasTranscurridos);
				JOptionPane.showMessageDialog(null, men);

				break;
			case 11:
				String codigoPrestamo1 = metodosImpresiones.leerStringVentana("Ingrese el codigo del prestamo");
				JOptionPane.showMessageDialog(null, "La informacion respectiva al prestamo es: ");
				JOptionPane.showMessageDialog(null, empresa.consultarPrestamo(codigoPrestamo1));
			default:
				break;
			}

		}while(opcion != 15);
	}

	/**
	 * Metod verificarDocumentoIngresado
	 * Responsable: Juan David Giraldo
	 * @param valorTipo
	 *
	 * @return
	 */

	private static TipoDocumento verificarDocumentoIngresado(int valorTipo) {

		TipoDocumento tipoDocumento = null;


		if(valorTipo == TipoDocumento.CEDULA.getNumTipo()){
			tipoDocumento = TipoDocumento.CEDULA;
		}else{
			if(valorTipo == TipoDocumento.PASAPORTE.getNumTipo()){
				tipoDocumento= TipoDocumento.PASAPORTE;
			}else{
				if(valorTipo == TipoDocumento.CEDULA_EXTRANGERA.getNumTipo()){
					tipoDocumento= TipoDocumento.CEDULA_EXTRANGERA;
				}else{
					JOptionPane.showMessageDialog(null, "tipo de Documento no valido");
				}

			}
		}

		return tipoDocumento;
	}


	//metodo del menu de opciones

	public static void mostrarMenu(){
		System.out.println("------Opciones de menu------");
		System.out.println("1 - Crear un nuevo empleado");
		System.out.println("2 - Crear un nuevo Cliente ");
		System.out.println("3 - Crear un nuevo objeto");
		System.out.println("4 - Buscar un objeto dado su codigo");
		System.out.println("5 -");
		System.out.println("6 -");
		System.out.println("7 - Reemplazar un objeto por otro");
		System.out.println("8 - crear un prestamo");
		System.out.println("9 -Adicionar objeto al prestamo");
		System.out.println("10 -Entregar un prestamo");
		System.out.println("11 -consultar datos de un prestamo");
		System.out.println("12 -");
	}

}
