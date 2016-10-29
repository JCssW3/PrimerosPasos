package graficos.eventos;

import javax.swing.*;
import java.awt.event.*;

public class EventosRaton {

    public static void main(String[] args) {

        MarcoRaton miMarco = new MarcoRaton();

        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoRaton extends JFrame {

    public MarcoRaton() {

        setVisible(true);

        setBounds(300, 300, 600, 450);

        addMouseListener(new EventoDeRaton());
        addMouseMotionListener(new EventoDeRaton());

    }

}

class EventoDeRaton extends MouseAdapter implements MouseMotionListener{

    /*
    @Override
    public void mouseClicked(MouseEvent e) {
        //System.out.println("Coordenada X: " + e.getX() + " Coordenada Y: " + e.getY());
        System.out.println(e.getClickCount());
    }*/

    @Override
    public void mousePressed(MouseEvent e) {

        // e.getModifiersEx():
        // Devuelve el valor de la constante de los modificadores
        // Botón Izquierdo del ratón -> BUTTON1_DOWN_MASK -> 1024
        // Rueda del ratón -> BUTTON2_DOWN_MASK -> 2048
        // Botón Derecho del ratón -> BUTTON3_DOWN_MASK -> 4096

        if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
            System.out.println("Has pulsado el botón izquierdo");
        } else if (e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK) {
            System.out.println("Has pulsado rueda del ratón");
        } else if (e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK) {
            System.out.println("Has pulsado el botón derecho");
        }
    }

    @Override
    public void mouseDragged(MouseEvent e){
        System.out.println("Estás arrastrando el mouse");
    }

    @Override
    public void mouseMoved(MouseEvent e){
        System.out.println("Estás moviendo el mouse");
    }
}

/*
class EventoDeRaton implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Has hecho click");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Acabas de presionar");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Acabas de levantar");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Acabas de entrar");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Acabas de salir");
    }
}*/
