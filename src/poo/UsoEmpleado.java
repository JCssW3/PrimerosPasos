/*
 * USO:
 * - Objeto [Date]
 * - Objeto [GregorianCalendar]
 * - Constructores [Sobrecarga]
 * - Llamar al constructor con [this]
 * - [Polimorfismo]
 * - [Casting]
 * - [Interfaces]->[Comparable]
 * - [Arrays.sort()]
 */

package poo;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class UsoEmpleado {

	public static void main(String[] args) {

		Jefatura jefeRRHH = new Jefatura("Juan Perez", 55000, 2006, 9, 25);

		jefeRRHH.estableceIncentivo(2570);

		Empleado[] misEmpleados = new Empleado[6];

		misEmpleados[0] = new Empleado("Paco Gámez", 85000, 1990, 12, 17);
		misEmpleados[1] = new Empleado("Ana Lápez", 95000, 1995, 06, 02);
		misEmpleados[2] = new Empleado("Maráa Martán", 105000, 2002, 03, 15);
		misEmpleados[3] = new Empleado("Antonio Fernández");
		misEmpleados[4] = jefeRRHH; // Polimorfismo en accián - Principio de
									// sustitucián
		misEmpleados[5] = new Jefatura("Maráa Gimánez", 95000, 1999, 5, 6);

		Jefatura jefaFinanzas = (Jefatura) misEmpleados[5];
		
		jefaFinanzas.estableceIncentivo(55000);
		
		System.out.println("El jefe " + jefaFinanzas.dameNombre() + " tiene un bonus de " + jefaFinanzas.estableceBonus(500));

		System.out.println(misEmpleados[3].dameNombre() + " tiene un bonus de " + misEmpleados[3].estableceBonus(200));
		
		System.out.println(jefaFinanzas.tomarDecisiones("Dar más dáas de vacaciones a los empleados"));

		for (Empleado emp : misEmpleados) {

			emp.subeSueldo(5);

		}

		Arrays.sort(misEmpleados);

		for (Empleado emp : misEmpleados) {

			System.out.println("Nombre: " + emp.dameNombre() + " Sueldo: " + emp.dameSueldo() + " Fecha de Alta: "
					+ emp.dameFechaContraro());

		}

	}

}

// -----------------------------------------------------------------------------------------

class Empleado implements Comparable, Trabajadores {

	public Empleado(String nom, double sue, int anio, int mes, int dia) {

		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendar = new GregorianCalendar(anio, mes - 1, dia);
		altaContrato = calendar.getTime();

		++idSiguiente;
		id = idSiguiente;

	}

	// Implementacián de Interface Trabajadores
	public double estableceBonus(double gratificacion){

		return Trabajadores.BONUS_BASE + gratificacion;

	}

	public Empleado(String nom) { // Sobrecarga de constructor

		this(nom, 30000, 2000, 01, 01);

	}

	public String dameNombre() { // GETTER

		return nombre + " ID: " + id;

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

	// Implementamos el mátodo <Interface> Comparable.compareTo();
	public int compareTo(Object miObjeto) {

		Empleado otroEmpleado = (Empleado) miObjeto;

		if (this.sueldo < otroEmpleado.sueldo) {
			return -1;
		}

		if (this.sueldo > otroEmpleado.sueldo) {
			return 1;
		}

		return 0;

	}

	// Declara las variables a lo áltimo! 8-)
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private int id;
	private static int idSiguiente;

}

// -----------------------------------------------------------------------------------------

class Jefatura extends Empleado implements Jefes {

	public Jefatura(String nom, double sue, int anio, int mes, int dia) {

		super(nom, sue, anio, mes, dia);

	}

	// Implementacián de Interface Jefes
	public String tomarDecisiones(String decision){

		return "Un miembro de la direccián ha tomado la decisián de: " + decision;

	}

	// Implementacián de Interface Trabajadores
	public double estableceBonus(double gratificacion){

		double prima = 2000;

		return Trabajadores.BONUS_BASE + gratificacion + prima;

	}

	public void estableceIncentivo(double b) {

		incentivo = b;
	}

	public double dameSueldo() {

		double sueldoJefe = super.dameSueldo();
		return sueldoJefe + incentivo;

	}

	private double incentivo;

}