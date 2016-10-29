package graficos.componentes;

import javax.swing.*;
import java.awt.*;

public class PruebaSpinner{

    public static void main(String[] args) {

        MarcoSpinner miMarco = new MarcoSpinner();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}


class MarcoSpinner extends JFrame{

    public MarcoSpinner(){

        setBounds(100,100,400,300);
        setTitle("Prueba Spinner");

        add(new LaminaSpinner());

        setVisible(true);

    }

}

class LaminaSpinner extends JPanel {

    private JSpinner control;

    public LaminaSpinner() {

        // Atención el JSpinner coloca el ancho del primer elemento
        // --------------------------------------------------------
        // JSpinner control = new JSpinner();
        // JSpinner control = new JSpinner(new SpinnerDateModel());

        // Coloca las fuentes en el array listas
        // String lista[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        // Por otro lado tiene por defecto la alineación "derecha"
        // JSpinner control = new JSpinner(new SpinnerListModel(lista));

        // Se le dice al JSpinner en numero por defecto, el limite inferior, el superior y el incremento
        // JSpinner control = new JSpinner(new SpinnerNumberModel(5,0,10,1));

        // Este instanciación se usaria en el caso de crear la clase interna
        // JSpinner control = new JSpinner(new MiModeloSpinner());

        // Esta instanciación hace uso de las llamadas "Clases anónimas"!!
        JSpinner control = new JSpinner(new SpinnerNumberModel(5,0,10,1)){

            public Object getNextValue(){
                return super.getPreviousValue();
            }

            public Object getPreviousValue(){
                return super.getNextValue();
            }

        };

        control.setPreferredSize(new Dimension(200, 20));

        add(control);

    }


    // Con esta clase se pretende invertir el comportamiento de los botones
    // del JSpinner por defecto

    /*
    private class MiModeloSpinner extends SpinnerNumberModel{

        public MiModeloSpinner(){
            super(5,0,10,1);
        }

        // Invierte el orden
        public Object getNextValue(){
            return super.getPreviousValue();
        }

        // Invierte el orden
        public Object getPreviousValue(){
            return super.getNextValue();
        }

    } */

}