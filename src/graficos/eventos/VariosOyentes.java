package graficos.eventos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VariosOyentes {

    public static void main(String[] args) {

        MarcoPrincipal miMarco = new MarcoPrincipal();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoPrincipal extends JFrame {

    public MarcoPrincipal() {

        setBounds(100, 100, 400, 400);
        setTitle("Varios Oyentes");

        LaminaPrincipal miLamina = new LaminaPrincipal();
        add(miLamina);

        setVisible(true);

    }

}

class LaminaPrincipal extends JPanel {

    // Se declara fuera del constructor porque se
    // utilizará en varios métodos
    JButton btnCerrarVentanas;

    public LaminaPrincipal() {

        JButton btnVentana = new JButton("Nueva Ventana");
        btnCerrarVentanas = new JButton("Cerrar Ventanas");

        add(btnVentana);
        add(btnCerrarVentanas);

        OyenteNuevo miOyente = new OyenteNuevo();

        btnVentana.addActionListener(miOyente);

    }

    private class OyenteNuevo implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            MarcoEmergente marco = new MarcoEmergente(btnCerrarVentanas);

            marco.setVisible(true);

        }

    }

}

class MarcoEmergente extends JFrame {

    private static int contador;

    public MarcoEmergente(JButton botonDePrincipal) {

        contador++;

        setTitle("Ventana " + contador);

        setBounds(40 * contador, 40 * contador, 300, 150);

        CierraTodos cerrar = new CierraTodos();

        botonDePrincipal.addActionListener(cerrar);

    }

    private class CierraTodos implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            // dispose elimina la ventana y todos sus componentes de la JVM
            // devolviendo la memoria de vuelta al Sistema Operativo
            dispose();
            contador = 0;
        }

    }

}