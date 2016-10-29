package lenguaje;

public class EjemploArray2D {

	public static void main(String[] args) {

		// Declaro las variables
		double acumulado;
		double interes = 0.10;

		// Declaro el array bidimensional saldo
		double[][] saldo = new double[6][5];

		// Ahora voy a recorrer el array armando la tabla de intereses
		for (int i = 0; i < 6; i++) {

			// Para todos los indices 0 del primer array coloco $10000.-
			saldo[i][0] = 10000;
			// Inicializo nuevamente el acumulado en $10000.-
			acumulado = 10000;

			for (int j = 1; j < 5; j++) {

				// Ahora para los siguientes indices voy calculando el acumulado
				// por el interes
				acumulado = acumulado + (acumulado * interes);

				saldo[i][j] = acumulado;

			}

			// una vez completo, le adiciono un 1% para los siguientes 5
			// sub-indices
			interes = interes + 0.01;

		}

		for (int z = 0; z < 6; z++) {

			System.out.println();

			for (int h = 0; h < 5; h++) {

				System.out.printf("%1.2f", saldo[z][h]);

				System.out.print(" ");

			}

		}

	}

}
