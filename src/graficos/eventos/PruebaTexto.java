package graficos.eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PruebaTexto {

    public static void main( String[] args){

        MarcoTexto miMarco = new MarcoTexto();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        miMarco.setVisible(true);

    }

}

class MarcoTexto extends JFrame{

    public MarcoTexto(){

        setBounds(100,100,400,300);
        setTitle("Prueba de textos");

        add(new LaminaTexto());

    }

}

class LaminaTexto extends JPanel {

    JTextField campo1;
    JLabel resultado;

    public LaminaTexto(){

        setLayout(new BorderLayout());

        // Creo y establezco el panel con un layout
        // del tipo flowlayout, y lo coloco en la
        // zona norte del panel contenedor
        JPanel miLamina2 = new JPanel();
        miLamina2.setLayout(new FlowLayout());
        add(miLamina2, BorderLayout.NORTH);

        // Creo una etiqueta
        JLabel texto1 = new JLabel("E-mail:");
        miLamina2.add(texto1);

        // Creo un campo de texto
        campo1 = new JTextField(20);
        miLamina2.add(campo1);

        // Creo un botón
        JButton miBoton = new JButton("Dale");
        miLamina2.add(miBoton);

        // Creo un label para el resultado de la
        // comprobación, lo centro y lo coloco en
        // en el centro del panel contenedor
        resultado = new JLabel("",JLabel.CENTER);
        add(resultado, BorderLayout.CENTER);

        // Creo una acción, y la llamo comprobar
        DameTexto comprobar = new DameTexto();

        // Pongo el boton a la escucha
        miBoton.addActionListener(comprobar);

        // Cuando se presione la tecla enter, le asigno el nombre
        // "enter" a la combinación
        InputMap enter = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        enter.put(KeyStroke.getKeyStroke("ENTER"), "enter");

        // Si se pulso la combinación llamada "enter", llamo
        // a la acción comprobar
        ActionMap mapa = getActionMap();
        mapa.put("enter", comprobar);

    }

    private class DameTexto extends AbstractAction{

        public void actionPerformed(ActionEvent e){

            int correcto = 0;

            String email = campo1.getText().trim();

            for(char c : email.toCharArray()){

                if(c == '@'){
                    correcto++;
                }

            }

            if(correcto != 1) {
                campo1.setBackground(new Color(232, 124, 117));
                resultado.setText("E-mail incorrecto");
            } else {
                campo1.setBackground(new Color(171,250, 131));
                resultado.setText("E-mail correcto");
            }

        }
    }

}