package graficos.eventos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PruebaEventos {

    public static void main(String[] args) {

        MarcoConBotones miMarco = new MarcoConBotones();

        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoConBotones extends JFrame {

    public MarcoConBotones() {

        setTitle("Botones y Eventos");
        setBounds(700, 300, 500, 300);

        LaminaConBotones miLamina = new LaminaConBotones();

        add(miLamina);

    }

}

class LaminaConBotones extends JPanel {

    JButton botonAzul = new JButton("Azul");
    JButton botonAmarillo = new JButton("Amarillo");
    JButton botonRojo = new JButton("Rojo");

    public LaminaConBotones() {

        // Objeto fuente: botonAzul
        // Objeto evento: botonAzul.addActionListener
        // Objeto listener: LaminaConBotones que implementa ActionListener

        add(botonAzul);
        add(botonAmarillo);
        add(botonRojo);

        ColorFondo amarillo = new ColorFondo(Color.YELLOW);
        ColorFondo azul = new ColorFondo(Color.BLUE);
        ColorFondo rojo = new ColorFondo(Color.RED);

        botonAzul.addActionListener(azul);
        botonAmarillo.addActionListener(amarillo);
        botonRojo.addActionListener(rojo);

    }

    private class ColorFondo implements ActionListener {

        private Color colorDeFondo;

        public ColorFondo(Color c) {

            colorDeFondo = c;

        }

        @Override
        public void actionPerformed(ActionEvent e) {

            setBackground(colorDeFondo);

        }
    }

}

