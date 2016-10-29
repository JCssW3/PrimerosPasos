package lenguaje;

import java.util.Scanner;

public class EvaluaEdad {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingresa tu edad, por favor:");

		int edad = entrada.nextInt();

		if (edad < 18) {
			System.out.println("Eres adolescente");
		} else if (edad < 40) {
			System.out.println("Eres joven");
		} else if (edad < 65) {
			System.out.println("Eres maduro");
		} else if (edad >= 65) {
			System.out.println("Cuidate");
		}

		entrada.close();

	}

}
