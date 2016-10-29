/*
 * USO:
 * - Constante [final]
 * - Variable [static]
 * - Mátodo [static]
 */

package desuso;

public class Pruebas {

	public static void main(String[] args) {

		Empleados empleado1 = new Empleados("Paco Rubén");
		Empleados empleado2 = new Empleados("Ana Leticia");
		Empleados empleado3 = new Empleados("Maráa Ines");

		empleado2.cambiaSeccion("RRHH");

		Empleados[] empleados = { empleado1, empleado2, empleado3 };

		for (Empleados e : empleados) {
			System.out.println(e.devuelveDatos());
		}

		System.out.println(Empleados.devuelveIdSiguiente());

	}

}

class Empleados {

	private final String nombre;
	private String seccion;
	private int id;
	public static int idSiguiente = 1;

	public Empleados(String nom) {

		nombre = nom;
		seccion = "Administración";
		id += idSiguiente;

		idSiguiente++; //

	}

	public void cambiaSeccion(String seccion) {

		this.seccion = seccion;

	}

	public String devuelveDatos() {

		return "El nombre es: " + nombre + ", su ID= " + id + ", y la sección es: " + seccion;

	}

	public static String devuelveIdSiguiente() {
		// Los métodos estáticos solo pueden acceder a variables estáticas

		return "El siguiente ID es: " + idSiguiente;

	}

}
