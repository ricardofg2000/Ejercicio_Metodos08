package unico;

public class Ejercicio08 {

	public static void main(String[] args) {
		/*
		 * Implementar un método llamado divisoresPrimos que muestre por consola, cuáles
		 * son los divisores primos del número que se le pasa como parámetro.
		 */

		int num;
		int n_divP;
		String resultado;

		num = Util.leerInt("Introduzca un número: ");

		resultado = divisoresPrimos(num);

		Util.escribir(resultado);

	}

	public static String divisoresPrimos(int num) {
		int cont = 0;
		String mensaje = "Los divisores primos de " + num + ": ";
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				if (esPrimo(i)) {
					mensaje += i + " ";
				}
			}
		}
		return mensaje;
	}

	static boolean esPrimo(int num) {
		boolean primo = true;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				primo = false;
			}
		}
		return primo;
	}

}
