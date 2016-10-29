package graficos.disposiciones;

import javax.swing.*;
import java.awt.*;

/**
 * Created by User on 19/10/2016.
 */

public class PruebaDisposiciones {

    public static void main(String[] args) {

        MarcoCaja miMarco = new MarcoCaja();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoCaja extends JFrame{

    public MarcoCaja(){

        setBounds(100,100,300,300);
        setTitle("Prueba de disposiciones");

        //add(new LaminaCaja());

        JLabel lblNombre = new JLabel("Nombre:");

        JTextField txfNombre = new JTextField(10);
        txfNombre.setMaximumSize(txfNombre.getPreferredSize());

        Box boxHorizontal1 = Box.createHorizontalBox();

        boxHorizontal1.add(lblNombre);
        boxHorizontal1.add(Box.createHorizontalStrut(10));
        boxHorizontal1.add(txfNombre);

        JLabel lblConstrasena = new JLabel("Contraseña:");
        JTextField txfContrasena = new JTextField(10);
        txfContrasena.setMaximumSize(txfContrasena.getPreferredSize());

        Box boxHorizontal2 = Box.createHorizontalBox();

        boxHorizontal2.add(lblConstrasena);
        boxHorizontal2.add(Box.createHorizontalStrut(10));
        boxHorizontal2.add(txfContrasena);

        JButton btnAceptar = new JButton("Aceptar");
        JButton btnCancelar = new JButton("Cancelar");

        Box boxHorizontal3 = Box.createHorizontalBox();

        boxHorizontal3.add(btnAceptar);
        boxHorizontal3.add(Box.createGlue());
        boxHorizontal3.add(btnCancelar);

        Box boxVerical1 = Box.createVerticalBox();

        boxVerical1.add(boxHorizontal1);
        boxVerical1.add(boxHorizontal2);
        boxVerical1.add(boxHorizontal3);

        add(boxVerical1, BorderLayout.CENTER);

    }

}

class LaminaCaja extends JPanel{

    public LaminaCaja(){

    // Nada...

    }

}