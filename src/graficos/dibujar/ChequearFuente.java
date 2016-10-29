package graficos.dibujar;

import java.awt.GraphicsEnvironment;

import javax.swing.JOptionPane;

public class ChequearFuente {

	public static void main(String[] args) {
		// TODO Apándice de mátodo generado automáticamente

		String fuente = JOptionPane.showInputDialog("Introduce fuente");

		boolean estaFuente = false;

		String[] nombresFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

		for(String font : nombresFuentes){

			if(font.equalsIgnoreCase(fuente)){
				estaFuente = true;
			}

		}

		if(estaFuente){
			System.out.println("Fuente instalada");
		} else {
			System.out.println("No est� instalada la fuente");
		}


	}

}
