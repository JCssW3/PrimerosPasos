package lenguaje;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Areas {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Elige una opcián: \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Cárculo");

		int figura = entrada.nextInt();

		switch (figura) {

		case 1:

			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));

			System.out.println("El área del cuadradro es: " + Math.pow(lado, 2));

			break;

		case 2:

			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));

			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));

			System.out.println("El área del rectángulo es: " + base * altura);

			break;

		case 3:

			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));

			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));

			System.out.println("El área del triángulo es: " + (base * altura) / 2);

			break;

		case 4:

			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));

			System.out.print("El área del cárculo es: ");

			System.out.printf("%1.2f", Math.PI * Math.pow(radio, 2));

			break;

		default:

			System.out.println("La opcián no es la correcta");
		}

		entrada.close();
	}

}
