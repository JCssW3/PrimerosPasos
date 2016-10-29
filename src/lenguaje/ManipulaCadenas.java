package lenguaje;

public class ManipulaCadenas {

	public static void main(String[] args) {

		String nombre = "Anaxágoras";

		System.out.println("Mi nombre es " + nombre);

		System.out.println("Mi nombre tiene " + nombre.length() + " letras");

		System.out.println("La primera letra de " + nombre + " es la " + nombre.charAt(0));

		int ultimaLetra;

		ultimaLetra = nombre.length();

		System.out.println("La áltima letra de " + nombre + " es la " + nombre.charAt(ultimaLetra - 1));

	}

}
