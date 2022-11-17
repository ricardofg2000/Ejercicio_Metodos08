package unico;

import java.util.Scanner;

public class Util {

	static int leerInt(String pregunta) {
		Scanner leer = new Scanner(System.in);
		int respuesta;

		escribirL(pregunta);
		respuesta = Integer.parseInt(leer.nextLine());

		return respuesta;
	}

	static double leerDouble(String pregunta) {
		Scanner leer = new Scanner(System.in);
		double respuesta;

		escribirL(pregunta);
		respuesta = Double.parseDouble(leer.nextLine());

		return respuesta;
	}

	static String leerString(String pregunta) {
		Scanner leer = new Scanner(System.in);
		String respuesta;

		escribirL(pregunta);
		respuesta = leer.nextLine();

		return respuesta;
	}

	static float leerFloat(String pregunta) {
		Scanner leer = new Scanner(System.in);
		float respuesta;

		escribirL(pregunta);
		respuesta = Float.parseFloat(leer.nextLine());

		return respuesta;
	}

	static byte leerByte(String pregunta) {
		Scanner leer = new Scanner(System.in);
		byte respuesta;

		escribirL(pregunta);
		respuesta = Byte.parseByte(leer.nextLine());

		return respuesta;
	}

	static void escribir(String texto) {
		System.out.println(texto);
	}
	
	static void escribir(int valor) {
		escribir("" + valor);
	}
	
	static void escribir(double valor) {
		escribir("" + valor);
	}

	static void escribirL(String texto) {
		System.out.print(texto);
	}
	
	static void escribirL(int valor) {
		escribirL("" + valor);
	}
	
	static void escribirL(double valor) {
		escribirL("" + valor);
	}

}
