/*
 * USO:
 * - Clase [abstract]
 * - Mátodo [abstract]
 * - [Herencia]
 */

package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoPersona {

	public static void main(String[] args) {

		Persona[] persona = new Persona[3];

		persona[0] = new Empleado2("Josá Valles", 5000, 2012, 10, 12);
		persona[1] = new Alumno("Pedro Astore", "Biologáa molecular");
		persona[2] = new Empleado2("Maráa Popitti", 5000, 2015, 9, 12);

		for (Persona p : persona) {

			System.out.println(p.dameDescripcion());

		}

	}

}

//-----------------------------------------------------------------------------------------

abstract class Persona {

	private String nombre;

	public Persona(String nombre) {

		this.nombre = nombre;

	}

	public String dameNombre() {

		return nombre;

	}

	public abstract String dameDescripcion();

}

// -----------------------------------------------------------------------------------------

class Empleado2 extends Persona {

	private double sueldo;
	private Date altaContrato;
	private int id;
	private static int idSiguiente;

	public Empleado2(String nom, double sue, int anio, int mes, int dia) {

		super(nom);
		sueldo = sue;
		GregorianCalendar calendar = new GregorianCalendar(anio, mes - 1, dia);
		altaContrato = calendar.getTime();

		++idSiguiente;
		id = idSiguiente;

	}

	public double dameSueldo() { // GETTER

		return sueldo;

	}

	public Date dameFechaContraro() { // GETTER

		return altaContrato;

	}

	public void subeSueldo(double porcentaje) { // SETTER

		double aumento = sueldo * porcentaje / 100;

		sueldo += aumento;

	}

	public String dameDescripcion(){

		return "El nombre del Empleado es: " + dameNombre() + ", y su ID es: " + id;

	}

}

// -----------------------------------------------------------------------------------------

class Alumno extends Persona {

	private String carrera;

	public Alumno(String nombre, String carrera) {

		super(nombre);
		this.carrera = carrera;

	}

	public String dameDescripcion() {

		return "El nombre del alumno es: " + dameNombre() + ", y su carrera es: " + carrera;

	}

}