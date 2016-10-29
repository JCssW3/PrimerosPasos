package graficos.disposiciones;

import javax.swing.*;
import java.awt.*;

/**
 * Created by User on 22/10/2016.
 */
public class LibreDisposicion {

    public static void main(String[] args) {

        MarcoLibre miMarco = new MarcoLibre();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoLibre extends JFrame {

    public MarcoLibre() {

        setBounds(100, 100, 300, 400);
        setTitle("Marco con disposición libre");

        add(new LaminaLibre());

        setVisible(true);

    }

}

class LaminaLibre extends JPanel {

    public LaminaLibre() {

        setLayout(new EnColumnas());

        JLabel lblNombre = new JLabel("Nombre: ");
        JLabel lblApellido = new JLabel("Apellido:");
        JLabel lblEdad = new JLabel("Edad:");
        JLabel lblTelefono = new JLabel("Telefono:");

        JTextField txfNombre = new JTextField();
        JTextField txfApellido = new JTextField();
        JTextField txfEdad = new JTextField();
        JTextField txfTelefono = new JTextField();

        /* lblNombre.setBounds(20,15,80,15);
        txfNombre.setBounds(100,15,100,20);

        lblApellido.setBounds(20,55,80,15);
        txfApellido.setBounds(100,55,100,20); */

        add(lblNombre);
        add(txfNombre);
        add(lblApellido);
        add(txfApellido);
        add(lblEdad);
        add(txfEdad);
        add(lblTelefono);
        add(txfTelefono);

    }

}

class EnColumnas implements LayoutManager {

    @Override
    public void addLayoutComponent(String name, Component comp) {

    }

    @Override
    public void removeLayoutComponent(Component comp) {

    }

    @Override
    public Dimension preferredLayoutSize(Container parent) {
        return null;
    }

    @Override
    public Dimension minimumLayoutSize(Container parent) {
        return null;
    }

    @Override
    public void layoutContainer(Container parent) {

        int y = 20;
        int contador = 0;

        int w = parent.getWidth();
        int x = w/2;

        int n = parent.getComponentCount();

        for (Component c : parent.getComponents()) {

            contador++;
            c.setBounds(x-100, y, 100, 20);
            x+=100;

            if(contador % 2 == 0){
                x=w/2;
                y+=40;
            }

        }

    }

}