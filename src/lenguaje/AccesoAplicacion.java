package lenguaje;

import javax.swing.JOptionPane;

public class AccesoAplicacion {

	public static void main(String[] args) {

		String clave = "Juan";

		String pass = "";

		while (!clave.equals(pass)) {

			pass = JOptionPane.showInputDialog("Introduce la contraseña, por favor");

			if (!clave.equals(pass)) {

				System.out.println("Contraseña incorrecta");

			}
		}

		System.out.println("Contraseña correcta. Acceso permitido");

	}

}
