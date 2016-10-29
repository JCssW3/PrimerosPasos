package lenguaje;

import javax.swing.JOptionPane;

public class EntradaNumeros {

	public static void main(String[] args) {

		String num1 = JOptionPane.showInputDialog("Introduce un námero");

		double num2 = Double.parseDouble(num1);

		System.out.print("La raáz de " + num2 + " es ");

		System.out.printf("%1.2f", Math.sqrt(num2));

	}

}