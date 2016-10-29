package graficos.dibujar;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

public class PruebaDibujo2 {

	public static void main(String[] args) {
		// TODO Apándice de mátodo generado automáticamente

		MarcoConDibujos2 miMarco = new MarcoConDibujos2();

		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConDibujos2 extends JFrame {

	public MarcoConDibujos2() {

		setTitle("Prueba de dibujos");
		setSize(400, 400);

		LaminaConFiguras2 miLamina = new LaminaConFiguras2();
		add(miLamina);

		miLamina.setBackground(SystemColor.window);

	}

}

class LaminaConFiguras2 extends JPanel {

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		// Casteo g a Graphics2D
		Graphics2D g2D = (Graphics2D) g;

		// Dibujo el rectángulo

		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200.25, 150);

		g2D.setPaint(Color.BLUE);
		g2D.draw(rectangulo);
		
		g2D.setPaint(Color.RED);
		g2D.fill(rectangulo);

		// Dibujo la elipse

		Ellipse2D elipse = new Ellipse2D.Double();

		elipse.setFrame(rectangulo);

		Color miColor = new Color(125,189,200);

		g2D.setPaint(miColor);

		// g2D.setPaint(new Color(109,172,59));

		g2D.fill(elipse);

	}

}