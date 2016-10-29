package graficos.componentes;

import javax.swing.*;

public class SintaxisRadio {

    public static void main (String[] args){

        MarcoRadioSintaxis miMarco = new MarcoRadioSintaxis();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

}

class MarcoRadioSintaxis extends JFrame{

    public MarcoRadioSintaxis(){

        setBounds(100,100,400,300);
        setTitle("Prueba de sintaxis de JRadioButton");

        add(new LaminaRadioSintaxis());

        setVisible(true);
    }

}

class LaminaRadioSintaxis extends JPanel{

    public LaminaRadioSintaxis(){

        ButtonGroup miGrupo = new ButtonGroup();
        ButtonGroup miGrupo2 = new ButtonGroup();

        JRadioButton opcion1 = new JRadioButton("Azul", false);
        JRadioButton opcion2 = new JRadioButton("Rojo", true);
        JRadioButton opcion3 = new JRadioButton("Amarillo", false);
        JRadioButton opcion4 = new JRadioButton("Masculino", false);
        JRadioButton opcion5 = new JRadioButton("Femenino", false);

        miGrupo.add(opcion1);
        miGrupo.add(opcion2);
        miGrupo.add(opcion3);

        miGrupo2.add(opcion4);
        miGrupo2.add(opcion5);

        add(opcion1);
        add(opcion2);
        add(opcion3);

        add(opcion4);
        add(opcion5);
    }

}