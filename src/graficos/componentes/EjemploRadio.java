package graficos.componentes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploRadio {

    public static void main(String[] args) {

        MarcoRadio miMarco = new MarcoRadio();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoRadio extends JFrame {

    public MarcoRadio() {

        setBounds(100, 100, 400, 300);
        setTitle("Ejemplo Radio Button");

        add(new LaminaRadio());

        setVisible(true);

    }

}

class LaminaRadio extends JPanel {

    private JLabel texto;
    private ButtonGroup miGrupo;
    private JPanel LaminaBotones;

    public LaminaRadio() {

        setLayout(new BorderLayout());

        texto = new JLabel("En un lugar de la Mancha de cuyo nombre...");

        texto.setFont(new Font("Serif", Font.PLAIN, 12));

        add(texto, BorderLayout.CENTER);

        // Si no se inicializa un objeto, Java arroja NullPointerException
        miGrupo = new ButtonGroup();

        LaminaBotones = new JPanel();

        colocarBotones("Pequeño", false, 10);
        colocarBotones("Mediano", true, 12);
        colocarBotones("Grande", false, 18);
        colocarBotones("Muy grande", false, 24);

        add(LaminaBotones, BorderLayout.SOUTH);

    }

    public void colocarBotones(String nombre, boolean seleccionado, final int tamano) {

        JRadioButton boton = new JRadioButton(nombre, seleccionado);

        miGrupo.add(boton);

        LaminaBotones.add(boton);

        ActionListener miEvento = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setFont(new Font("Serif", Font.PLAIN, tamano));
            }
        };

        boton.addActionListener(miEvento);
    }


}

/* La manera más común de plantear el ejercicio

package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploRadio {

    public static void main(String[] args){

        MarcoRadio miMarco = new MarcoRadio();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoRadio extends JFrame{

    public MarcoRadio(){

        setBounds(100,100,400,300);
        setTitle("Ejemplo Radio Button");

        add(new LaminaRadio());

        setVisible(true);

    }

}

class LaminaRadio extends JPanel{

    private JLabel texto;
    private JRadioButton boton1, boton2, boton3, boton4;

    public LaminaRadio(){

        setLayout(new BorderLayout());

        texto = new JLabel("En un lugar de la Mancha de cuyo nombre...");

        add(texto, BorderLayout.CENTER);

        ButtonGroup miGrupo = new ButtonGroup();

        boton1 = new JRadioButton("Pequeño", false);
        boton2 = new JRadioButton("Mediano", true);
        boton3 = new JRadioButton("Grande", false);
        boton4 = new JRadioButton("Muy Grande", false);

        JPanel laminaRadio = new JPanel();

        EventoRadio miEvento = new EventoRadio();

        boton1.addActionListener(miEvento);
        boton2.addActionListener(miEvento);
        boton3.addActionListener(miEvento);
        boton4.addActionListener(miEvento);

        miGrupo.add(boton1);
        miGrupo.add(boton2);
        miGrupo.add(boton3);
        miGrupo.add(boton4);

        laminaRadio.add(boton1);
        laminaRadio.add(boton2);
        laminaRadio.add(boton3);
        laminaRadio.add(boton4);

        add(laminaRadio, BorderLayout.SOUTH);

    }

    private class EventoRadio implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            if(e.getSource() == boton1){
               // System.out.println("Haz pulsado el botón 1");
                texto.setFont(new Font("Serif", Font.PLAIN, 10));
            } else if(e.getSource() == boton2){
                texto.setFont(new Font("Serif", Font.PLAIN, 12));
            } else if (e.getSource() == boton3){
                texto.setFont(new Font("Serif", Font.PLAIN, 18));
            } else if (e.getSource() == boton4)
                texto.setFont(new Font("Serif", Font.PLAIN, 24));
            }

        }
    }

}

*/