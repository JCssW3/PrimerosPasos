package graficos.componentes;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {

		MarcoCentrado miMarco = new MarcoCentrado();

		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		miMarco.setVisible(true);

	}

}

class MarcoCentrado extends JFrame {

	public MarcoCentrado() {

		Toolkit miPantalla = Toolkit.getDefaultToolkit();

		Dimension tamanoPantalla = miPantalla.getScreenSize();

		int altoPantalla = tamanoPantalla.height;

		int anchoPantalla = tamanoPantalla.width;

		setSize(anchoPantalla/2, altoPantalla/2);

		setLocation(anchoPantalla/4, altoPantalla/4);

		setTitle("Marco Centrado");

		Image miIcono = miPantalla.getImage("src/graficos/icon.png");

		setIconImage(miIcono);

	}

}