package co.edu.uniquindio.prestamo_objetos.aplicacion;
import co.edu.uniquindio.prestamo_objetos.model.metodosImpresiones;
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
			case 1:


				break;

			case 2:

				break;

			default:
				break;
			}

		}while(opcion != 15);
	}


	//metodo del menu de opciones

	public static void mostrarMenu(){
		System.out.println("------Opciones de menu------");
		System.out.println("1 - hacer tal cosa");
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
