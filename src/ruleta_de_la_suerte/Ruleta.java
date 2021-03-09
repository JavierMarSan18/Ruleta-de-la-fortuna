package ruleta_de_la_suerte;

import java.util.Scanner;

public class Ruleta {

	public static void main(String[] args) {

		Scanner entry = new Scanner(System.in);
		String[] premios = { "Casa", "Auto", "Dinero", "Viaje", "Smartphone" };
		String op;
		boolean condicion = true;

		do {
			System.out.println("||-----------------------||");
			System.out.println("||         RULETA        ||");
			System.out.println("||-----------------------||");
			System.out.println("||1. Jugar a la ruleta   ||");
			System.out.println("||2. Ver premios         ||");
			System.out.println("||3. Salir               ||");
			System.out.println("||-----------------------||");
			System.out.print(".: ");
			op = entry.nextLine();

			if (op.equals("1")) {
				Ruleta(premios);
			} else if (op.equals("2")) {
				ImprimirPremios(premios);
			} else if (op.equals("3")) {
				condicion = false;
			}
		} while (condicion);

	}

	public static void ImprimirPremios(String[] premios) {
		System.out.println("||-----------------------||");
		System.out.println("||    Premios Posibles   ||");
		System.out.println("||-----------------------||");
		for (int i = 0; i < premios.length; i++) {
			System.out.println("  -" + premios[i]);
		}
	}

	public static void Ruleta(String[] premios) {

		int i = (int) (Math.random() * premios.length);

		System.out.println("Felicidades!!! Tu premio es: " + premios[i]);
	}
}
