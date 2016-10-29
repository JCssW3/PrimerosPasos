package graficos.eventos;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class EventosVentana {

    public static void main(String[] args) {

        MarcoVentana miMarco = new MarcoVentana();
        MarcoVentana miMarco2 = new MarcoVentana();

        miMarco.setTitle("Ventana #1");
        miMarco2.setTitle("Ventana #2");

        miMarco.setBounds(300, 300, 500, 350);
        miMarco2.setBounds(900, 300, 500, 350);

        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

}

class MarcoVentana extends JFrame {

    public MarcoVentana() {

        // setTitle("Botones y Eventos");
        // setBounds(700, 300, 500, 300);
        setVisible(true);

        // MVentana oyenteVentana = new MVentana();
        // this.addWindowListener(oyenteVentana);

        addWindowListener(new MVentana());

    }

}

class MVentana extends WindowAdapter {

    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana minimizada");
    }

}