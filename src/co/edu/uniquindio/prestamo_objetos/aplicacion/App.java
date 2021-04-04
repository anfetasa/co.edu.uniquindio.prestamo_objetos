package co.edu.uniquindio.prestamo_objetos.aplicacion;
import co.edu.uniquindio.prestamo_objetos.model.metodosImpresiones;
import co.edu.uniquindio.programajugueteria.model.TipoJuguete;

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

				break;


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
		System.out.println("3 -");
		System.out.println("4 -");
		System.out.println("5 -");
		System.out.println("6 -");
		System.out.println("7 -");
		System.out.println("8 -");
		System.out.println("9 -");
		System.out.println("10 -");
		System.out.println("11 -");
		System.out.println("12 -");
	}

}
