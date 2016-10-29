package graficos.dibujar;

import java.awt.*;

import javax.swing.*;

public class TrabajandoConFuentes{

	public static void main(String[] args) {
		// TODO Apándice de mátodo generado automáticamente

		MarcoConFuentes miMarco = new MarcoConFuentes();

		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConFuentes extends JFrame {

	public MarcoConFuentes() {

		setTitle("Fuentes");
		setSize(400, 400);

		LaminaConFuentes miLamina = new LaminaConFuentes();
		
		add(miLamina);

		miLamina.setForeground(Color.BLUE);

	}

}

class LaminaConFuentes extends JPanel {

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2D = (Graphics2D) g;

		Font miFuente = new Font("Arial", Font.BOLD, 26);
		
		g2D.setFont(miFuente);
		
		// g2D.setPaint(Color.BLUE);
		
		g2D.drawString("Juan Cruz", 100, 100);
		
		g2D.setFont(new Font("Courier", Font.ITALIC, 24));
		
		// g2D.setColor(new Color(128,90,50).brighter());
		
		g2D.drawString("Curso de Java", 100, 200);

	}

}