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

			case 2:

				break;

			case 3:

				break;


			default:
				break;
			}

		}while(opcion != 15);
	}


	//metodo del menu de opciones

	public static void mostrarMenu(){
		System.out.println("------Opciones de menu------");
		System.out.println("1 - Crear un nuevo empleado");
		System.out.println("2 - ");
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
