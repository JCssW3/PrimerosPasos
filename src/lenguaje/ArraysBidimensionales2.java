package lenguaje;

public class ArraysBidimensionales2 {

	public static void main(String[] args) {

		int[][] matrix = { { 15, 21, 18, 9, 15 }, { 12, 23, 42, 54, 1 }, { 3, 43, 5, 23, 12 }, { 12, 43, 98, 9, 10 } };

		for (int[] fila : matrix) {

			System.out.println();

			for (int z : fila) {

				System.out.print(z + " ");

			}

		}

	}

}
