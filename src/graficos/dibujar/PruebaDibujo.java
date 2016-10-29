package graficos.dibujar;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

public class PruebaDibujo {

	public static void main(String[] args) {
		// TODO Apándice de mátodo generado automáticamente

		MarcoConDibujos miMarco = new MarcoConDibujos();

		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConDibujos extends JFrame {

	public MarcoConDibujos() {

		setTitle("Prueba de dibujos");
		setSize(400, 400);

		LaminaConFiguras miLamina = new LaminaConFiguras();
		add(miLamina);

	}

}

class LaminaConFiguras extends JPanel {

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		// ------------------------------------------------

		// g.drawRect(50, 50, 200, 200);

		// g.drawLine(100,100,300,200);

		// g.drawArc(50, 100, 100, 200, 120, 150);

		// ------------------------------------------------

		// Casteo g a Graphics2D
		Graphics2D g2D = (Graphics2D) g;

		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200.25, 150);

		g2D.draw(rectangulo);

		Ellipse2D elipse = new Ellipse2D.Double();

		elipse.setFrame(rectangulo);

		g2D.draw(elipse);

		g2D.draw(new Line2D.Double(100, 100, 300, 250));

		double centroX = rectangulo.getCenterX();
		double centroY = rectangulo.getCenterY();

		double radio = 125;

		Ellipse2D circulo = new Ellipse2D.Double();

		circulo.setFrameFromCenter(centroX, centroY, centroX + radio, centroY + radio);

		g2D.draw(circulo);

	}

}