package graficos.dibujar;

import java.awt.*;
import javax.swing.*;

public class EscribiendoEnMarco {

	public static void main(String[] args) {

		MarcoConTexto miMarco = new MarcoConTexto();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoConTexto extends JFrame {

	public MarcoConTexto() {

		setVisible(true);
		setSize(600, 450);
		setLocation(400, 200);
		setTitle("Primer texto");
		
		Lamina miLamina = new Lamina();
		
		add(miLamina);
		
	}

}

class Lamina extends JPanel{
	
	@Override
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		g.drawString("Estamos aprendiendo swing", 100, 100);
		
	}
	
}