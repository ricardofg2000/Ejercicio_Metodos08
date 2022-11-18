package unico;

public class Ejercicio07 {

	public static void main(String[] args) {
		/*
		 * Implementar un método al que se le pase un número entero y devuelva el número
		 * de divisores primos que tiene.
		 */

		int num;
		int n_divP;

		num = Util.leerInt("Introduzca un número: ");

		n_divP = funcion1(num);
		
		Util.escribir("El número " + num + " tiene " + n_divP + " divisores primos");
	}

	public static int funcion1(int num) {
		int cont = 0;
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				if (esPrimo(i)) {
					Util.escribir(i);
					cont += 1;
				}
			}
		}
		return cont;
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
