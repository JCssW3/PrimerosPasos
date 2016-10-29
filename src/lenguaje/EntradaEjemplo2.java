package lenguaje;

import javax.swing.JOptionPane;

public class EntradaEjemplo2 {

	public static void main(String[] args) {

		String nombreUsuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor:");

		String edad = JOptionPane.showInputDialog("Introduce tu edad, por favor");

		int edadUsuario = Integer.parseInt(edad);

		System.out.println("Hola " + nombreUsuario + ", el aáo que viene tendrás " + (edadUsuario + 1) + " aáos");

	}

}
