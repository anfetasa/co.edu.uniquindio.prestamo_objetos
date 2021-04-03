package co.edu.uniquindio.prestamo_objetos.model;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class metodosImpresiones {

//leer double por ventana

	public static double leerDoubleVentana (String mensaje)
	{
		double dato= Double.parseDouble(JOptionPane.showInputDialog(mensaje));
		return dato;
	}

//impimir string en ventana

	public static String  leerStringVentana(String mensaje) {
		String respuesta = "";
		respuesta  = JOptionPane.showInputDialog(mensaje);
		return respuesta;

	}

//leer entero por ventana

	 public static int leerEnteroVentana (String mensaje)
	   {
	    	int dato= Integer.parseInt(JOptionPane.showInputDialog(mensaje));
	    	return dato;
	   }

//Ingresar variables por consola de un entero

	private static int leerEntero(String mensaje) {
		int dato = 0;
		String captura = "";
		System.out.println(mensaje);
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		captura = teclado.nextLine();
		dato = Integer.parseInt(captura);
		return dato;
	}

//Ingresar variables por consola de un double

	public static double leerDoubleConsola(String mensaje)
	{
		double dato=0;
		String captura="";
		System.out.println(mensaje);
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		captura = teclado.nextLine();
		dato=Double.parseDouble(captura);
		return dato;
	}

//Ingresar variables por consola de un string

	public static String leerStringConsola(String mensaje)
	{
		String captura="";
		System.out.println(mensaje);
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		captura = teclado.nextLine();
		return captura;
	}
}
