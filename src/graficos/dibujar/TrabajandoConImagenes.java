package graficos.dibujar;

import java.awt.*;
import java.io.*;

import javax.swing.*;

import javax.imageio.*;

public class TrabajandoConImagenes {

    public static void main(String[] args) {
        // TODO Apándice de mátodo generado automáticamente

        MarcoConImagenes miMarco = new MarcoConImagenes();

        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoConImagenes extends JFrame {

    public MarcoConImagenes() {

        setTitle("Imágenes");
        setSize(400, 400);

        LaminaConImagenes miLamina = new LaminaConImagenes();

        add(miLamina);

    }

}

class LaminaConImagenes extends JPanel {

    private Image imagen;

    public LaminaConImagenes(){

        // File miImagen = new File("src/graficos/card.png");

        try {
            imagen = ImageIO.read(new File("src/graficos/icon.png"));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "La imagen no se encuentra, " + e);
            //System.exit(0);
        }

    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2D = (Graphics2D) g;

        g.drawImage(imagen, 0, 0, null);

        // g.copyArea(0,0,imagen.getWidth(null),imagen.getHeight(null),150,75);

        int altoImagen = imagen.getHeight(this);
        int anchoImagen = imagen.getWidth(this);

        for (int i = 1; i < 200; i+=anchoImagen) {
            for (int j = 1; j < 200; j+=altoImagen) {

                g.copyArea(0, 0, anchoImagen, altoImagen, i, j);

            }

        }

    }

}