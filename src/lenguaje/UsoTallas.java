package lenguaje;/*
 * USO:
 * - Tipos enumerados [Enum]
 * - Convertir la entrada a mayásculas [.toUpperCase()]
 * -
 */

import java.util.Scanner;

public class UsoTallas {

	// enum Talla {MINI, MEDIANO, GRANDE, MUY_GRANDE};

	enum Talla {

		// Estos on objetos que se instancian automáticamente a si mismos
		// y son de la clase Talla;
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");

		private String abreviatura;

		Talla(String abreviatura) {

			this.abreviatura = abreviatura;

		}

		public String dameAbreviatura() {

			return abreviatura;

		}

	}

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una talla:  MINI, MEDIANO, GRANDE, MUY_GRANDE");

		// Le pido al usuario que ingrese una talla y .toUpperCase() lo
		// transforma a mayásculas
		String entradaDatos = entrada.next().toUpperCase();

		// asigno lo que el usuario ingresá a un objeto de la clase talla
		// que va a contener un "objeto" del tipo Talla."lo que ingreso" [MINI,
		// MEDIANO, GRANDE, MUY_GRANDE]
		Talla laTalla = Enum.valueOf(Talla.class, entradaDatos);

		System.out.println("Talla= " + laTalla);
		System.out.println("Abreviatura= " + laTalla.dameAbreviatura());

		entrada.close();

	}

}
