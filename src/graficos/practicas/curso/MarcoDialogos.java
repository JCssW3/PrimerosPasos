package graficos.practicas.curso;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.util.Date;

/**
 * Created by User on 7/11/2016.
 */
public class MarcoDialogos extends JFrame {

    private LaminaBotones laminaTipo,
            laminaTipoMensaje,
            laminaMensaje,
            laminaConfirmar,
            laminaOpcion,
            laminaEntrada;

    private String cadenaMensaje = "Mensaje";
    private Icon iconoMensaje = new ImageIcon("src/graficos/iconos/icon.png");
    private Object objectoMensaje = new Date();
    private Component componenteMensaje = new laminaEjemplo();

    public MarcoDialogos() {

        setTitle("Prueba de dialogos");
        setBounds(500, 300, 600, 450);

        JPanel laminaCuadricula = new JPanel(new GridLayout(2, 3));

        laminaTipo = new LaminaBotones("Tipo:", new String[]{
                "Mensaje",
                "Confirmar",
                "Opción",
                "Entrada"
        });

        laminaTipoMensaje = new LaminaBotones("Tipo de Mensaje:", new String[]{
                "ERROR_MESSAGE",
                "INFORMATION_MESSAGE",
                "WARNING_MESSAGE",
                "QUESTION_MESSAGE",
                "PLAIN_MESSAGE"
        });

        laminaMensaje = new LaminaBotones("Mensaje:", new String[]{
                "Cadena",
                "Icono",
                "Componente",
                "Otros",
                "Object[]"
        });

        laminaConfirmar = new LaminaBotones("Confirmar:", new String[]{
                "DEFAULT_OPTION",
                "YES_NO_OPTION",
                "YES_NO_CANCEL_OPTION",
                "OK_CANCEL_OPTION"
        });

        laminaOpcion = new LaminaBotones("Opción:", new String[]{
                "String[]",
                "Icon[]",
                "Object[]"
        });

        laminaEntrada = new LaminaBotones("Entrada:", new String[]{
                "Campo de texto",
                "Combo"
        });

        setLayout(new BorderLayout());

        laminaCuadricula.add(laminaTipo);
        laminaCuadricula.add(laminaTipoMensaje);
        laminaCuadricula.add(laminaMensaje);
        laminaCuadricula.add(laminaConfirmar);
        laminaCuadricula.add(laminaOpcion);
        laminaCuadricula.add(laminaEntrada);

        // Construimos la lamina inferior
        JPanel laminaMostrar = new JPanel();
        JButton botonMostrar = new JButton("Mostrar");
        botonMostrar.addActionListener(new AccionMostrar());
        laminaMostrar.add(botonMostrar);

        add(laminaCuadricula, BorderLayout.CENTER);
        add(laminaMostrar, BorderLayout.SOUTH);

    }

    private Object dameMensaje() {

        String s = laminaMensaje.dameSeleccion();

        switch (s) {
            case "Icono":
                return iconoMensaje;
            case "Componente":
                return componenteMensaje;
            case "Otros":
                return objectoMensaje;
            case "Object[]":
                return new Object[]{
                        cadenaMensaje,
                        iconoMensaje,
                        componenteMensaje,
                        objectoMensaje};
            case "Cadena":
            default:
                return cadenaMensaje;
        }

    }

    private int dameIcono() {

        String s = laminaTipoMensaje.dameSeleccion();

        switch (s) {
            case "ERROR_MESSAGE":
                return JOptionPane.ERROR_MESSAGE;
            case "INFORMATION_MESSAGE":
                return JOptionPane.INFORMATION_MESSAGE;
            case "WARNING_MESSAGE":
                return JOptionPane.WARNING_MESSAGE;
            case "QUESTION_MESSAGE":
                return JOptionPane.QUESTION_MESSAGE;
            case "PLAIN_MESSAGE":
            default:
                return JOptionPane.PLAIN_MESSAGE;
        }

    }

    private int dameConfirmar() {
        String s = laminaConfirmar.dameSeleccion();

        switch (s) {
            case "YES_NO_OPTION":
                return JOptionPane.YES_NO_OPTION;
            case "YES_NO_CANCEL_OPTION":
                return JOptionPane.YES_NO_CANCEL_OPTION;
            case "OK_CANCEL_OPTION":
                return JOptionPane.OK_CANCEL_OPTION;
            case "DEFAULT_OPTION":
            default:
                return JOptionPane.DEFAULT_OPTION;
        }

    }

    private class AccionMostrar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // System.out.println(laminaTipo.dameSeleccion());

            switch (laminaTipo.dameSeleccion()) {
                case "Mensaje":
                    JOptionPane.showMessageDialog(MarcoDialogos.this, dameMensaje(), "Título", dameIcono());
                    break;
                case "Confirmar":
                    JOptionPane.showConfirmDialog(MarcoDialogos.this, dameMensaje(), "Titulo", dameConfirmar(), dameIcono());
                    break;
                case "Opción":
                    JOptionPane.showOptionDialog(MarcoDialogos.this, dameMensaje(), "Titulo", dameConfirmar(), dameIcono(), null, null, null);
                    break;
                case "Entrada":
                    JOptionPane.showInputDialog(MarcoDialogos.this, dameMensaje(), "Titulo", dameIcono());
                    break;
            }

        }

    }

}

class laminaEjemplo extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D rectangulo = new Rectangle2D.Double(0, 0, getWidth(), getHeight());
        g2.setPaint(Color.YELLOW);
        g2.fill(rectangulo);
    }

}