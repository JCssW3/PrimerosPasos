package graficos.componentes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploArea {

    public static void main(String[] args){

        MarcoArea miMarco = new MarcoArea();

    }

}

class MarcoArea extends JFrame{

    public MarcoArea(){

        setBounds(100,100,400,300);
        setTitle("Prueba TextArea");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new LaminaArea());

        setVisible(true);

    }

}

class LaminaArea extends JPanel{

    private JTextArea miTexto;

    public LaminaArea(){

        miTexto = new JTextArea(8,20);
        JScrollPane laminaBarras = new JScrollPane(miTexto);

        miTexto.setLineWrap(true);
        add(laminaBarras);

        JButton miBoton = new JButton("Dale");
        miBoton.addActionListener(new GestionaArea());
        add(miBoton);

    }

    private class GestionaArea implements ActionListener{

        public void actionPerformed(ActionEvent e){

            System.out.println(miTexto.getText());

        }

    }

}